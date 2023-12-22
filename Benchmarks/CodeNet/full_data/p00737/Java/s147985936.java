import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	0: 「直進」命令
	1: 「右折」命令
	2: 「反転」命令
	3: 「左折」命令
	4: 「停止」命令
	 */
	static int H,W;
	static int[][] field;
	static int[][][] dp;
	static int[] cost;
	static int[] v1={0,1,0,-1};
	static int[] v2={1,0,-1,0};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			W=cin.nextInt();
			H=cin.nextInt();
			if(H+W==0)break;
			field=new int[H][W];
			dp=new int[H][W][5];
			cost=new int[4];
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					field[i][j]=cin.nextInt();
					Arrays.fill(dp[i][j], 1<<30);
				}
			}
			for(int i=0;i<4;i++){
				cost[i]=cin.nextInt();
			}
			dp(0,0,0,0);
			int min=1<<30;
			for(int i=0;i<5;i++){
//				System.out.println(dp[H-1][W-1][i]);
				if(min>dp[H-1][W-1][i]){
					
					min=dp[H-1][W-1][i];
				}
			}
			System.out.println(min);
		}
	}
	static int dp(int h,int w,int dir,int c){
//		System.out.println(h+" "+w+" "+dir+" "+c);
		if(dp[h][w][dir]<=c)
			return dp[h][w][dir];
		int re=-1;
		dp[h][w][dir]=c;
		// 床に書いてあるまま動く
		 if(field[h][w]!=4){
			int newDir=change(field[h][w],dir);
			int hh=h+v1[newDir];
			int ww=w+v2[newDir];
			if(hh<0||ww<0||hh>=H||ww>=W){
				
			}
			else{
				dp(hh,ww,newDir,c);
			}
		}
		
		// 命令を実行
		for(int i=0;i<4;i++){
			if(field[h][w]==i)continue;
			int newDir=change(i,dir);
			int hh=h+v1[newDir];
			int ww=w+v2[newDir];
			if(hh<0||ww<0||hh>=H||ww>=W){
				
			}
			else{
				re=Math.min(re,dp(hh,ww,newDir,c+cost[i]));
			}
		}
		return re;
	}
	
	static int change(int command,int dir){
		if(command==0||command==4)return dir;
		else if(command==1){
			return (dir+1)%4;
		}
		else if(command==2){
			return (dir+2)%4;
		}
		else if(command==3){
			return (dir+3)%4;
		}
		return 0;
	}
}