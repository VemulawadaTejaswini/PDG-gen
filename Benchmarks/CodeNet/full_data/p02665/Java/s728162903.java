import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	
	public static void main(String... args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		long[] arr = new long[n+1];
		long[] maxnl = new long[n+1];
		maxnl[0] = 1;
		long max = (long)1e18;
		for(int i = 0; i <= n; i++) {
			arr[i] = sc.nextInt();
			if(i > 0) {
				if(maxnl[i-1] >= max) maxnl[i] = max;
				else {
					maxnl[i] = 2*maxnl[i-1] - arr[i];
				}
			}
		}
		if(n == 0) {
			if(arr[0] == 1) {
				System.out.println(1);
			}
			else {
				System.out.println(-1);
			}
			return;
		}
		if(arr[0] > 0) {
			System.out.println(-1); return;
		}
		B res = v(arr[n]);
		long[] nl = new long[n+1]; //not leaves
		for(int i = n-1; i >= 0; i--) {
			nl[i] = nl[i+1] + arr[i+1];
			if(maxnl[i] < max && nl[i] > maxnl[i]) {
				nl[i] = maxnl[i];
				if(2*nl[i] < nl[i+1] + arr[i+1]) {
					System.out.println(-1); return;
				}
			}
			res = res.s(v(nl[i]).s(v(arr[i])));
		}
		System.out.println(res);
	}
	static B v(long x) {
		return new B(BigInteger.valueOf(x));
	}
	static class B{
		BigInteger big;
		public B(BigInteger big) {
			this.big = big;
		}
		public B s(B b) {
			return new B(big.add(b.big));
		}
		public B r(B b) {
			return new B(big.subtract(b.big));
		}
		public B m(B b) {
			return new B(big.multiply(b.big));
		}
		public B d(B b) {
			return new B(big.divide(b.big));
		}
		public String toString() {
			return big.toString();
		}
	}
	
	static class FastScanner {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public FastScanner() {
            reader = new BufferedReader(new InputStreamReader(System.in), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
        	return Long.parseLong(next());
        }
        public double nextDouble() {
        	return Double.parseDouble(next());
        }
        public String nextLine() {
        	try {
        		return reader.readLine();
        	} catch(IOException e) {
        		throw new RuntimeException(e);
        	}
        }
    }
	

}