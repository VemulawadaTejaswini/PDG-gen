import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int h[] = new int[N];
		for(int i=0;i<N;i++) {
				 h[i]  = sc.nextInt(); 
		}
		int dp[] = new int [N];
		dp[0] = 0;
		dp[1] = Math.abs(h[0]-h[1]);
		for(int j = 2;j<N;j++) {
			dp[j]=Math.min(dp[j-1]+Math.abs(h[j]-h[j-1]),dp[j-2]+Math.abs(h[j]-h[j-2]));
		}
		System.out.println(dp[N-1]);
	}
}
