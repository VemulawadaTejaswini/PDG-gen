import java.util.*;
import java.io.PrintWriter;
public class Main{
	static double[][][] dp;
	static int n;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		dp=new double[n+1][n+1][n+1];
		int[] t=new int[3];
		for(int i=0; i<n; i++){
			int a=sc.nextInt()-1;
			t[a]++;
		}
		System.out.println(dfs(t[0],t[1],t[2]));
	}
	static double dfs(int one,int two,int three){
		if(one==0 && two==0 && three==0){
			return 0;
		}
		double re=n;
		if(one>0) re+=one*dfs(one-1,two,three);
		if(two>0) re+=two*dfs(one+1,two-1,three);
		if(three>0) re+=three*dfs(one,two+1,three-1);
		re/=(one+two+three);
		return dp[one][two][three]=re;
	}
}
