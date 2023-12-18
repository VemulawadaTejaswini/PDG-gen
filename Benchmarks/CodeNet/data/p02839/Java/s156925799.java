import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt();
		int A[][] = new int[H][W], B[][]= new int[H][W], C[][]=new int[H][W];
		for(int i=0;i<H;i++) for(int j=0;j<W;j++) A[i][j]=sc.nextInt();
		for(int i=0;i<H;i++) for(int j=0;j<W;j++) B[i][j]=sc.nextInt();
		sc.close();
		for(int i=0;i<H;i++) for(int j=0;j<W;j++) C[i][j]=Math.abs(A[i][j]-B[i][j]);
		
		//c配列だけ見て、値の符号をうまく決めて、合計で０に近づけられる道を決める。
		//そんなうまい方法が見つからない→DP
		
		boolean dp[][][] = new boolean[H][W][80*(H+W+5)]; //dp[h][w][k] := (h,w)にいるときに和kが作れるかいなか
		//initialize
		dp[0][0][C[0][0]]=true;
		for(int h=0;h<H;h++) {
			for(int w=0;w<W;w++) {
				for(int k=0;k<=80*(h+w+1);k++) {
					if(dp[h][w][k]==true) {
						//h+1
						if(h!=H-1) {
							int hi = k + C[h+1][w];
							int lo = Math.abs(k - C[h+1][w]);
							dp[h+1][w][hi]=dp[h+1][w][lo]=true;
						}
						//w+1
						if(w!=W-1) {
							int hi = k + C[h][w+1];
							int lo = Math.abs(k - C[h][w+1]);
							dp[h][w+1][hi]=dp[h][w+1][lo]=true;
						}
					}
				}
			}
		}		
		for(int i=0;i<dp[0][0].length;i++) {
			if(dp[H-1][W-1][i]==true) {
				System.out.println(i);
				return;
			}
		}
		sc.close();
	}
}
