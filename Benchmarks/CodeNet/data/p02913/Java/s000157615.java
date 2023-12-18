import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int[][] dp=new int[n+1][n+1];
		int ans=0;
		for(int i=n-1; i>=0; i--){
			for(int j=i; j>=0; j--){
				if(s.charAt(i)==s.charAt(j)){
					dp[i][j]=dp[i+1][j+1]+1;
				}else{
					dp[i][j]=dp[i+1][j+1];
				}
				ans=Math.max(ans,Math.min(dp[i][j],i-j));
			}
		}
		System.out.println(ans);
	}
}
