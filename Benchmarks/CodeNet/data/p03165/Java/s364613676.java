import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class Main {
	
	static String lcs(char[] a , char[] b){
		int n = a.length ; int m = b.length;
		String dp[][] = new String[n+1][m+1];
		
		for(int i = 0 ;i <= n ; i++) {
			for(int j = 0 ; j <= m ; j++) {
				if(i==0 || j==0) {
					dp[i][j] = "";
					continue;
				}else if(a[i-1] == b[j-1]) {
					StringBuilder sb = new StringBuilder();
					
					sb.append(dp[i-1][j-1]);
					sb.append(a[i-1]);
					dp[i][j] = sb.toString();
				}else {
					if( dp[i-1][j].length() >= dp[i][j-1].length()) {
						dp[i][j] = dp[i-1][j];
					}else {
						dp[i][j] = dp[i][j-1];
					}
				}
			}
		}
		return dp[n][m];
	}
 
	public static void main(String[] args) {
		FastScanner sc=new FastScanner();
		String s = sc.next(), s2 = sc.next();
		System.out.println(lcs(s.toCharArray() , s2.toCharArray()));
	}
	
	public void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
		
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
	}
 
}



