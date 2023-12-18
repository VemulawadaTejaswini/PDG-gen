import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		scn.nextLine();
		S = scn.nextLine();

		System.out.println(searchAns(N));
	}

	static String S;

	public static boolean solve(int n) {// 必要な引数を入れる
		for (int i = 0; i < S.length() - 2 * n + 1; i++) {
			String s = S.substring(i, i + n);
			String ss = S.substring(i + n);
			if (ss.contains(s)) {
				S = S.substring(i);
				return true;
			}
		}
		return false;
	}

	public static int searchAns(int N) {// 必要な引数を入れる
		int l = 1;
		while (solve(l)) {
			l++;
		}
		return l-1;
	}
}