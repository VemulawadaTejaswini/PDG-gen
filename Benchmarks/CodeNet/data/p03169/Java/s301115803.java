import java.util.*;
public class Main {
	static int N, num[];
	static double dp[][][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		num = new int[3]; //要素番号＋１個の寿司が乗った皿の数
		for(int i=0;i<N;i++) {
			int a = sc.nextInt()-1;
			num[a]++;
		}
 		sc.close();
 		
 		dp = new double[N+1][N+1][N+1];//dp[i][j][k]:= 3貫の皿i枚, 2:j枚,1:k枚の状態から食べ終わるまでの期待回数
 		for(int i=0;i<N+1;i++) {
 			for(int j=0;j<N+1;j++) {
 				for(int k=0;k<N+1;k++) {
 					dp[i][j][k]=-1;
 				}
 			}
 		}

 		double ans = rec(num[2],num[1],num[0]);
 		System.out.println(ans);
	}
	static double rec(int i, int j,int k) {
		if(i==0&&j==0&&k==0)return 0;
		if(dp[i][j][k]!=-1)return dp[i][j][k];
		double ret = 0;
		if(i-1>=0)ret += (double)i * rec(i-1,j+1,k);
		if(j-1>=0)ret += (double)j * rec(i,j-1,k+1); 
		if(k-1>=0)ret += (double)k * rec(i,j,k-1);
		ret += (double)N;
		ret /= (i+j+k);
		return dp[i][j][k] = ret;
	}
	
}
