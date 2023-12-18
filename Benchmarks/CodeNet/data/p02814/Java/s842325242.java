import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int LEN = (int)1e6 + 1;

	void doIt() {
		int N = sc.nextInt();
		long M = sc.nextLong();
		int a[] = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		long lcm = a[0];
		for(int i = 1; i < N; i++) {
			lcm = lcm * a[i] / gcd(lcm, a[i]);
			if(lcm / 2 - 1 > M) {
				System.out.println(0);
				return;
			}
		}
		
		System.out.println((int)(M / (lcm / 2.0) - M / lcm));
		
	}
	
	long gcd(long a, long b) {
		return (b == 0)?a:gcd(b, a % b);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
