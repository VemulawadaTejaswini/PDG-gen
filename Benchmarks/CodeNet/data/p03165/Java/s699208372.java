import java.util.Scanner;

public class Main {

	public static int[][][] dp;
	public static char[] sCharArray;
	public static char[] tCharArray;
	public static StringBuilder builder;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String sString = scan.nextLine();
		String tString = scan.nextLine();

		int sLength = sString.length();
		int tLength = tString.length();

		// 元となった座標も記録する 1:s-1,t-1 から 2:s-1,t から 3:s,t-1 から
		dp = new int[sLength + 1][tLength + 1][2];

		sCharArray = sString.toCharArray();
		tCharArray = tString.toCharArray();

		for (int s = 1; s < sLength + 1; s++) {

			for (int t = 1; t < tLength + 1; t++) {

				if (sCharArray[s - 1] == tCharArray[t - 1]) {

					dp[s][t][0] = dp[s - 1][t - 1][0] + 1;
					dp[s][t][1] = 1;

				} else {

					if (dp[s - 1][t][0] > dp[s][t - 1][0]) {

						dp[s][t][0] = dp[s - 1][t][0];
						dp[s][t][1] = 2;

					} else {

						dp[s][t][0] = dp[s][t - 1][0];
						dp[s][t][1] = 3;
					}
				}
			}
		}

		builder = new StringBuilder();
		restoration(sLength, tLength);
		System.out.println(builder.reverse().toString());
	}

	public static void restoration(int s, int t) {

		int record = dp[s][t][1];

		if (record == 1) {

			builder.append(sCharArray[s - 1]);
			restoration(s - 1, t - 1);

		} else if (record == 2) {

			restoration(s - 1, t);

		} else if (record == 3) {

			restoration(s, t - 1);
		}
	}
}
