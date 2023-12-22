import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){		
		new AOJ1104();
	}
	
	class AOJ1104{
		int x,y,mx,my,muki=3;
		public AOJ1104() {
			while(true){
				x = 1;y = 1;
				mx = in.nextInt();
				my = in.nextInt();
				if(mx+my==0)break;
				while(true){
					if(doit(in.next()))break;
				}
				System.out.println(x+" "+y);
			}
			
		}
		
		boolean doit(String meirei){
			int num=0;
			if(meirei.equals("FORWARD")||meirei.equals("BACKWARD")){
				num=in.nextInt();
				if(meirei.equals("FORWARD")){
					int nx[] = {1,0,-1,0};
					int ny[] = {0,-1,0,1};
					for(int i=0;i<num;i++){
						if(x+nx[muki]<=0||x+nx[muki]>mx||y+ny[muki]<=0||y+ny[muki]>my)break;
						x+=nx[muki];
						y+=ny[muki];
					}
				}else{
					int nx[] = {-1,0,1,0};
					int ny[] = {0,1,0,-1};
					for(int i=0;i<num;i++){
						if(x+nx[muki]<=0||x+nx[muki]>mx||y+ny[muki]<=0||y+ny[muki]>my)break;
						x+=nx[muki];
						y+=ny[muki];
					}
				}
			}else if(meirei.equals("STOP")){
				return true;
			}else if(meirei.equals("RIGHT")){
				//右=0,下=1,左=2,上=3(向き)
				muki = (muki+1)%4;
			}else if(meirei.equals("LEFT")){
				muki = (muki+3)%4;
			}
			return false;
		}
	}

			
			
	class AOJ2503{
		int MAX = 0;
		public AOJ2503() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();

			int[][] cost = new int[n][n];

			int[] dp = new int[n];
			for(int i=0;i<n*n;i++){
				cost[i/n][i%n]=MAX;
			}
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b]=in.nextInt();
			}	
			//			TODO 一番大きいパスを0のポイントからn-1のポイントまでの

			for(int s=1;s<n;s++){
				for(int i=0;i<=s;i++){
					if(cost[i][s]==MAX)continue;
					dp[s]=Math.max(dp[s],dp[i]+cost[i][s]);
				}
			}
			for(int s=0;s<n;s++)for(int i=0;i<n;i++){
				if(cost[s][i]==MAX)continue;
				dp[i]=Math.max(dp[s]+cost[s][i],dp[i]);
			}
			for(int i=0;i<n;i++)System.out.print(dp[i]+" ");
			System.out.println();
			System.out.println(dp[n-1]);
		}
	}
}