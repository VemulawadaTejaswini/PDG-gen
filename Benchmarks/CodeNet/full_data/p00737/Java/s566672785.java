import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	static class State implements Comparable <State>{
		int dist, y, x, dir;
		State(int dist, int y, int x, int dir){
			this.dist=dist;
			this.y=y;
			this.x=x;
			this.dir=dir;
		}
		public int compareTo(State s) {
			return this.dist-s.dist;
		}
	}
	
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			while(sc.hasNext()) {
				int w=sc.nextInt();
				int h=sc.nextInt();
				if(w==0) break;
				int inf=100000000;
				int[][] board=new int[h][w];
				int[] cost=new int[5];//命令に払うcost
				int[] dy= {0, 1, 0, -1};//進む方向
				int[] dx= {1, 0, -1, 0};
				
				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {
						board[i][j]=sc.nextInt();
					}
				}
				for(int i=0; i<4; i++) {
					cost[i]=sc.nextInt();
				}
				
				int[][][] d=new int[h][w][5];//座標と向き
				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {
						for(int k=0; k<4; k++) {
							d[i][j][k]=inf;
						}
					}
				}
				PriorityQueue<State> pq=new PriorityQueue<State>();
				pq.add(new State(0, 0, 0, 0));
				while(! pq.isEmpty()) {
					State p=pq.poll();
					if(p.y==h-1 && p.x==w-1) {
						System.out.println(p.dist);
						break;
					}
					if(d[p.y][p.x][p.dir]!=inf) {
						continue;
					}
					d[p.y][p.x][p.dir]=p.dist;
					System.out.println("p.dir="+p.dir);
					for(int k=0; k<4; k++) {//向きを全方向やる
						int ndir=(p.dir+k)%4;
						int ny=p.y+dy[ndir], nx=p.x+dx[ndir];
						if(0<=ny && ny<h && 0<=nx && nx<w && d[ny][nx][ndir]==inf) {
							int ndist=p.dist+(board[p.y][p.x]==k ? 0:cost[k]);
							System.out.println("ndist="+ndist+" ny="+ny+" nx="+nx+" ndir="+ndir);
							pq.add(new State(ndist, ny, nx, ndir));
						}
					}
					System.out.println();
					
				}
				
				
			}
		}
	}
} 
