/**
 * 
 */
//package AtCoder;
import java.util.*;
/**
 * @author Shivansh Singh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,n,W;
		n=sc.nextInt();
		W=sc.nextInt();
		int []w=new int[n];
		int []v=new int[n];
		for (i=0;i<n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		long [][]dp=new long[n+1][W+1];
		for (i=0;i<=n;i++)
			dp[i][0]=0;
		for (i=0;i<=W;i++)
			dp[0][i]=0;
		for (i=1;i<=n;i++) {
			for (j=1;j<w[i-1];j++)
				dp[i][j]=dp[i-1][j];
			for (;j<=W;j++) {
				dp[i][j]=(long)Math.max(dp[i-1][j],(dp[i-1][(int)(j-w[i-1])]+v[i-1]));
			}
		}
//		for (i=0;i<=n;i++) {
//			for (j=0;j<=W;j++) {
//				System.out.print(dp[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println(dp[(int)n][(int)W]);
		sc.close();
	}

}
