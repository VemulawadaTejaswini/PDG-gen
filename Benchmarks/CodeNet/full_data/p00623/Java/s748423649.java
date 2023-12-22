import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Problem C: Midnight Teatime
 */
public class Main {

	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("END")) {

			Stack<Byte> exp = new Stack<Byte>();
			Stack<Byte> oper = new Stack<Byte>();
			String linex = line;

			for (char c : line.toCharArray()) {
				if (c == ' ') {
					oper.push((byte) 0);
				} else if (c >= '1' && c <= '9') {
					exp.push((byte) ((c - '0') * -1));
				} else if (c == ')') {
					exp.push(oper.pop());
				}
			}

			//
			int n = Integer.parseInt(br.readLine());
			for (int i = 1; i < n + 1; i++) {
				byte b = stob(line = br.readLine());
				for (int j = 0; j < exp.size(); j++) {
					if (exp.get(j).intValue() == i * -1) {
						exp.setElementAt(Byte.valueOf(b), j);
					}
				}
			}

			//
			count = 0;
			ArrayList<Byte> idx = new ArrayList<Byte>();
			for (byte i = 0; i < exp.size(); i++) {
				if (exp.get(i).intValue() == 0) {
					idx.add(i);
				}
			}
			try {
				solve(0, idx, exp, (byte) -1);
				solve(0, idx, exp, (byte) -2);
				solve(0, idx, exp, (byte) -3);
				System.out.println(count);
			} catch (EmptyStackException e) {
				System.err.println(linex);
			}

		}
	}

	static byte answer(Stack<Byte> exp) {
		Stack<Byte> ans = new Stack<Byte>();
		byte b1, b2;
		for (int i = 0; i < exp.size(); i++) {
			if (exp.get(i) > 0) {
				ans.push(exp.get(i));
			} else {
				b2 = ans.pop();
				b1 = ans.pop();
				switch ((int) exp.get(i)) {
				case -1:
					ans.push((byte) (b1 & b2));
					break;
				case -2:
					ans.push((byte) (b1 | b2));
					break;
				case -3:
					ans.push((byte) (b1 ^ b2));
					break;
				}
			}
		}
		return (byte) ans.pop();
	}

	static byte stob(String str) {
		byte b = 0;
		for (int j = 0; j < 7; j += 2) {
			if (str.charAt(j) == '1') {
				b += 1 << j / 2;
			}
		}
		return b;
	}

	static void solve(int p, ArrayList<Byte> idx, Stack<Byte> exp, byte op) {
		if (p < idx.size()) {
			exp.setElementAt(Byte.valueOf(op), idx.get(p));
			if (p == idx.size() - 1) {
				if (answer(exp) == 15) {
					count++;
				}
			}
			solve(p + 1, idx, exp, (byte) -1);
			solve(p + 1, idx, exp, (byte) -2);
			solve(p + 1, idx, exp, (byte) -3);
		} else {
			return;
		}
	}
}