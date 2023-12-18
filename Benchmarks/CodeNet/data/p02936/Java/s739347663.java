import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		long[] dp = new long[200020];

		int N = nextInt();
		int Q = nextInt();

		//List<List<Integer>> list = new ArrayList<>(N+1);
		List<List<Integer>> R_list = new ArrayList<>(N+1);
		for (int i=0;i<=N;i++) {
			//list.add(new ArrayList<>());
			R_list.add(new ArrayList<>());
		}
		//R_list.get(1).add(0);
		for(int i=1;i<N;i++) {
			int a = nextInt();
			int b = nextInt();
			//list.get(a).add(b);
			R_list.get(b).add(a);
		}

		for(int i=0;i<=N;i++) {
			if(R_list.get(i).size()==0) {
				R_list.get(i).add(0);
			}
			//out.println(R_list.get(i));
		}

		for(int i=0;i<Q;i++) {
			int p = nextInt();
			int x = nextInt();
			dp[p] += x;
		}

		for(int i=1;i<=N;i++) {
			dp[i] = dp[i]+dp[R_list.get(i).get(0)];
		}

		StringBuilder buf = new StringBuilder();
		for(int i=1;i<=N;i++) {
			if(i!=1) {
				buf.append(" ");
			}
			buf.append(dp[i]);
		}
		out.println(buf);
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

}