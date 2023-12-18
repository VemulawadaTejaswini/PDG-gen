import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static PrintWriter out;
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		
		long k = sc.nextInt();
		long A = sc.nextInt();
		long B = sc.nextInt();
		long ans = A;
		long ans2 = k+1;
		if(k < A-1) {
			k = 0;
		}
		
		if(k>0) {
		
			k-= (A-1);
			
			if(B > A) {
				if(k%2 != 0) {
					k--;
					ans++;
					}
				
				ans+= ((k/2)*B - (k/2)*A);
			}
			
			else if (B == A) {
				ans = B;
			}

			else if(B < A) {
				ans = k+1;
			}
		}
			
		out.println(Math.max(ans2,ans));
		out.flush();
	}
}
	
class Scanner {
	StringTokenizer st;
	BufferedReader br;

	public Scanner(InputStream system) {
		br = new BufferedReader(new InputStreamReader(system));
	}

	public String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public double nextDouble() throws IOException {
		return Double.parseDouble(next());
	}

	public char nextChar() throws IOException {
		return next().charAt(0);
	}

	public Long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	public boolean ready() throws IOException {
		return br.ready();
	}

	public void waitForInput() throws InterruptedException {
		Thread.sleep(3000);
	}

}
