import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	
	public static void main(String... args) {
		FastScanner sc = new FastScanner();
		int n = sc.nextInt();
		BigInteger[] arr = new BigInteger[n+1];
		BigInteger[] maxnl = new BigInteger[n+1];
		maxnl[0] = v(1);
		for(int i = 0; i <= n; i++) {	
			arr[i] = v(sc.nextInt());
			if(i > 0) {
				maxnl[i] = sub(m(v(2),maxnl[i-1]), arr[i]);
			}
		}
		if(n == 0) {
			if(arr[0].equals(v(1))) {
				System.out.println(1);
			}
			else {
				System.out.println(-1);
			}
			return;
		}
		if(gr(arr[0],v(0))) {
			System.out.println(-1); return;
		}
		BigInteger res = arr[n];
		BigInteger[] nl = new BigInteger[n+1]; //not leaves
		nl[n] = v(0);
		for(int i = n-1; i >= 0; i--) {
			nl[i] = s(nl[i+1],arr[i+1]);
			if(gr(nl[i],maxnl[i])) {
				nl[i] = maxnl[i];
				if(gr(s(nl[i+1],arr[i+1]), m(v(2),nl[i]))) {
					System.out.println(-1); return;
				}
			}
			res = s(res, nl[i], arr[i]);
		}
		System.out.println(res);
	}
	
	static BigInteger v(long x) {
		return BigInteger.valueOf(x);
	}
	static BigInteger s(BigInteger... as) {
		BigInteger res = v(0);
		for(BigInteger a: as) {
			res = res.add(a);
		}
		return res;
	}
	static BigInteger m(BigInteger... as) {
		BigInteger res = v(1);
		for(BigInteger a: as) {
			res = res.multiply(a);
		}
		return res;
	}
	static BigInteger sub(BigInteger a, BigInteger b) {
		return a.subtract(b);
	}
	static BigInteger div(BigInteger a, BigInteger b) {
		return a.divide(b);
	}
	static boolean gr(BigInteger a, BigInteger b) {
		return a.compareTo(b) > 0;
	}
	static boolean geq(BigInteger a, BigInteger b) {
		return a.compareTo(b) >= 0;
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