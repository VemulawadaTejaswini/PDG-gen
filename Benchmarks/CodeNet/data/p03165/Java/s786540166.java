	import java.util.*;
	import java.io.*;
import java.lang.reflect.Array;
	public class Main {
		static String a,b;
		static int dp[][],l1,l2;
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=1;
	//		Integer.parseInt(br.readLine().trim());
			StringBuilder printans=new StringBuilder();
			while(t-->0)
			{
				a=br.readLine().trim();
				b=br.readLine().trim();
				l1=a.length();
				l2=b.length();
				dp=new int[l1+1][l2+1];
				memset();
			 
			    int aasd=call(l1,l2);
			    int i=l1;
			    int j=l2;
			    
			    while(i>0 && j>0) {
			    	if(a.charAt(i-1)==b.charAt(j-1)) {
			    		printans.append(a.charAt(i-1));
			    		i--;
			    		j--;
			    	}
			    	else if(dp[i][j-1]<dp[i-1][j]) {
			    		i--;
			    	}
			    	else {
			    		j--;
			    	}
			    	
			    }
			    
			    System.out.println(printans.reverse());
			}
			
			
		}
		static void memset() {
			for(int a[]:dp) {
				Arrays.fill(a,-1);
			}
		}
		static int call(int i,int j) {
			if(i==0 || j==0) {
				return 0;
			}
			int ans=0;
			if(dp[i][j]!=-1)return dp[i][j];
			if(a.charAt(i-1)==b.charAt(j-1)) {
				ans+=1+call(i-1,j-1);
			}
			else {
				ans+=Math.max(call(i,j-1),call(i-1,j));
			}
			dp[i][j]=ans;
			return ans;	
		}
					
			
	}
