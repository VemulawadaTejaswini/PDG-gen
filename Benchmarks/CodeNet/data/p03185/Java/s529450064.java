import java.util.Arrays;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long C = input.nextLong();
		long[] test = new long[N];
		for (int i = 0; i < N; i++) {
			test[i] = input.nextInt();
		}
		System.out.println(JUMP(test, C));
		input.close();
	}
	public static long JUMP(long[] test, long C) {
		long[] dp = new long[test.length];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0; 
		dp[1]=(test[1]-test[0])*(test[1]-test[0])+C;
		for (int i = 2; i < test.length; i++) {
			for (int j = 1; j <= Math.min(i, test.length); j++) {
				dp[i]=Math.min(dp[i-j]+(test[i]-test[i-j])*(test[i]-test[i-j]), dp[i]);
			}
		}
		return dp[test.length-1]+C;
	}
}