import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		int N = nextInt();
		int M = nextInt();

		List<List<Integer>> list = new ArrayList<>(M+1);

		for (int i=0;i<=M;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<N;i++) {
			int a = nextInt();
			int b = nextInt();
			if(a <= M) list.get(a).add(b);
		}

		PriorityQueue<Integer> pq = new PriorityQueue <Integer>((a1,a2)->MyComparator(a1,a2));
		long sum = 0;
		for(int l=1;l<=M;l++) {
			for(Integer p:list.get(l)) {
				pq.add(p);
			}
			if (!pq.isEmpty()) {
				sum += pq.poll();
			}
		}
		out.println(sum);
	}

	private int MyComparator(int a, int b) {
		return b - a;
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