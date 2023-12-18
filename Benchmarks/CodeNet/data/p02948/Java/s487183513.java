import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
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

		int[][] AB = new int[N][2];
		for(int i=0;i<N;i++) {
			AB[i] = nextIntArray(2);
		}
		//Arrays.sort(AB,(a1,a2)->Integer.compare(a2[1],a1[1]));
		//Arrays.sort(AB,(a1,a2)->Integer.compare(a1[0],a2[0]));
		Arrays.sort(AB,(a1,a2)->MyComparator(a2[1],a1[1],a1[0],a2[0]));

		PriorityQueue<Integer> pq = new PriorityQueue <Integer>(Comparator.reverseOrder());


		long sum = 0;
		int AB_i = 0;
		for(int l=1;l<=M;l++) {
			while(AB_i<N&&AB[AB_i][0]==l) {
				pq.add(AB[AB_i][1]);
				AB_i++;
			}
			if (!pq.isEmpty()) {
				sum += pq.poll();
				pq.remove(0);
			}
		}

		out.println(sum);
	}

	private int MyComparator(int a, int b, int c, int d) {
		if(c > d)return 1;
		if(c < d)return -1;
		if(a > b)return 1;
		if(a < b)return -1;
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