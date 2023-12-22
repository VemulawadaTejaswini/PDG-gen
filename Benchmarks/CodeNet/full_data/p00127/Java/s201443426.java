
import static java.util.Arrays.deepToString;
import static java.util.Arrays.fill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		for (;sc.hasNext();) {
			String s = sc.next();
			String ans;
			try {
				ans = decode(s.toCharArray());
			} catch (Exception e) {
				ans = "NA";
			}
			System.out.println(ans);
		}
	}

	char[][] tbl = {
		"afkpuz".toCharArray(),
		"bglqv.".toCharArray(),
		"chmrw?".toCharArray(),
		"dinsx!".toCharArray(),
		"ejoty ".toCharArray(),
	};
	String decode(char[] s) {
		if (s.length % 2 == 1) throw new IllegalArgumentException();
		char[] buf = new char[s.length / 2];
		for (int i = 0; i < s.length; i += 2) {
			int i1 = s[i] - '1';
			int i2 = s[i+1] - '1';
			buf[i/2] = tbl[i2][i1];
		}
		return new String(buf);
	}
}