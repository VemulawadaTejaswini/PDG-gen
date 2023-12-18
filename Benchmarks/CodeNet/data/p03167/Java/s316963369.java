package ss;

import java.util.*;
public class DP{
	static char[][]hw;
	static double[][]memo;
	static int h,w;
	
	public static double dp(int i,int j) {
		
		if(i==h-1&&j==w-1)
			return 1;
		if(i==h||j==w)
			return 0;
		else if(memo[i][j]!=-1)
			 return memo[i][j];
		else if(i+1<h&&j+1<w&&hw[i+1][j]=='.'&&hw[i][j+1]=='.')
			return memo[i][j] =dp(i+1,j)+dp(i,j+1);
		else if(i+1<h&&hw[i+1][j]=='.')
			return memo[i][j] = dp(i+1,j);
		else if(j+1<w&&hw[i][j+1]=='.')
		return memo[i][j] =dp(i,j+1);
		return  memo[i][j] =0;
		
		
		
	}
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		hw=new char [h][w];
		for(int i=0;i<hw.length;i++) {
			
			
				hw[i]=sc.next().toCharArray();
			
			}
			memo=new double[h][w];
			for(double[]x:memo)
				Arrays.fill(x,-1);
			
		
		
		
		System.out.println((long)(dp(0,0)%1000000007));
		
		
		
		
	}
}