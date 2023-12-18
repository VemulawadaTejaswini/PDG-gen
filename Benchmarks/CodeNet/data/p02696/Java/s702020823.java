import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	
	void doIt() {
		long A = sc.nextLong();
		long B = sc.nextLong();
		long N = sc.nextLong();
		long x = Math.min(B - 1, N);
		System.out.println((long)((Math.floor((double)(A) *x/B)) - A * Math.floor((double)x / B)));
	}
	
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
