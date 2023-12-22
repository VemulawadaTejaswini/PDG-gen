import static java.lang.Math.*;
import static java.util.Arrays.*;
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("src/aoj1173/input.txt"));
			//System.setOut(new PrintStream(new FileOutputStream("src/aoj1172/result.txt")));
		} catch (FileNotFoundException e) {
		}
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			if (line.equals(".")) break;

			if (solve(line))
				System.out.println("yes");
			else
				System.out.println("no");

		}
	}

	boolean solve(String line) {
		char[] str = new char[line.length()];
		int len = 0;
		for (int i = 0; i < line.length(); i++) {
			char cur = line.charAt(i);
			if (cur == '[' || cur == ']' || cur == '(' || cur == ')') {
				if (len == 0) {
					str[len++] = cur;
				} else {
					char last = str[len - 1];
					if ((last == '[' && cur == ']') || (last == '(' && cur == ')')) {
						len--;
					} else {
						str[len++] = cur;
					}
				}
			}
		}
		return len == 0;
	}

	void tr(Object... os) {
		System.err.println(deepToString(os));
	}
}