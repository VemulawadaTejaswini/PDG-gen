import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int start = sc.nextInt();
		long div[] = new long[num];
		for(int i = 0; i < num; i ++) {
			div[i] = sc.nextLong();
		}
		Arrays.sort(div);
		double dp[][] = new double[num][start + 1];
			for(int j = 0; j <= start; j ++) {
				dp[num - 1][j] = j % div[0];
		}

		for(int i = num - 2; i >= 0; i --) {
			for(int j = 0; j <= start; j ++) {
				dp[i][j] = 1.0 / (num - i) * dp[i + 1][(int)(j % div[num - i - 1])]
					+ (num - i - 1.0) / (num - i) * dp[i + 1][j];
			}
		}
		
		double ans = dp[0][start];
		for(int i = 1; i <= num; i ++) {
			ans = ans * i;
			if(ans % 1 == 0) {
				ans = mod((long)ans);
			}
		}
		System.out.println((long)ans);
	}

	static long divisor = (long)Math.pow(10, 9) + 7;
	public static long mod(long i) {
		return i % divisor + ((i % divisor) < 0 ? divisor : 0);
	}
}