import java.io.PrintStream;
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
		int[] A = nextIntArray(N+1);//monster num
		int[] B = nextIntArray(N);//hunt max

		long sum = 0;
		for(int i=0;i<N;i++) {
			if(B[i]<=A[i]) {
				sum+=B[i];
				continue;
			}
			sum+=A[i];
			B[i]-=A[i];
			if(B[i]<=A[i+1]) {
				sum+=B[i];
				A[i+1]-=B[i];
			}else if(B[i]>A[i+1]){
				sum+=A[i+1];
				A[i+1]=0;
			}

		}
		out.println(sum);
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