import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] memo = new long[n + 1];
		memo[0] = 2;
		memo[1] = 1;
		System.out.println(lucas(n, memo));
		
		sc.close();
	}
	
	static long lucas(int n, long[] memo) {
		if (memo[n] > 0) return memo[n];
		return memo[n] = lucas(n - 1, memo) + lucas(n - 2, memo);
	}
}


