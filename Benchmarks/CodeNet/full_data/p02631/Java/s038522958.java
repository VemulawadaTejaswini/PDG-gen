import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	long inf = LMAX / 2 - MAX;

	void doIt() {
		int N = sc.nextInt();
		int a[] = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			sum ^= a[i];
		}
		for(int i = 0; i < N; i++) {
			System.out.print((sum ^ a[i]) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
