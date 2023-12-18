package ex2_1_1.ABC045_C;

import java.util.Scanner;

public class Main {
	public static long ans = 0;
	public static String S = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		rec(0, 0, 0);
		System.out.println(ans);
	}

	static void rec(int count, long tmpkeep, long tmpsum) {
		if (S.length() == count + 1) {
			ans += tmpkeep * 10;
			ans += tmpsum;
			ans += Integer.parseInt("" + S.charAt(count));
			return;
		} else {
			// +入れない
			rec(count + 1, tmpkeep * 10 + Integer.parseInt("" + S.charAt(count)), tmpsum);
			// +入れる
			rec(count + 1, 0, tmpsum + tmpkeep * 10 + Integer.parseInt("" + S.charAt(count)));
		}
		return;
	}
}
