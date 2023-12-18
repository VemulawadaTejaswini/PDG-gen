//Vacation
import java.io.*;
import java.util.*;

public class Main{
	static int t,n;
	static int[][] mat;	
	static StringBuilder ans=new StringBuilder();
	public static long solve(){
		long[][] dp=new long[n][3];
		for(int i=0;i<3;i++){
			dp[0][i]=mat[0][i];
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<3;j++){
				dp[i][j]=0;
				for(int k=0;k<3;k++){
					if(j==k){
						continue;
					}
					dp[i][j]=Math.max(dp[i][j],dp[i-1][k]);
				}
				dp[i][j]+=mat[i][j];
			}			
		}

		long max_value=0;
		for(int i=0;i<3;i++){
			max_value=Math.max(max_value,dp[n-1][i]);
		}
		return max_value;
	}
	public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new
		// 	FileReader("sampleinp.txt"));
    	BufferedReader br = new BufferedReader( 
                             new InputStreamReader(System.in)); 
		
		n=Integer.parseInt(br.readLine());
		mat=new int[n][3];
		for(int i=0;i<n;i++){
			String str[]=br.readLine().split(" ");
			for(int j=0;j<3;j++){
				mat[i][j]=Integer.parseInt(str[j]);
			}
		}
		ans.append(solve());		 	
		// PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("sampleout.txt")));
		// pw.write(ans.toString());
		// pw.flush();
	 	System.out.println(ans.toString());
	}
}
