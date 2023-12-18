import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner scan = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		long[][] pas = new long[110][110];
		pas[0][0] = 1;
		for(int i = 0; i < 109; i++) for(int j = 0; j <= i; j++) {
			pas[i+1][j+1] += pas[i][j];
			pas[i+1][j] += pas[i][j]; 
		}
		int n = scan.nextInt(), p = scan.nextInt();
		int a = 0, b = 0;
		for(int i = 0; i < n; i++){
			int x = scan.nextInt()%2;
			if(x == 0) a++;
			else b++;
		}
		long res = 0;
		if(p == 0) {
			for(int i = 0; i <= a; i++) for(int j = 0; j <= b; j+=2) res += pas[a][i]*pas[b][j];
		} else {
			for(int i = 0; i <= a; i++) for(int j = 1; j <= b; j+=2) res += pas[a][i]*pas[b][j];
		}
		out.println(res);
		out.close();
	}
	
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			try	{
				br = new BufferedReader(new InputStreamReader(System.in));
				st = new StringTokenizer(br.readLine());
			} catch (Exception e){e.printStackTrace();}
		}

		public String next() {
			if (st.hasMoreTokens())	return st.nextToken();
			try {st = new StringTokenizer(br.readLine());}
			catch (Exception e) {e.printStackTrace();}
			return st.nextToken();
		}

		public int nextInt() {return Integer.parseInt(next());}

		public long nextLong() {return Long.parseLong(next());}

		public double nextDouble() {return Double.parseDouble(next());}

		public String nextLine() {
			String line = "";
			if(st.hasMoreTokens()) line = st.nextToken();
			else try {return br.readLine();}catch(IOException e){e.printStackTrace();}
			while(st.hasMoreTokens()) line += " "+st.nextToken();
			return line;
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for(int i = 0; i < n; i++) a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n){
			long[] a = new long[n];
			for(int i = 0; i < n; i++) a[i] = nextLong();
			return a;
		}

		public double[] nextDoubleArray(int n){
			double[] a = new double[n];
			for(int i = 0; i < n; i++) a[i] = nextDouble();
			return a;
		}

		public char[][] nextGrid(int n, int m){
			char[][] grid = new char[n][m];
			for(int i = 0; i < n; i++) grid[i] = next().toCharArray();
			return grid;
		}
	}

}
