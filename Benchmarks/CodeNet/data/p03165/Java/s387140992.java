import java.util.*;
public class Main{

	private static Scanner sc=new Scanner(System.in);
	
	public static String findLCS(String s,String t){
		int dp[][]=new int[s.length()+1][t.length()+1];
		for(int i=0;i<=s.length();i++)
			dp[i][0]=0;
		for(int i=0;i<=t.length();i++)
			dp[0][i]=0;
		for(int i=1;i<=s.length();i++){
			for(int j=1;j<=t.length();j++){
				if(s.charAt(i-1)==t.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
				}
				else{
					dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		
		// for(int i=0;i<=s.length();i++){
			// for(int j=0;j<=t.length();j++){
				// System.out.print(dp[i][j]+" ");
			// }
			// System.out.println("");
		// }
		
		StringBuffer sb=new StringBuffer("");
		int i=s.length(),j=t.length();
		while(i>0 && j>0){
			if(s.charAt(i-1)==t.charAt(j-1)){
				sb.append(s.charAt(i-1));
				i--;
				j--;
			}
			else{
				if(i-1>0 && j-1>0 && dp[i-1][j]>=dp[i][j-1])
					i--;
				else
					j--;
			}
		}
		return sb.reverse().toString();
	}
	
	public static void main(String []args){
		String s,t;	
		s=sc.next();
		t=sc.next();
		System.out.println(findLCS(s,t));
	}
	
}