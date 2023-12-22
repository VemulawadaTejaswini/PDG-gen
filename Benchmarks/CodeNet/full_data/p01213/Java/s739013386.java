import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static String s,ans,s1,s2,s3;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			
			if(s.equals("#END"))break;
			ans="";
			for(int i=1;i<s.length();i++){
				s1=s.substring(0,i);
				s2=s.substring(i);
				s3=lcs(s1,s2);
				if(ans.length()<s3.length()){
					ans=s3;
				}

			}
			System.out.println(ans);
		}
	}
	public static String lcs(String a, String b){
		int na = a.length(), nb = b.length();
		int dp[][] = new int[na+1][nb+1];
		for(int i=1;i<=na;i++)for(int j=1;j<=nb;j++){
			if(a.charAt(i-1)==b.charAt(j-1))dp[i][j] = dp[i-1][j-1] + 1;
			else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
		}
		char[] r = new char[dp[na][nb]];
		int i = na, j = nb;
		while(0<i&&0<j){
			if(dp[i][j]==dp[i-1][j])i--;
			else if(dp[i][j]==dp[i][j-1])j--;
			else{
				r[dp[i-1][j-1]] = a.charAt(i-1);
				i--; j--;
			}
		}
		return new String(r);
	}
}