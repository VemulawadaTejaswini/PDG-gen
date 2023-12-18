import java.util.Scanner;

public class Frog {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] test = new int[N];
		for (int i = 0; i < N; i++) {
			test[i] = input.nextInt();
		}
		System.out.println(JUMP(test));
	}
	public static int JUMP(int[] test) {
		int[] dp = new int[test.length];
		dp[0]=0;
		dp[1]=Math.abs(test[1]-test[0]);
		for (int i = 2; i < test.length; i++) {
			dp[i]=Math.min(dp[i-1]+Math.abs(test[i]-test[i-1]), dp[i-2]+Math.abs(test[i]-test[i-2]));
		}
		return dp[test.length-1];
	}
}