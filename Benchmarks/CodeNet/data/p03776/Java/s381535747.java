import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		Long[] v=new Long[N];
		for(int i=0;i<N;i++){
			v[i]=sc.nextLong();
		}
		Arrays.sort(v);
		long sum=0;
		for(int i=N-1;i>=N-A;i--){
			sum+=v[i];
		}
		System.out.println((double)sum/(double)A);
		//選んだA個の中でv[N-A]と同じ数の個数
		int count1=1;
		for(int i=N-A+1;i<N;i++){
			if(v[i]==v[N-A])count1++;
			else break;
		}
		//vの中でv[N-A]と同じ数の個数
		int count2=count1;
		for(int i=N-A-1;i>=0;i--){
			if(v[i]==v[N-A])count2++;
			else break;
		}
		long count=0;
		if(count1==A){
			for(int i=A;i<B;i++){
				count+=combination(count2,i);
			}
		}else{
			count=combination(count2,count1);
		}
		System.out.println(count);
	}
	
	static long combination(int a,int b){
		long[][] dp=new long[a+1][b+1];
		dp[0][0]=1;
		for(int i=1;i<=a;i++){
			for(int j=0;j<=b;j++){
				if(j-1>=0){
					dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
				}else{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[a][b];
	}
}

