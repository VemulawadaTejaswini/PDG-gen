import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int dp[][]=new int[s.length()+1][t.length()+1];
		for(int i=1;i<=s.length();i++){
		    for(int j=1;j<=t.length();j++){
		        if(s.charAt(i-1)==t.charAt(j-1)){
		            dp[i][j]=dp[i-1][j-1]+1;
		        }else{
		            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
		        }
		    }
		}
		String ans=reconstruct(dp,s.length(),t.length(),s,t);
		System.out.println(ans);
	}
	public static String reconstruct(int dp[][],int r,int c,String s,String t){
	    if(r==0||c==0)
	    return "";
	    if(s.charAt(r-1)==t.charAt(c-1))
	    return reconstruct(dp,r-1,c-1,s,t)+Character.toString(s.charAt(r-1));
	    else if(dp[r][c]==dp[r-1][c]){
	        return reconstruct(dp,r-1,c,s,t);
	    }else{
	        return reconstruct(dp,r,c-1,s,t);
	    }
	}
    
}
