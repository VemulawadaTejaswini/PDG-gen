
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		String t = sc.next();
		String[] divk = new String[k];
		for(int i = 0; i < k; i++) {
			divk[i] = "";
		}
		for(int i = 0; i < n; i++) {
			divk[i % k] += t.charAt(i);
		}
		long ans = 0;
		for(int i = 0; i < k; i++) {
			String j = divk[i];
			int size = j.length();
			long[][] dp = new long[size + 1][3];
			for(int l = 1; l < size + 1; l++) {
				char te = j.charAt(l - 1);
				dp[l][0] = Math.max(dp[l - 1][1], dp[l - 1][2]);
				dp[l][1] = Math.max(dp[l - 1][0], dp[l - 1][2]);
				dp[l][2] = Math.max(dp[l - 1][0], dp[l - 1][1]);
				if(te == 'r') {
					dp[l][2] += p;
				} else if(te == 's') {
					dp[l][0] += r;
				} else {
					dp[l][1] += s;
				}
			}
			ans += Math.max(dp[size][0], Math.max(dp[size][1], dp[size][2]));
		}
		System.out.println(ans);
	}

}
