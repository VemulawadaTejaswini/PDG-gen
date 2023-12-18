import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = 0;

	void doIt() {
		int n = sc.nextInt();
		int cur = 0;
		for(int i = 0; i < n; i++) {
			if(sc.nextInt() == cur + 1)cur++;
		}
		if(cur == 0)System.out.println(-1);
		else System.out.println(n - cur);
	}

	long gcd(long a, long b) {
		return (b != 0) ? gcd(b, a % b) : a;
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}
	
}
