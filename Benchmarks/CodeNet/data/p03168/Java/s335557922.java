//Coins
import java.io.*;
import java.util.*;
public class Main{
	static int n;
	static double[] prob=new double[3001];
	static double[][] dp=new double[3001][3001];
	public static double solve(int coins,int heads){
		if(heads==0)
			return 1;
		if(coins==0)
			return 0;
		//head comes
		if(dp[coins][heads]!=-1)
			return dp[coins][heads];
		double op1=prob[coins]*solve(coins-1,heads-1);
		//tail comes
		double op2=(1-prob[coins])*solve(coins-1,heads);
		return dp[coins][heads]=op1+op2;

	}
	public static void main(String[] args) throws IOException{
    	 BufferedReader br = new BufferedReader( 
                              new InputStreamReader(System.in)); 
       
		n=Integer.parseInt(br.readLine()); 
		// prob=new double[n+1];
		// dp=new double[]
		String[] str=br.readLine().split(" ");
		for(int i=1;i<=n;i++){			
		   prob[i]=Double.parseDouble(str[i-1]);		 
		}
		for(double[] x:dp){
			Arrays.fill(x,-1);
		}
		System.out.println(solve(n,(n+1)/2));
	
    }
}