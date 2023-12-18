
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<Integer>[] list;
	static int n;
	static long[] fact;
	static Combination com = new Combination();

	static Pair Calc(int parent, int here) {
		long ret = 1;
		int v = 0;
		for(Integer e : list[here]) {
			if(e != parent) {
				Pair p = Calc(here, e);
				ret *= com.Com(v + p.getVartical(), v);
				v += p.getVartical();
				ret %= com.MOD;
				ret *= p.getCom();
				ret %= com.MOD;
			}
		}
		return new Pair(v + 1, ret);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		list = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			list[a].add(b);
			list[b].add(a);
		}
		for(int i = 0; i < n; i++) {
			Pair p = Calc(-1, i);
			System.out.println(p.getCom());
		}
	}

}

class Pair {
	private int vartical;
	private long com;

	protected Pair(int vartical, long com) {
		super();
		this.vartical = vartical;
		this.com = com;
	}

	public int getVartical() {
		return vartical;
	}

	public void setVartical(int vartical) {
		this.vartical = vartical;
	}

	public long getCom() {
		return com;
	}

	public void setCom(long com) {
		this.com = com;
	}

}

class Combination {
	public static int MAX = 510000;
	public static int MOD = 1000000007;

	public static long[] f = new long[MAX];
	public static long[] finv = new long[MAX];
	public static long[] inv = new long[MAX];

	public Combination() {
		f[0] = f[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			f[i] = f[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public static long Com(int n, int k) {
		if(n < k)
			return 0;
		if(n < 0 || k < 0)
			return 0;
		return f[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

	public static long Inverse(int n) {
		return inv[n];
	}

	public static long Factorial(int n) {
		return f[n];
	}
}
