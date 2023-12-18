import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static ArrayList<String> s = new ArrayList<String>();
	public static void main(String[] args) throws IOException {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int a= in.nextInt();
		int b= in.nextInt();
		int c= a+b;
		if(a%3==0||b%3==0||c%3==0){
			System.out.println("Possible");
		}
		else{
			System.out.println("Impossible");
		}
	}
	public static void combinations(String suffix,String prefix){
        if(prefix.length()<0)return;
        s.add(suffix);
        for(int i=0;i<prefix.length();i++)
         combinations(suffix+prefix.charAt(i),prefix.substring(i+1,prefix.length()));
    }
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));
			st = new StringTokenizer("");
		}

		public double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		public String next() throws IOException {
			if (!st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
				return next();
			}
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
	}
}

