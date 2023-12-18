
import java.io.*;
import java.util.*;
public class Main{
	static String s,t;
	public static String lcs(){
		int n=s.length();
		int m=t.length();
		//System.out.println(s+":"+t);
		int[][] dp=new int[n+1][m+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(s.charAt(i-1)==t.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		
		char[] ans=new char[dp[n][m]];
		int x=dp[n][m],i1=n,j1=m,ind=ans.length-1;
		while(i1!=0&&j1!=0){
			if(s.charAt(i1-1)==t.charAt(j1-1)){
				ans[ind--]=s.charAt(i1-1);
				i1--;
				j1--;
			}
			else{
				if(dp[i1-1][j1]>dp[i1][j1-1]){
					i1--;
				}
				else{
					j1--;
				}
			}
		}
		return new String(ans);
	}
	public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
     	s=br.readLine();
     	t=br.readLine();
     	System.out.println(lcs());

	}
 }
