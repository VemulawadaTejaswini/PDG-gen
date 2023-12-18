import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] divList = new int[12];

		divList[0] = 1;
		int con = 1;
		for (int i = 1; i < 11; i+=2 ) {
			divList[i] = (int)Math.pow(6, con);
			divList[i+1] = (int)Math.pow(9, con);
			con++;
		}
		divList[11] = (int)Math.pow(6, 6);

		int[]dp = new int[200000];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;

		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < 11; j++) {
				dp[i + divList[j]] = Math.min(dp[i + divList[j]], dp[i] + 1);
			}
		}

		System.out.println(dp[N]);

	}

}
