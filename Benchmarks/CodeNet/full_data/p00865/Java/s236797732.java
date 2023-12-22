import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			int a=s.nextInt();
			int b=s.nextInt();
			int c=s.nextInt();
			if(a+b+c==0)System.exit(0);
			double dp[][]=new double[a+1][b*a+1];
			dp[0][0]=1.0;
			for(int i=0;i<a;i++){
				for(int j=i;j<=i*b;j++){
					for(int k=1;k<=b;k++)
						dp[i+1][j+k]+=dp[i][j]/b;
				}
			}
			double ret=0;
			for(int i=0;i<b*a+1;i++){
				ret+=(double)Math.max(1,i-c)*dp[a][i];
			//	System.out.println(dp[a][i]);
			}
			System.out.println(ret);
		}
	}
}