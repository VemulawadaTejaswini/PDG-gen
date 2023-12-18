import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		int dp[][]=new int[H][N];
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextInt();
			B[i]=stdIn.nextInt();
		}
		for(int i=0;i<N;i++){
			int Nmax=0,now=0;
			for(int j=1;j<=H;j++){
				if(i==0){
					if(j>Nmax){
						Nmax+=A[i];
						now+=B[i];
					}
					dp[j-1][i]=now;
				}
				else{
					if(j>Nmax){
						Nmax+=A[i];now+=B[i];
					}
					if(j!=1&&dp[j-2][i]+B[i]<now)
						now=dp[j-2][i]+B[i];
					if(now<dp[j-1][i-1])
						dp[j-1][i]=now;
					else
						dp[j-1][i]=dp[j-1][i-1];
				}
			}
		}
		for(int i=0;i<H;i++){
			for(int j=0;j<N;j++){
				System.out.print(dp[i][j]+",");
			}
			System.out.println();
		}
		System.out.println(dp[H-1][N-1]);
	}
}
