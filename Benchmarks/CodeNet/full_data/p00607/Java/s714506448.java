
import java.io.*;

import java.util.*;
import java.math.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
import static java.lang.Character.*;

class AOJ1021 {
	public void run() {
		Scanner sc = new Scanner(System.in);
		// while (sc.hasNext()) {
		List<StringBuilder> lb = new ArrayList<StringBuilder>();
		while (true) {
			String s = sc.nextLine();
			if (s.equals("END_OF_TEXT"))
				break;
			lb.add(new StringBuilder(s));
		}
		int cur = 0, line = 0;
		StringBuilder buf = new StringBuilder();
		loop: while (true) {
			char c = sc.nextLine().charAt(0);
			switch (c) {
			case '-':
				break loop;
			case 'a':
				cur = 0;
				break;
			case 'e':
				cur = lb.get(line).length();
				break;
			case 'p':
				cur = 0;
				line = max(line - 1, 0);
				break;
			case 'n':
				cur = 0;
				line = min(line + 1, lb.size() - 1);
				break;
			case 'f':
				if (cur < lb.get(line).length())
					cur++;
				else if (line < lb.size() - 1) {
					cur = 0;
					line++;
				}
				break;
			case 'b':
				if (cur > 0)
					cur--;
				else if (line > 0) {
					line--;
					cur = lb.get(line).length();
				}
				break;
			case 'd':
				if (cur < lb.get(line).length())
					lb.get(line).deleteCharAt(cur);
				else if (line < lb.size() - 1) {
					lb.get(line).append(lb.get(line + 1));
					lb.remove(line + 1);
				}
				break;
			case 'k':
				if (cur < lb.get(line).length()) {
					buf = new StringBuilder(lb.get(line).substring(cur));
					lb.get(line).delete(cur, lb.get(line).length());
				} else if (line < lb.size() - 1) {
					lb.get(line).append(lb.get(line + 1));
					lb.remove(line);
					buf = null;
				}
				break;
			case 'y':
				if (buf == null) {
					if (cur < lb.get(line).length()) {
						lb.add(line + 1, new StringBuilder(lb.get(line).substring(cur)));
						lb.get(line).delete(cur, lb.get(line).length());
					} else {
						lb.add(line + 1, new StringBuilder());
					}
					line++;
					cur = 0;
				} else {
					lb.get(line).insert(cur, buf);
					cur += buf.length();
				}
				break;
			}
		}
		for (StringBuilder sb : lb)
			System.out.println(sb);
		// }
	}
}

public class Main {
	public static void main(String... args) {
		new AOJ1021().run();
	}

	public static void debug(Object... os) {
		System.err.println(java.util.Arrays.deepToString(os));
	}
}

class Scanner {
	final java.util.Scanner sc;

	public double nextDouble() {
		return Double.parseDouble(sc.next());
	}

	public Scanner(java.io.InputStream is) {
		this.sc = new java.util.Scanner(is);
	}

	public boolean hasNext() {
		return sc.hasNext();
	}

	public String next() {
		return sc.next();
	}

	public int nextInt() {
		return Integer.parseInt(sc.next());
	}

	public String nextLine() {
		return sc.nextLine();
	}

	public long nextLong() {
		return Long.parseLong(sc.next());
	}
}