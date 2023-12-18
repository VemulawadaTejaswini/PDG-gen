import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine(), s2=br.readLine();
		String[][]dp=new String[s1.length()][s2.length()];
		for(int i=0;i<s1.length();i++)Arrays.fill(dp[i], "");
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j)){
					dp[i][j]=""+s1.charAt(i);
					if(i*j!=0)dp[i][j]=dp[i-1][j-1]+dp[i][j];
				}else{
					if(i==0&&j==0)continue;
					if(i==0)dp[i][j]=dp[i][j-1];
					else if(j==0)dp[i][j]=dp[i-1][j];
					else if(dp[i-1][j].length()>dp[i][j-1].length())dp[i][j]=dp[i-1][j];
					else dp[i][j]=dp[i][j-1];
				}
			}
		}
		System.out.println(dp[s1.length()-1][s2.length()-1]);
	}
}
