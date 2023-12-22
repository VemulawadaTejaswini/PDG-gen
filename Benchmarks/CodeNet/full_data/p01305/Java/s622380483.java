import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int sum;
	static int[] a,b;
	static int[][] dp;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int test =sc.nextInt();test--!=0;){
			a=new int[9];
			b=new int[9];
			sum=0;
			for(int i=1;i<=18;i++){
				sum+=i;
			}
			dp=new int[sum][(1<<10)-1];
			for(int i=0;i<dp.length;i++){
				Arrays.fill(dp[i], -1);	
				
			}
			for(int i=0;i<9;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<9;i++){
				b[i]=sc.nextInt();
			}
			int q=1;
			for(int i=1;i<=9;i++){
				q*=i;
			}
			System.out.printf("%.5f %.5f\n",(double)dp(0,0)/(double)q,1.0-(double)dp(0,0)/(double)q);
			
		}
	}
	static int dp(int score,int used1){
		if(score>sum/2){
			int bc=9-Integer.bitCount(used1);
			int res=1;
			for(int i = 1;i<=bc;i++){
				res*=i;
			}
			return dp[score][used1]=res;
		}
		if(Integer.bitCount(used1)==9){
			return 0;
		}
//		System.out.println(Integer.toBinaryString(used1)+" "+Integer.toBinaryString(used2));
		if(dp[score][used1]!=-1)return dp[score][used1];
		int res=0;
		for(int i=0;i<9;i++){
			if(((1<<i)&used1)>0)continue;
			int j = Integer.bitCount(used1);
			if(a[i]>b[j]){
				res+=dp(score+a[i]+b[j],used1+(1<<i));
			}
			else{
				res+=dp(score,used1+(1<<i));
			}

		}
		
		
		
		return dp[score][used1]=res;
	}
}