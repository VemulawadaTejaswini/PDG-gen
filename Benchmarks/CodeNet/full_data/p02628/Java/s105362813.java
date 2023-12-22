import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 998244353;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	long inf = LMAX / 2 - MAX;

	void doIt() {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int p[] = new int[N];
		for(int i = 0; i < N; i++)
			p[i] = sc.nextInt();
		Arrays.sort(p);
		int sum = 0;
		for(int i = 0; i < K; i++) {
			sum += p[i];
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
