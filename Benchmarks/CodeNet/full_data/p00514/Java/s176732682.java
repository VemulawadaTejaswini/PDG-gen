import java.math.BigInteger;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n,m,r;
		n=scanner.nextInt();
		m=scanner.nextInt();
		r=scanner.nextInt();
		r-=n*m;
		if(r<0){
			System.out.println(0);
		}else{
			BigInteger[][] dp=new BigInteger[2][r+2];
			for(int i=0;i<2;i++){
				for(int j=0;j<r+2;j++){
					dp[i][j]=BigInteger.ZERO;
				}
			}
			dp[n&1][r]=BigInteger.ONE;
			for(int i=n-1;i>=0;i--){
				for(int j=r;j>=0;j--){
					dp[i&1][j]=dp[i&1][j+1].add(dp[i+1&1][j]);
				}
			}
			System.out.println(dp[0][0]);
		}
	}

}