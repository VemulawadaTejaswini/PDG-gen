import java.util.Scanner;

public class Main {
	
	static int[] memo = new int[45];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		System.out.println(fib(N));
	}
	
	static int fib(int N) {
		if (N == 0 || N == 1) return 1;
		if (memo[N] != 0) return memo[N];
		return memo[N] = fib(N-1) + fib(N-2);
	}
}

