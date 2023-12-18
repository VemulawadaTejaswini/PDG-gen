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
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0;i<N;i++) {
			A[i]=nextInt()+1;
		}
		int []num = new int [N];
		int num_i = 0;
		int indexsum=0;
		for(int i=0;i<N;i++) {
			if(num[num_i]<A[i]) {
				num[num_i]=A[i];
			}else {
				num_i++;
				while(true) {
					if(num[num_i]<A[i]) {
						num[num_i]=A[i];
						break;
					}
					num_i++;
				}
			}
			if(num_i>indexsum)indexsum=num_i;
			num_i=0;
		}
		out.println(indexsum+1);
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

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}

}