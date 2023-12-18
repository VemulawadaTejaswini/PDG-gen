import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class Solver {
		
		int a, b, c, N;
		
		void solve(FastScanner s, PrintWriter out) {
			N = s.nextInt();
			for(int k, i = 0; i < N; i++) {
				k = s.nextInt();
				if((k & 3) == 0) c++;
				else if((k & 1) == 0) b++;
				else a++;
			}
			int last = -1;
			while(N --> 0) {
				if(last == -1) {
					if(a != 0) {
						a--; last = 0;
					} else if(b != 0) {
						b--; last = 1;
					} else {
						c--; last = 2;
					}
				} else if(last == 0) {
					if(c == 0) {
						out.println("No"); return;
					}
					c--; last = 2;
				} else if(last == 1) {
					if(b == 0) {
						if(c == 0) {
							out.println("No"); return;
						}
						c--; last = 2;
					} else {
						b--; last = 1;
					}
				} else if(last == 2) {
					if(a == 0) {
						if(b == 0) {
							out.println("Yes"); return;
						}
						b--; last = 1;
					} else {
						a--; last = 0;
					}
				}
			}
			out.println("Yes");
		}
		
	}
	
	public static void main(String[] args) {
		FastScanner s = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		new Solver().solve(s, out);
		
		out.close();
	}
	
	static class FastScanner {
		
		BufferedReader br; StringTokenizer st;
		FastScanner(InputStream is) {
			br = new BufferedReader(new InputStreamReader(is));
			st = new StringTokenizer("");
		}
		String next() {
			while(!st.hasMoreElements()) {
				try { st = new StringTokenizer(br.readLine()); }
				catch(Exception e) {}
			}
			return st.nextToken();
		}
		
		int nextInt() { return Integer.parseInt(next()); }
		
	}
	
}
