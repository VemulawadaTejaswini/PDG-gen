import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner input=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		String s=input.next();
		s=rev(s);
		int q=input.nextInt();
		for(int i=0;i<q;i++) {
			int qi=input.nextInt();
			if(qi==1) {
				s=rev(s);
				continue;
			}else if(qi==2) {
				int fi=input.nextInt();
				String c=input.next();
				if(fi==1) {
					s=c+s;
				}else s=s+c;
			}
		}
		pw.print(s);
		pw.close();
	}
	static String rev(String s) {
		String sol="";
		for(int i=0;i<s.length();i++) {
			sol=s.charAt(i)+sol;
		}
		return sol;
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
