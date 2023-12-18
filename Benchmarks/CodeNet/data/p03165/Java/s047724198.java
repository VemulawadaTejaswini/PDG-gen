import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		String str1 = sc.nextLine();
    	String str2 = sc.nextLine();
    	String[][] dp = new String[str1.length()+1][str2.length()+1];
    	for(int i=0;i<dp.length;i++)dp[i][0]="";
    	for(int i=0;i<dp[0].length;i++)dp[0][i]="";
    	for(int i=1;i<dp.length;++i){
    		for(int j=1;j<dp[0].length;j++){
    			if(str1.charAt(i-1)==str2.charAt(j-1)){
    				dp[i][j]=dp[i-1][j-1]+str1.charAt(i-1);
    			}else{
    				dp[i][j]=""+((dp[i][j-1].length()>dp[i-1][j].length())?dp[i][j-1]:dp[i-1][j]);
    			}
    		}
    	}
    	System.out.println(dp[str1.length()][str2.length()]);
	}
}