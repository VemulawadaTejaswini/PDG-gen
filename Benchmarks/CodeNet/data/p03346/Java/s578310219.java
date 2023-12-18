import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		for (int i=0;i<n;i++) {
			p[i] = sc.nextInt()-1;
		}
		
		int[] dp = new int[n];
		int max = 0;
		
		for (int i=0;i<n;i++) {
			dp[p[i]] = p[i]==0 ? 1 : dp[p[i]-1]+1;
			max = Math.max(max, dp[p[i]]);
		}
		
		System.out.println(n-max);

	}

}
