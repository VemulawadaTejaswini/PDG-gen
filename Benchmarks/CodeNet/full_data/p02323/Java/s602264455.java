import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int V=sc.nextInt();//頂点数
			int E=sc.nextInt();//辺の数
			int s;//頂点
			int t;//頂点
			double[][] dist=new double[V+1][V+1];//辺の長さ(st距離)
			double[][] dp=new double[1<<V][V];
			double INF=1e100;
			
			for(int i=0; i<V; i++) {
				for(int j=0; j<V; j++) {
					dist[i][j]=INF;
				}
			}
			
			for(int i=0; i<E; i++) {
				s=sc.nextInt();
				t=sc.nextInt();
				dist[s][t]=sc.nextInt();
			}
			for(int i=0; i<(1<<V); i++) {
				for(int j=0; j<V; j++) {
					dp[i][j]=INF;
				}
			}
			dp[1][0]=0;//頂点0からスタートだから
			
			for(int i=0; i<(1<<V); i++) {
				for(int j=0; j<V; j++) {//現在いる頂点j
					if(dp[i][j]==INF) continue;
					for(int k=0; k<V; k++) {//次の行き先頂点k
						if((1&i>>k)==1) continue;//すでに訪れてるとき
						else if(dist[j][k]==INF) continue;//辺がないとき
						int nexti = i| (1<<k);//bitごとのOR演算(今まで通ってきた頂点に次の頂点を足せる) 
						//System.out.printf("nexti=%d\n", nexti);
						double nextd=dp[i][j]+dist[j][k];
						dp[nexti][k]=Math.min(dp[nexti][k], nextd);
					}
				}
			}
//			for(int i=0; i<(1<<V); i++) {
//				for(int j=0; j<V; j++) {
//					System.out.printf("dp[%d][%d]=%f\n", i, j, dp[i][j]);
//				}
//			}
			int all=(1<<V)-1;//最後の全部bitたっている状態
			double ret=INF;
			for(int i=0; i<V; i++) {//最後頂点0に戻る分の距離を足す
				if(dp[all][i]==INF) {
					continue;
				}
				else if(dist[i][0]==INF) continue;//頂点0にもどれないとき
				double temp = dp[all][i]+dist[i][0];
				ret=Math.min(ret, temp);
			}
			if(ret==INF) {
				ret=-1;
			}//bitが全部たたない
			System.out.println((int)ret);
			

		}
	}
}
