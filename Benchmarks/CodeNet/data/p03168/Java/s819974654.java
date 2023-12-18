
import java.util.*;

public class Main
{
    private final static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int N = Integer.parseInt(in.nextLine());
	double[] arr = new double[N];
	String[] temp = in.nextLine().split(" ");
	for (int i = 0; i < N; i++) {
	    arr[i] = Double.parseDouble(temp[i]);
	}
	double[][] dp = new double[N+1][N+1];
        dp[0][0] = 1;
	for (int i = 1; i <= N; i++) {
	    dp[i][0] = dp[i-1][0] * (1 - arr[i-1]);
	    for (int j = 1; j <= i; j++) {
		dp[i][j] += dp[i-1][j-1] * arr[i-1];
		dp[i][j] += dp[i-1][j] * (1 - arr[i-1]);
	    }
	}
	double res = 0;
	for (int i = 0; i <= N; i++) {
	    if (i > N-i) {
		res += dp[N][i];
	    }
	}
	System.out.println(res);
	in.close();
    }
}
