import java.util.Scanner;
class LongestIncreasingSubsequence {
    int[] a;
    LongestIncreasingSubsequence (int[] a) {
	this.a = a;
    }
    int solve (int n) {
	int[] dp = new int[n];
	int max = 0;
	for (int i = 0; i < n; i++) {
	    dp[i] = 1;
	    for (int j = 0; j < i; j++) {
		if (a[i] < a[j]) {
		    dp[i] = Math.max(dp[i], dp[j] + 1);
		}
	    }
	    max = Math.max(max, dp[i]);
	}
	return max;
    }
}

public class Main {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = Integer.parseInt(scan.nextLine());
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    a[i] = Integer.parseInt(scan.nextLine());
	}
	LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence(a);
	System.out.println(lis.solve(n));
    }
}