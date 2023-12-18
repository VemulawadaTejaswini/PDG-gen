import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		String S = sc.next();

		// query
		int[][] lr = new int[Q][N];
		for (int i = 0; i < Q; i++) {
			lr[i][0] = Integer.parseInt(sc.next());
			lr[i][1] = Integer.parseInt(sc.next());
		}

		int[] ans = new int[Q];
		for (int i = 0; i < Q; i++) {
			int start = lr[i][0];
			int end = lr[i][1];
			String tmp = S.substring(start - 1, end);
			ans[i] = solve(tmp);
		}

		for (int i = 0; i < Q; i++) {
			System.out.println(ans[i]);
		}
	}

	private static int solve(String tmp) {
		String replace = tmp.replace("AC", "#");
		return tmp.length() - replace.length();
	}
}
