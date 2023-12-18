import java.util.Scanner;
import java.math.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		//s.charAt(i); for String
		// 出力
		//System.out.println("");
		//int count=0;
		
	
	
		int N=sc.nextInt();
		long M=sc.nextLong();
		
		long[] A=new long[N];
		long ans=0;
 
		long[][] dp=new long[N][N];//dp[l][r]=mod
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextLong();
			dp[i][i]=A[i]%M;
			if(dp[i][i]==0){
				ans++;
			}
		}
		for(int i=0;i<N;i++){
			for(int j=i+1;j<N;j++){
				dp[i][j]=(dp[i][j-1]+dp[j][j])%M;
				//System.out.println("ij"+i+","+j+",dp:"+dp[i][j]);
				if(dp[i][j]%M==0){
					ans++;
					//System.out.println("ij"+i+","+j+",dp:"+dp[i][j]);
				}
			}
		}
		
		//ans=Long.MAX_VALUE-1;
		System.out.println(ans);
	}
	
	
}