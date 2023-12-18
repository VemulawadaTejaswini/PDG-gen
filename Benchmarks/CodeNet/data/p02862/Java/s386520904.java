import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static final int mod = (int)1e9+7;
	
	public static void solve() {
		int x=s.nextInt();
		int y =s.nextInt();
		int max = (int)2e6+10;
		long[] fact = new long[max];
		long[] invfact= new long[max];
		fact[1]=1;
		invfact[1]=1;
		for(int i=2;i<max;i++) {
			fact[i]=fact[i-1]*i;
			fact[i]%=mod;
			invfact[i]=(invfact[i-1]*ModInverse(i, mod))%mod;
		}
		long ways = 0;
		for (int twos = 0;twos < x/2+5;twos++) {
			int used = twos*2;
			int ones = x - used;
			if(ones>=0) {
				int used_y=twos;
				used_y+=ones*2;
				if(used_y==y) {
					long temp=fact[ones+twos];
					temp = temp*invfact[ones];
					temp %=mod;
					temp = temp * invfact[twos];
					temp%=mod;
					ways +=temp;
					ways%=mod;
				}
			}
		}
		out.println(ways);
	}

	public static class Triplet {
		long gcd;
		long x;
		long y;

		Triplet(long gcd, long x, long y) {
			this.gcd = gcd;
			this.x = x;
			this.y = y;
		}
	}

	public static Triplet ExtendedEuclideanAlgo(long a, long b) {
		if (a == 0) {
			return new Triplet(b, 0, 1);
		}
		Triplet ans = ExtendedEuclideanAlgo(b % a, a);
		long x = ans.y - (b / a) * ans.x;
		long y = ans.x;
		return new Triplet(ans.gcd, x, y);
	}

	public static long ModInverse(long a, long m) {
		Triplet ans = ExtendedEuclideanAlgo(a, m);
		if (ans.gcd != 1) {
			//System.out.println("Multiplicative inverse doesnot exist");
			return -1;
		} else {
			//m is added to handle negative x
			long result = (ans.x % m + m) % m;
			return result;
		}
	}
	
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
