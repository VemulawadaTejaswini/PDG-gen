import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N;
	int X;
	String xStr;
	Map<Integer, Integer> fMemo, popCount;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		xStr = in.readLine();
		X = Integer.parseInt(xStr, 2);
		fMemo = new HashMap<>();
		popCount = new HashMap<>();
	}

	int f(int val) {

		if (fMemo.containsKey(val)) {
			return fMemo.get(val);
		}
		int p = -1;
		if (popCount.containsKey(val)) {
			p = popCount.get(val);
		} else {
			p = popCount(val);
			popCount.put(val, p);
		}
		int mod = val % p;
		if (mod == 0) {
			fMemo.put(val, 1);
			return 1;
		} else {
			int result = f(mod) + 1;
			fMemo.put(val, result);
			return result;
		}
	}

	int popCount(int val) {
		String s = Integer.toString(val, 2);
		int count = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '1') {
				++count;
			}
		}
		return count;
	}

	int getVal(char[] chars, int index) {
		char[] c = Arrays.copyOf(chars, chars.length);
		if (c[index] == '0') {
			c[index] = '1';
		} else {
			c[index] = '0';
		}
		String str = new String(c);
		return Integer.parseInt(str, 2);
	}

	void calc() {
		char[] chars = xStr.toCharArray();
		for (int i = 0; i < xStr.length(); ++i) {
			int val = getVal(chars, i);
			System.out.println(f(val));
		}

	}

	void showResult() {
	}
}