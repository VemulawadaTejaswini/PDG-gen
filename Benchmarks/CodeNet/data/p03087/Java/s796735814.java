import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,Q;
		N=sc.nextInt();
		Q=sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		int[] dp = new int[100001];
		for(int i = 1; i<S.length();i++) {
			if(S.charAt(i)=='C' && S.charAt(i-1)=='A') {
				dp[i]=dp[i-1]+1;
			} else {
				dp[i]=dp[i-1];
			}
			//System.out.println(dp[i]);
		}
		for(int i = 0;i<Q;i++) {
			int l,r;
			l=sc.nextInt();
			r=sc.nextInt();
			System.out.println(dp[r-1]-dp[l-1]);
		}
	}
}
