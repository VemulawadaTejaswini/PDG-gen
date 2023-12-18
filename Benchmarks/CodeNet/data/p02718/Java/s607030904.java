import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer[] arr = new Integer[n];
		long sum =0;
		for (int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		Arrays.sort(arr);
		int mtaken = 0;
//		System.out.println(sum);
//		System.out.println((1.0/4*m));
//		System.out.println(sum*(1.0/(4*m)));
		double mustbegreaterthanoreq = sum*(1.0/(4*m));
//		System.out.println(mustbegreaterthanoreq);
		for(int i=n-1; i>=0 ;i--) {
			if(arr[i]>=mustbegreaterthanoreq) {
				mtaken++;
//				System.out.println(mtaken);
				if(mtaken==m)
					break;
			}
			else
				break;
		}
		if(mtaken==m)
			System.out.println("Yes");
		else
			System.out.println("No");
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
