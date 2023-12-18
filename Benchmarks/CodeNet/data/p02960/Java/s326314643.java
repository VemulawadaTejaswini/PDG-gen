
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		System.out.println(solve(s));
	}

	private static long solve(String s) {
		long[] r = new long[13];
		long[] r1 = new long[13];
		long[] r2 = new long[13];
		if (s.charAt(0) == '?')
			for (int i = 0; i < 10; i++)
				r[i] = 1;
		else
			r[s.charAt(0) - '0'] = 1;

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '?') {
				shift(r, r1, 0);
				r2 = r1.clone();
				for (int j = 1; j < 10; j++) {
					shift(r, r1, j);
					for (int k = 0; k < 13; k++)
						r2[k] += r1[k];
				}
				for (int k = 0; k < 13; k++)
					r2[k] %= 1000000007;
				r = r2.clone();
			} else {
				shift(r, r1, s.charAt(i) - '0');
				r = r1.clone();
			}
		}
		return r[5];
	}

	private static void plus(long[] r, int m) {

	}

	private static void shift(long[] r, long[] r1, int m) {
		for (int i = 0; i < 13; i++)
			r1[(i * 10 + m) % 13] = r[i];
	}
}
