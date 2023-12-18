import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int N=stdIn.nextInt();
		int A[]=new int[N];
		int B[]=new int[N];
		int dp[]=new int[H];
		for(int i=0;i<N;i++){
			A[i]=stdIn.nextInt();
			B[i]=stdIn.nextInt();
		}
		for(int i=0;i<H;i++){
			for(int j=0;j<N;j++){
				int x=0;
				if(i-A[j]<0)
					x=B[j];
				else
					x=B[j]+dp[i-A[j]];
				if(x<dp[i]||dp[i]==0)
					dp[i]=x;
			}
		}
		System.out.println(dp[H-1]);
	}
}
