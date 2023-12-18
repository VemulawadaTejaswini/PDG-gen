import java.util.*;
import java.lang.*;
import java.math.*;
class F{
	static StringBuffer solve(char[]s1,char[]s2,int i,int j,int l,int[][]dp){
		StringBuffer sb=new StringBuffer();
		while(l>0){
			if(s1[i]==s2[j]){
				sb.append(s1[i]);
				i++;
				j++;
				l--;
			}
			else{
				if(dp[i+1][j]>dp[i][j+1])
					i++;
				else
					j++;
			}
		}
		return sb;
	}
	static int getLength(char[]s1,char[]s2,int i, int j,int[][]dp){
		if(i>=s1.length||j>=s2.length){
			return 0;
		}
		if(dp[i][j]!=0)
			return dp[i][j];

		if(s1[i]==s2[j]){
			return 1+getLength(s1,s2,i+1,j+1,dp);
		}
		else
			return Math.max(getLength(s1,s2,i+1,j,dp),getLength(s1,s2,i,j+1,dp));

	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String t=in.nextLine();
		char[]s1=s.toCharArray();
		char[]s2=t.toCharArray();
		int[][]dp=new int[3001][3001];
		int l=getLength(s1,s2,0,0,dp);
		System.out.println(solve(s1,s2,0,0,l,dp));
	}
}