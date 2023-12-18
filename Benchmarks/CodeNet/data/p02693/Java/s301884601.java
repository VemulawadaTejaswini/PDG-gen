import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
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
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (3e5);
    static List<Integer>[] edges;
    static int n,m;
    static boolean cycle;
    static boolean[] vis;
    static int[] viscnt;
    static List<Integer> path;
    
	public static void main(String[] args) {
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i=a;i<=b;++i) {
			if(i%k == 0) {
				out.print("OK");
				out.close();
				return;
			}
		}
		out.print("NG");
		out.close();
   }
	 
}