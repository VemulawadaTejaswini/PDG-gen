
import java.util.Arrays;
import java.util.Comparator;
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
		Arrays.sort(v,Comparator.reverseOrder());
		long sum=0;
		long ans=0;
		for(int i=0;i<A;i++){
			sum+=v[i];
		}
		System.out.println(String.format("%.6f",(double)sum/(double)A));
		if(v[0]!=v[A-1]){
			int X=0;
			int Y=0;
			for(int i=0;i<N;i++){
				if(v[A-1]==v[i])X++;
			}
			for(int i=0;i<A;i++){
				if(v[A-1]==v[i])Y++;
			}
			ans+=combination(X,Y);
		}
		else if(v[0]==v[A-1]){
			int X=0;
			for(int i=0;i<N;i++){
				if(v[0]==v[i])X++;
			}
			for(int i=A;i<B+1;i++){
				ans+=combination(X,i);
			}
		}
		System.out.println(ans);
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

