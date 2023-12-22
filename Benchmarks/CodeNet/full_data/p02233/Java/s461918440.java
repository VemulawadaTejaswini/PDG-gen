import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans[] = fibo(n);
		System.out.println(ans[n]);
	}

	public static long[] fibo(int n) {
		long memo[] = new long[n + 1];
		memo[0] = 1;
		memo[1] = 1;
		for (int i = 2; i < memo.length; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		return memo;
	}
}

