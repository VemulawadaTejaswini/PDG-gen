import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
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
    public final static int MAX = (int) 90000000;
  // static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	   
	 FastReader sc = new FastReader();
	 int n = sc.nextInt(),m = sc.nextInt();
	 char[] s = sc.next().toCharArray();
	 char[] t = sc.next().toCharArray();
     out.print(solve(s,t,n,m));
	 out.close();
		
	}
	private static int gcd(int a, int b) {
		
		// TIME COMPLEXITY: O(Log(max(a,b)))
		if(a<b) return gcd(b,a);
		if(b==0) return a;
		else return gcd(b,a%b);
	}

private static long solve(char[] s, char[] t, int n, int m) {
	if(s[0] != t[0]) return -1;
	 long l = (1L*n*m)/gcd(n,m);
	 Map<Long,Character> map = new HashMap<>(); 
	 for(int i=1;i<=n-1;++i) {
		 long key = i*(l/n)+1;
		  map.put(key,s[i]);
	 }
	 for(int i=1;i<=m-1;++i) {
		 long key = i*(l/m)+1;
		  if(map.containsKey(key) && map.get(key)!=t[i]) {
			 
			  return -1;
		  }
	 }
	 
	return l;
		
		 
		
	
}

}