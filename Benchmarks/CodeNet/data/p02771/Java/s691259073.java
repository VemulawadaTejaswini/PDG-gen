import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static PrintWriter out;
	static Scanner sc;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int a = sc.nextInt(),b = sc.nextInt(), c = sc.nextInt();
		boolean f = (a == b && a != c) || (a == c && a != b) || (c == b && a != c);
		out.println(f?"Yes":"No");
		out.close();
	}
	static class Scanner{
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));			
		}
		private String next() throws IOException{
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
	}
}
