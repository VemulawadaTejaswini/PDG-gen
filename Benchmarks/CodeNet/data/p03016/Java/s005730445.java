import java.io.*;
import java.util.*;
import java.math.BigInteger;
  
class Test {
	
	FastScanner _in;
	PrintWriter _out;
 
	void solve() {
		long l = _in.nextLong();
		long a = _in.nextLong();
		long b = _in.nextLong();
		long m = _in.nextLong();
		String s = String.valueOf(a);
		String inc = String.valueOf(b);
		BigInteger x = new BigInteger(s);
		BigInteger y = new BigInteger(inc);
		BigInteger z;
		BigInteger mod = new BigInteger(String.valueOf(m));
		
		long i;
		
		for (i = 1; i < l; i++) {
		    z = x.add(y);
		    s = s + z.toString();
		    x = z;
		}
		
		z = new BigInteger(s);
		x = z.mod(mod);
		
		_out.println(x.toString());
	}
	
	void run() throws Exception {
		_in = new FastScanner();
		_out = new PrintWriter(System.out);
 
		solve();
		
		_out.close();
	}
 
	public static void main(String[] args) throws Exception {
		new Test().run();
	}
	
	class FastScanner {
		BufferedReader _br;
		StringTokenizer _st;
		
		public FastScanner(String fileName) {
			try {
				_br = new BufferedReader(new FileReader(fileName));
			} catch (FileNotFoundException e) {
				// Error
			}
		}
		
		public FastScanner() {
			_br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String nextToken() {
			while (_st == null || !_st.hasMoreElements()) {
				try {
					_st = new StringTokenizer(_br.readLine());
				} catch (IOException e) {
					throw new InputMismatchException();
				}
			}
			
			return _st.nextToken();
		}
		
		String next() {
			return nextToken();
		}
		
		short nextShort() {
			return Short.parseShort(nextToken());
		}
		
		int nextInt() {
			return Integer.parseInt(nextToken());
		}
		
		long nextLong() {
			return Long.parseLong(nextToken());
		}
		
		float nextFloat() {
			return Float.parseFloat(nextToken());
		}
		
		double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}
 
} 