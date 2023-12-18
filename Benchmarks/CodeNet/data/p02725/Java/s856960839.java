
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		Long k 	     = Long.parseLong(tmp[0]);
		int  n 	     = Integer.parseInt(tmp[1]);

		String[] tp  = scanner.nextLine().split(" ");
		long[] list  = new long[2 * n];
		for(int i = 0; i < n; i++) list[i] = Long.parseLong(tp[i]);
		for(int i = n; i < 2 * n - 1; i++) list[i] = list[i - n];



		long[]  dp   = new long[n];
		long ans = Long.MAX_VALUE;

		for(int j = 1; j < n; j++) {

			dp[0]   = 0;
			int cnt = 1;
			int min = n - 1;


			while(cnt < n) {

				long start = list[j];
				int now    = j + cnt;
				long bef   = list[now - 1];

				if(now < n) dp[	now] = Math.min(dp[now - 1] + list[now] - bef, dp[now - 1] + (k - list[now]) + bef);

				cnt++;
			}

			ans = Math.min(ans, dp[n - 1]);

		}

		System.out.println(dp[n - 1]);



	}
}