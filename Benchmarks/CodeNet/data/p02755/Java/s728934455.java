import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner input=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int a=input.nextInt();
		int b=input.nextInt();
		int ans=-1, i=0;
		for(i=0;i<10*(b+1);i++) {
			if((int)(0.08*i)==a&&(int)(0.1*i)==b) {
				ans=i;
				break;
			}
		}
		pw.print(ans);
		pw.close();
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}
