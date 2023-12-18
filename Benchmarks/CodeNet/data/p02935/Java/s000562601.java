import java.io.PrintStream;
import java.util.PriorityQueue;
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
		int N = nextInt();
		double[] A = new double[N];
		PriorityQueue<Double> pq = new PriorityQueue <Double>((a1,a2)->MyComparator(a1,a2));
		for(int i=0;i<N;i++) {
			A[i] = Double.parseDouble(next());
			pq.add(A[i]);
		}
		double num;
		while(pq.size()>1) {
			num = (pq.poll()+pq.poll())/2;
			pq.add(num);
		}
		out.println(pq.poll());
	}

	private int MyComparator(Double a1, Double a2) {
		if(a1 > a2) return 1;
		else if(a1 < a2) return -1;
		return 0;
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