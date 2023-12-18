import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner s = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
		long n = s.nextLong();
		long k = s.nextLong();
        n -= k*(n/k);
        out.println(Math.min(n, Math.abs(n-k)));

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
        long nextLong() {return Long.parseLong(next()); }
		
	}
}