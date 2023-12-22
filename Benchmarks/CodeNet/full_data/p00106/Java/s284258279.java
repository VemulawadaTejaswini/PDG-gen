import java.util.Scanner;

public class Main {

	static int[][][]dp;
	static int n,ans;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			n=cin.nextInt();
			if(n==0)break;
			dp=new int[26][25][24];
			ans=1<<30;
//			for(int i=0;i<n/100;i++)
			dp(0,0,0);
			System.out.println(ans);
		}
	}
	static int dp(int a,int b,int c){
//		System.out.println(n+" "+calcG(a,b,c));
		int g=calcG(a,b,c);
		if(g>n)return 0;
		if(g==n){
			ans=Math.min(ans,calcM(a,b,c));	
			return 0;
		}
		if(dp[a][b][c]!=0)return 0;
		dp[a][b][c]=1;
		dp(a+1,b,c);
		dp(a,b+1,c);
		dp(a,b,c+1);
		return dp[a][b][c];
	}
	static int calcG(int a,int b,int c){
		return 200*a + 300*b + 500*c;
	}
	static int calcM(int a,int b,int c){
		int re=0;
//		System.out.println(380*5*0.8);
//		System.out.println();
		re+=((380*5)*0.8)*(a/5);
		re+=380*(a%5);
		
		re+=((550*4)*0.85)*(b/4);
		re+=550*(b%4);
		
		re+=((850*3)*0.88)*(c/3);
		re+=850*(c%3);
		
		return re;
	}
}