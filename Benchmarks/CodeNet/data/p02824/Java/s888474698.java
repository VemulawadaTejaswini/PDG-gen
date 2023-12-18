import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int N,V,P;
	long M;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();
		M = nextLong();
		V = nextInt();
		P = nextInt();

		long []A = nextLongArray(N);
		Arrays.sort(A);
		long []maxup = A.clone();
		long []Rup = A.clone();
		long up = M*1;
		for(int i=0;i<N;i++) {
			maxup[i] += up;
		}
		for(int i=N-1;i>N-P;i--) {
			Rup[i] += up;
		}
		/*
		for(int i=0;i<N;i++)out.print(A[i] + " " );
		out.println();
		for(int i=0;i<N;i++)out.print(Rup[i] + " " );
		out.println();
*/


		long order_p = Math.max(0,V-P);
		long cnt = 0,tr = N-P,threw_num = -1;
		for(int i=0;i<N;i++) {
			if(i>=tr) {
				cnt++;
				continue;
			}

			if(maxup[i]>=Rup[N-P]) {
				if(threw_num == maxup[i]) continue;

				if(order_p <= i) {
					cnt++;
					tr = i;
				}else {
					long _order_p = (order_p-i)*M; //右側に送るポイント
					int _i = i+1;
					while(_order_p > 0 && _i < N) {
						long t = Math.max(maxup[i]-A[_i],0);
						if(t == 0)break;
						_order_p -= t;
						_i++;
					}
					if(_order_p <= 0) {
						tr = i;
						cnt++;
					}else {
						threw_num = A[i];
					}
				}
			}
		}

		out.println(cnt);

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

	long lcm(long m, long n) {
	        return m * n / gcd(m, n);
	}
}