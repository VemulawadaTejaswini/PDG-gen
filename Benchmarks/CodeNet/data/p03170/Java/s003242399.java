import java.util.Scanner;

public class Main {

	public static void main(String aargs[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		dp = new Boolean[k + 1];
		System.out.println(canWin(k, a) ? "First" : "Second");

	}

	static Boolean dp[];

	public static boolean canWin(int k, int[] a) {

		if (dp[k] == null) {

			for (int i : a) {
				if (i == k)
					dp[k] = true;
				else if (i < k)
					if (!canWin(k - i, a))
						dp[k] = true;
			}
			dp[k] = false;
		}
		return dp[k];
	}

	private static int next(String str, int s1) {
		int j = s1 + 1;
		for (; j < str.length() && str.charAt(j) == str.charAt(s1); j++)
			;
		return j - s1;
	}
}