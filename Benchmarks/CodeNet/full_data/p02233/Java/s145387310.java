import java.util.Scanner;

class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N <= 1){
			System.out.println(1);
			return;
        }
        long dp[] = new long[N];
        dp[0] = 1;
        dp[1] = 1;
        System.out.println(fib(dp, N));
    }
    private static long fib(long[] dp, int n){
        long fib1 = dp[n-1] != 0 ? dp[n-1] : fib(dp, n-1);
        long fib2 = dp[n-2] != 0 ? dp[n-2] : fib(dp, n-2);
        dp[n-1] = fib1;
        dp[n-2] = fib2;
        return fib1 + fib2;
    }
}
