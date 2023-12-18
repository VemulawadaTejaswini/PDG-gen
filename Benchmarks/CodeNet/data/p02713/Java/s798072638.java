import java.io.*;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int k = sc.nextInt();
		long sum=0;
		for(int a=1; a<=k ; a++) {
			for(int b=1;b<=k;b++) {
				for(int c=1;c<=k;c++) {
					int gcdab= gcd(a,b);
					int gcdabc = gcd(gcdab,c);
					sum+=gcdabc;
					
				}
			}
		}
		System.out.println(sum);
		
	}
	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		return gcd(y, x % y);
	}


	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
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
}
