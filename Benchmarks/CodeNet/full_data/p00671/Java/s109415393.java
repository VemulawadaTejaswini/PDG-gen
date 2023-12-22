import java.util.Scanner;

//Live Schedule
public class Main{

	int C, D, W, X;
	int[][] E, F;
	int[][][][][] dp;
	
	int get(int d, int w, int x, int base, int p){
		if(d==D||x<0)return 0;
		if(dp[d][w][x][base][p]!=-1)return dp[d][w][x][base][p];
		int res = 0;
		if(d+1<D)for(int c=0;c<C;c++)if(E[c][d+1]!=0&&0<=w-F[c][d+1])res = Math.max(res, E[c][d+1]+get(d+1, w-F[c][d+1], x, c, c));
		if(base==p&&0<x){
//			if(0<=p-1&&E[p-1][d]!=0&&0<=w-F[p-1][d])res = Math.max(res, E[p-1][d]+get(d, w-F[p-1][d], x-1, base, p-1));
			if(p+1<C&&E[p+1][d]!=0&&0<=w-F[p+1][d])res = Math.max(res, E[p+1][d]+get(d, w-F[p+1][d], x-1, base, p+1));
		}
		if(base!=p&&p+1<D){
//			if(p<base){
//				if(0<=p-1&&E[p-1][d]!=0&&0<=w-F[p-1][d])res = Math.max(res, E[p-1][d]+get(d, w-F[p-1][d], x, base, p-1));
//			}
//			else{
				if(p+1<C&&E[p+1][d]!=0&&0<=w-F[p+1][d])res = Math.max(res, E[p+1][d]+get(d, w-F[p+1][d], x, base, p+1));
//			}
		}
		return dp[d][w][x][base][p] = res;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		dp = new int[30][51][6][15][15];
		for(;;){
			C = sc.nextInt(); D = sc.nextInt(); W = sc.nextInt(); X = sc.nextInt();
			if((C|D|W|X)==0)break;
			E = new int[C][D]; F = new int[C][D];
			for(int i=0;i<C;i++)for(int j=0;j<D;j++)E[i][j]=sc.nextInt();
			for(int i=0;i<C;i++)for(int j=0;j<D;j++)F[i][j]=sc.nextInt();
			for(int i=0;i<D;i++)for(int j=0;j<=W;j++)for(int k=0;k<=X;k++)for(int l=0;l<C;l++)for(int m=0;m<C;m++)dp[i][j][k][l][m]=-1;
			int res = 0;
			for(int c=0;c<C;c++)for(int day=0;day<D;day++)if(E[c][day]!=0&&0<=W-F[c][day])res = Math.max(res, E[c][day]+get(day, W-F[c][day], X, c, c));
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}