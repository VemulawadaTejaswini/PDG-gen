import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long k=sc.nextInt();

		//青と赤のそれぞれの区切り方をかける//
		int mod=1_000_000_007;
		long[][] com=new long[2001][2001];
		for(int i=1;i<2001;i++){
			for(int j=1;j<=i;j++){
				com[i][j]=com[i-1][j-1]+com[i-1][j];
				com[i][j]%=mod;
			}
		}
		for(int i=1;i<=k;i++){
			long ans=com[n-k+1][i]*com[k-1][i-1];
			ans%=mod;
			System.out.println(ans);
		

			
		}
	}
}