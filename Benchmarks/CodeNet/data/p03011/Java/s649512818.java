import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;

	void doIt() {
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(p + q + r - max3(p, q, r));
	}
	
	int max3(int a, int b, int c) {
		int max = ((a < b) ? b : a);
		return (max < c)? c : max;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
}
