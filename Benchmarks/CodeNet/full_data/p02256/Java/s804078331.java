import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

class Main {
	//最大公約数を求める
	static int Gcd(int x, int y) {
		
		int n = Math.min(x, y);
		
		for (int i = n; i >= 1; i--) 
			if (x % i == 0 && y % i == 0) return i;
		
		return 1;
	}
		
	static class InputReader {
		BufferedReader br;
		StringTokenizer st;
		
		public String nextString() {
			
			 while (!st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine(), " ");
	                } catch (IOException e) {
	                    throw new InputMismatchException();
	                }
	            }
			return st.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(nextString());
		}
					
		public InputReader (InputStream inputStream) {
			br = new BufferedReader (new InputStreamReader (inputStream));
			st = new StringTokenizer ("");
		}
		
	}
	
	public static void main (String[] args) {
		InputStream inputStream = System.in;
		InputReader in = new InputReader (inputStream);
		
		//２つの自然数入力
		int x = in.nextInt();
		int y = in.nextInt();
		
		int gcd;
		
		if ( x == y) gcd = x;
		else if (x > y) {
			int n = x % y;
			gcd = Gcd(y,n);
		} else {
			int n = y % x;
			gcd = Gcd(x,n);
		}
		
		System.out.println(gcd);
	}
	
}

