import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;


	void doIt() {
		int n = sc.nextInt();
		int even = n / 2;
		System.out.println((n - even) / (double)n);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
