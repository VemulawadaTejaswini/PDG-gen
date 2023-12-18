import java.math.*;
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		FastScanner sc = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int t = 1;
		while (t-->0) {
		    long n = sc.nextLong();
		    char[] s = sc.nextLine().toCharArray();
		    long r = 0, g = 0, b = 0;
		    for(char c : s){
		        if(c=='R') r++;
		        else if(c=='G') g++;
		        else b++;
		    }
		    long ans = r*g*b;
		    int len = s.length;
		    for(int i=0;i<len;i++){
		        for(int j=1;2*j+i<len;j++){
		            if(s[i]!=s[i+j] && s[i]!=s[i+2*j] && s[i+j]!=s[i+2*j]) ans--;
		        }
		    }
		    out.println(ans);
		}
		out.close();
	}
	static int gcd(int a, int b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
	static class Pair implements Comparable<Pair>{
		int a, b;
		public Pair(int c, int d){
			a = c;
			b = d;
		}
		public int compareTo(Pair p){
		    return a-p.a;
		}
	}
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;
		FastScanner(File f) {
			try {
				br = new BufferedReader(new FileReader(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		FastScanner(InputStream f) {
			br = new BufferedReader(new InputStreamReader(f));
		}
		String nextLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				return null;
			}
		}
		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}