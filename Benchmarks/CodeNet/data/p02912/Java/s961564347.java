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
		int M = nextInt();
		long[] A = nextLongArray(N);
		int[] B = new int[N]; // 割引券使用枚数

		PriorityQueue<Integer> pq = new PriorityQueue <Integer>((a1,a2)->MyComparator(A[a1],A[a2],B[a1],B[a2])); // a1,a2 = A[] index
		for(int i=0;i<N;i++) {
			pq.add(i);
		}

		for(int i=0;i<M;i++) {
			int ti = pq.poll();
			B[ti]++;
			pq.add(ti);
		}

		long res = 0;
		for(int i=0;i<N;i++) {
			int ti = pq.poll();
			int b = B[ti];
			res += A[ti]/Math.pow(2,b);
		}

		out.println(res);
	}

	private int MyComparator(long A1, long A2, int B1, int B2) {
		double a1,a2;
		a1 = A1/Math.pow(2,B1);
		a2 = A2/Math.pow(2,B2);

		if(a1 < a2) return 1;
		else if(a1 > a2) return -1;
		else if(a1 == a2){
			if(A1 < A2)return 1;
			if(A1 > A2)return -1;
		}
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