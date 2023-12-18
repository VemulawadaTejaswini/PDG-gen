

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	
	public static void main(String[] args) {
		FastScanner scanner=new FastScanner();
		int h=scanner.nextInt(),w=scanner.nextInt();
	   char a[][]=new char[h][w];
	   int dp[][]=new int[h][w];
	   int m=1000000007;
	   for(int i=0;i<h;i++) {
		   String string=scanner.next();
		   for(int j=0;j<w;j++) {
			  a[i][j]=string.charAt(j); 
		   }
	   }
	   
	   for(int i=0;i<w;i++)
	   {
		   if(a[0][i]=='#') break;
		   else dp[0][i]=1;
	   }
	   for(int i=0;i<h;i++)
	   {
		   if(a[i][0]=='#') break;
		   else dp[i][0]=1;
	   }
	   
	   for(int i=1;i<h;i++) {
		   for(int j=1;j<w;j++) {
			   if(a[i][j]=='#') dp[i][j]=0;
			   else {
				dp[i][j]=(dp[i-1][j]%m+dp[i][j-1]%m)%m;
			}
		   }
	   }
	   System.out.println(dp[h-1][w-1]);
	   
	   
	   
		

	}
	static class FastScanner{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		
		String next() {
			while (!st.hasMoreTokens())
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
		int [] readArray(int n) {
			int a[]=new int[n];
			for(int i=0;i<n;i++) a[i]=nextInt();
			return a;
		}
		
		
	}

}
