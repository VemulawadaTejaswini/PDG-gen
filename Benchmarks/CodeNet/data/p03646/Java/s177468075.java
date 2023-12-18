import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class Test {
	
	FastScanner _in;
	PrintWriter _out;
 
	void solve() {
		long k = _in.nextLong();
		
		if (k == 0) {
		    _out.println(2);
		    _out.println("1 1");
		} else if (k == 1) {
		    _out.println(2);
		    _out.println("2 0");
		}
		
		long i;
		
		_out.println(k + 1);
		
		LongStream.rangeClosed(1, k).parallel().forEach((j) -> {
		    _out.print("0 ");
		});
		
		_out.println(k * (k + 1));
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