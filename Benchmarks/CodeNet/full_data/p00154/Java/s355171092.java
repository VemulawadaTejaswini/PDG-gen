import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int sum,n,ans;
	static int[][] card,dp;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			n=cin.nextInt();
			if(n==0)break;
			card=new int[n][2];
			for(int i=0;i<n;i++){
				card[i][0]=cin.nextInt();
				card[i][1]=cin.nextInt();
			}
			for(int games=cin.nextInt();games--!=0;){
				sum=cin.nextInt();
				ans=0;
				dp=new int[n][1001];
				for(int i=0;i<n;i++){
					Arrays.fill(dp[i],-1);
					
				}
				System.out.println(search(0,0));
//				System.out.println(ans);
			}
		}
	}
	static int search(int a,int b){
		if(b>sum)return 0;
		if(a!=n&&dp[a][b]!=-1)return dp[a][b];
		if(b==sum){
//			ans++;
			return 1;
		}
		if(a==n)return 0;
		int add=0;
		int re=0;
		re+=search(a+1,b+add);
		for(int i=0;i<card[a][1];i++){
			add+=card[a][0];
			re+=search(a+1,b+add);
		}
		return dp[a][b]=re;
	}
}