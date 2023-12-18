
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
	

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
    public static long mod = (long) (1e9+7);
	public static void main(String[] args) {
		
		FastReader sc = new FastReader();
	   int n = sc.nextInt();
	   int d = sc.nextInt();
	   int[][] tab = new int[n][d];
	   for(int i=0;i<n;++i) {
		   for(int j=0;j<d;++j) {
			   tab[i][j] = sc.nextInt();
		   }
	   }
	   long ans = 0;
	   for(int i=0;i<n;++i) {
		   for(int j=i+1;j<n;++j) {
			   double dis = 0.0;
			   for(int k=0;k<d;++k) {
				   dis+=Math.pow(tab[i][k]-tab[j][k],2);
			   }
			   dis = Math.sqrt(dis);
			   if(dis == (int)dis) ++ans;
		   }
	   }
	   
	   out.println(ans);
		out.close();
		
	}
	
}