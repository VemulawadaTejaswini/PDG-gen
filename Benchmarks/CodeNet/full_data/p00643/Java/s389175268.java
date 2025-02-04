import java.util.PriorityQueue;
import java.util.Scanner;
//キューでやってみた

public class Main {
	
	class P implements Comparable<P>{
		int y;
		int x;
		int top;
		int front;
		int left;
		int cost;
		P(int y,int x,int top,int front,int left,int cost){
			this.y=y;
			this.x=x;
			this.top=top;
			this.front=front;
			this.left=left;
			this.cost=cost;
		}
		@Override
		public int compareTo(P o) {
			// TODO 自動生成されたメソッド・スタブ
			if(this.cost < o.cost){
				return -1;
			}
			else if(this.cost > o.cost){
				return 1;
			}
			else return 0;
		}
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();
	}

	final int INF=2<<29;//初期値用
	int nx[] = {0,1,0,-1};//移動用
	int ny[] = {-1,0,1,0};
	int map[][];//マップの床に書いてあるのいれておくやつ

	void run(){
		Scanner sc=new Scanner(System.in);
		int h,w;
		int cost[][][][][];//y座標,x座標,サイコロの上面、全面、左側のときのスタートからy,xまでのコストをいれておくやつ
		int s[]=new int[2];//スタートのy,x座標
		int g[]=new int[2];//ゴールの

		while(true){
			h = sc.nextInt();
			w = sc.nextInt();

			if(h + w == 0) break;

			cost=new int[h][w][7][7][7];//後ろ3つはサイコロのTop,Front,Left

			for(int a=0;a<h;a++){
				for(int b=0;b<w;b++){
					for(int c=1;c<7;c++){
						for(int d=1;d<7;d++){
							for(int e=1;e<7;e++){
								cost[a][b][c][d][e]=INF;
							}
						}
					}
				}
			}



			map=new int[h][w];

			for(int i = 0;i<h;i++){
				for(int j = 0;j<w;j++){
					map[i][j]=sc.nextInt();
				}
			}//for
			s[0]=sc.nextInt();
			s[1]=sc.nextInt();
			g[0]=sc.nextInt();
			g[1]=sc.nextInt();
			cost[s[0]][s[1]][1][2][4]=0;//最初のサイコロの向きは確定なので、これはコスト0にしておく
			System.out.println(dijkstra(cost, s[0], s[1], g[0], g[1], h, w));
		}

	}
	
	int dijkstra(int cost[][][][][],int sy,int sx,int gy,int gx,int h,int w){
		PriorityQueue<P> q=new PriorityQueue<P>();
		q.add(new P(sy,sx,1,2,4,0));
		int x,y,t,f,l;
		boolean use[][][][][]=new boolean[h][w][7][7][7];
		for(int a=0;a<h;a++){
			for(int b=0;b<w;b++){
				for(int c=1;c<7;c++){
					for(int d=1;d<7;d++){
						for(int e=1;e<7;e++){
							use[a][b][c][d][e]=false;
						}
					}
				}
			}
		}
		while(!q.isEmpty()){
			x=y=t=f=l=-1;
			//まだ使ってないやつで、最小の奴
			//これをpraiolryqueueにするとTLEを脱出できるかも
//			for(int a=0;a<h;a++){
//				for(int b=0;b<w;b++){
//					for(int c=1;c<7;c++){
//						for(int d=1;d<7;d++){
//							for(int e=1;e<7;e++){
//								if(!use[a][b][c][d][e] && 
//										(x==-1 || cost[a][b][c][d][e]<cost[y][x][t][f][l])){
//									y=a;x=b;t=c;f=d;l=e;
//								}
//							}
//						}
//					}
//				}
//			}
			P p=q.poll();
			y=p.y;
			x=p.x;
			t=p.top;
			f=p.front;
			l=p.left;
			if(use[y][x][t][f][l]) continue;
			//System.out.println(y+" "+x);

			//if(x==-1) break;
			//System.out.println(y+" "+x);
			use[y][x][t][f][l]=true;

			//今回の移動は4方向
			//それにあわせてのサイコロの目の変化にあわせて計算
			for(int i=0;i<4;i++){
				//移動できるかどうかのチェック 壁チェック
				if(y+ny[i]<0 || x+nx[i]<0 || h<=y+ny[i] || w<=x+nx[i]) continue;
				if(i==0){
					cost[y+ny[i]][x+nx[i]][f][7-t][l]=
							Math.min(cost[y+ny[i]][x+nx[i]][f][7-t][l], cost[y][x][t][f][l]+(map[y+ny[i]][x+nx[i]]*(7-f)));
					q.add(new P(y+ny[i],x+nx[i],f,7-t,l,cost[y+ny[i]][x+nx[i]][f][7-t][l]));
				}
				else if(i==1){
					cost[y+ny[i]][x+nx[i]][l][f][7-t]=
							Math.min(cost[y+ny[i]][x+nx[i]][l][f][7-t], cost[y][x][t][f][l]+(map[y+ny[i]][x+nx[i]]*(7-l)));
					q.add(new P(y+ny[i],x+nx[i],l,f,7-t,cost[y+ny[i]][x+nx[i]][l][f][7-t]));
				}
				else if(i==2){
					cost[y+ny[i]][x+nx[i]][7-f][t][l]=
							Math.min(cost[y+ny[i]][x+nx[i]][7-f][t][l], cost[y][x][t][f][l]+(map[y+ny[i]][x+nx[i]]*f));
					q.add(new P(y+ny[i],x+nx[i],7-f,t,l,cost[y+ny[i]][x+nx[i]][7-f][t][l]));
				}
				else if(i==3){
					cost[y+ny[i]][x+nx[i]][7-l][f][t]=
							Math.min(cost[y+ny[i]][x+nx[i]][7-l][f][t], cost[y][x][t][f][l]+(map[y+ny[i]][x+nx[i]]*l));
					q.add(new P(y+ny[i],x+nx[i],7-l,f,t,cost[y+ny[i]][x+nx[i]][7-l][f][t]));
				}
			}
		}
		int ans=INF;
		//ゴールについたものの中で最小を見つける
		for(int c=1;c<7;c++){
			for(int d=1;d<7;d++){
				for(int e=1;e<7;e++){
					ans=Math.min(ans, cost[gy][gx][c][d][e]);
				}
			}
		}

		return ans;
	}

}