import java.util.Scanner;

public class Main {

	static int N,T,L,B;
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			N=cin.nextInt();
			T=cin.nextInt();
			L=cin.nextInt();
			B=cin.nextInt();
			if(N==0)break;
			int[] a = new int[N+1];
			double[][] dp=new double[T+1][N+1];
			for(int i=0;i<L;i++){
				a[cin.nextInt()]=1;
			}
			for(int i=0;i<B;i++){
				a[cin.nextInt()]=2;
			}
			dp[0][0]=1.0;
			/*
			for(int i=0;i<T;i++){
				for(int j=0;j<N;j++){
					if(a[j]==0){
						for(int k=1;k<=6;k++){
							int next=j+k;
							if(next>N){
								next= N - (next%(N));
							}
							dp[i+1][next]+=dp[i][j]/6.0;
						}
					}
					else if(a[j]==1){
						if(i+2<=T){
							for(int k=1;k<=6;k++){
								int next=j+k;
								if(next>N){
									next= N - (next%(N));
								}
								dp[i+2][next]+=dp[i][j]/6.0;
							}							
						}
					}
					else if(a[j]==2){
						dp[i+1][0]+=dp[i][j];
					}
				}
			}*/
			for(int i=0;i<T;i++){
				for(int j=0;j<N;j++){
					double dt=dp[i][j]/6.0;
					for(int k=1;k<=6;k++){	
						int next=j+k;
						if(next>N){
							next= N - (next%(N));
						}
						if(a[next]==0){
							dp[i+1][next]+=dt;
						}
						else if(a[next]==1){
							if(i+2<=T)
								dp[i+2][next]+=dt;
						}
						else{
							dp[i+1][0]+=dt;
						}
					}
				}
			}
			for(int i=0;i<=T;i++){
				for(int j=0;j<=N;j++){
//					System.out.printf("%.4f ",dp[i][j]);
				}
//				System.out.println();
//				System.out.println();
			}
			double ans=0.0;
			for(int i=0;i<T+1;i++){
				ans+=dp[i][N];
			}
			System.out.printf("%.6f\n",ans);
			
		}
	}
}