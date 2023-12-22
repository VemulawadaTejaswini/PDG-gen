import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int n = sc.nextInt();
		int w = sc.nextInt();

		int[] dp = new int[w + 1];
		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			int wi = sc.nextInt();
					
			for (int j = wi; j <= w; j++) {
				dp[j] = Math.max(dp[j], dp[j - wi] + v);
			}
		}
		
		System.out.println(dp[w]);

		sc.close();
	}
}