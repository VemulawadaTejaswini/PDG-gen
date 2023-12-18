import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;








public class Main{
	public static int n;
	public static boolean[] vis;
	public static int[] nums;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int l = sc.nextInt();
		int r= sc.nextInt();
		
			int min = 2019;
			
			if (r-l >= 2019) 
				min = 0;
			
			
			l = l%2019;
			r = r%2019;
			
			if (r<= l) {
				r+=2019;
			}
			for (int i = l; i <= r; i++) {
				for (int j = l+1; j <= r; j++) {
					min = Math.min(min, (i*j)%2019);
				}
				
			}
			out.println(min);

		
		
		
		
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