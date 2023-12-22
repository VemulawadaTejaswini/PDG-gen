
import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
String s=sc.next();
String  t=sc.next();
	
	int dp[][]=new int[s.length()+1][t.length()+1];
	for(int i=0;i<=s.length();i++) {
		dp[i][0]=0;
	}
	for(int i=0;i<=t.length();i++) {
		dp[0][i]=0;
	}
	for(int i=1;i<=t.length();i++) {
		for(int j=1;j<=s.length();j++) {
			if(s.charAt(j-1)==t.charAt(i-1)) {
				dp[j][i]=1+dp[j-1][i-1];
			}else {
				dp[j][i]=0;
			}
		}
	}
	System.out.println(t.length()-dp[s.length()][t.length()]-1);
	}
}