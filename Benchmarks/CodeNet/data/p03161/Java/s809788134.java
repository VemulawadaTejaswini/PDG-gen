import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		int[] test = new int[N];
		for (int i = 0; i < N; i++) {
			test[i] = input.nextInt();
		}
		System.out.println(JUMP(test, K));
	}
	public static int JUMP(int[] test, int K) {
		int[] dp = new int[test.length];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0; //dp[i] represents cheapest cost up to ith stone
		dp[1]=Math.abs(test[1]-test[0]);
		for (int i = 2; i < test.length; i++) {
			for (int j = 1; j <= Math.min(i, K); j++) {
				dp[i]=Math.min(dp[i-j]+Math.abs(test[i]-test[i-j]), dp[i]);
			}
		}
		return dp[test.length-1];
	}
}