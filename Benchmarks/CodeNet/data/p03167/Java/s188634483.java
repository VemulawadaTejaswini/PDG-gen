import java.util.*;
import java.io.*;
public class Grid {
	static char[][] a;
	static int H,W;
	static long[][] memo;

	public static long Main(int i, int j)
	{
		if ( i==H || j==W || a[i][j] == '#')
			return 0;
		if (memo[i][j]!=-1)
			return memo[i][j];
		if(i==H-1 && j==W-1)
			return 1;
		long down = move(i+1,j);
		long right = move(i,j+1);
		return down+right;
	}
	public static void main(String[] args) throws Exception
	{
		PrintWriter out = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		a=new char[H][W]; 

		for (int i =0;i<H;i++)
		{
			String s = sc.nextLine();
			for(int j=0;j<W;j++)
			{
				char k = s.charAt(j);
				a[i][j] = k;
			}
		}
			memo = new long[H][W];
			for (long[] a : memo)
			{
				Arrays.fill(a, -1);
			}
			System.out.println(move(0,0)%1000000000);
		}

	}

	class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
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