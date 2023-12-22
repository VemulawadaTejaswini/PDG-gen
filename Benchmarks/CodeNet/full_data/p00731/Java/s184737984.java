import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static class State implements Comparable<State>{
		int x, y, cost, foot;
		State(int foot, int y, int x, int cost){
			this.foot=foot;
			this.y=y;
			this.x=x;
			this.cost=cost;
		}
		public int compareTo(State s) {
			return this.cost-s.cost;
		}
	}

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int w=sc.nextInt();
				int h=sc.nextInt();
				if(w+h==0) break;
				int INF=100000000;
				int[][] board=new int[h+1][w+1];
				int[][][] dist=new int[2][h+1][w+1];
				for(int i=1; i<=h; i++) {
					for(int j=1; j<=w; j++) {
						String str=sc.next();
						if(str.equals("S")) board[i][j]=-1;
						else if(str.equals("T")) board[i][j]=-2;
						else if(str.equals("X")) board[i][j]=INF;
						else board[i][j]=Integer.parseInt(str);
					}
				}
				PriorityQueue<State> pq=new PriorityQueue<>();
				for(int k=0; k<2; k++) {
					for(int i=1; i<=h; i++) {
						for(int j=1; j<=w; j++) {
							dist[k][i][j]=INF;
							if(board[i][j]==-1) {
								pq.add(new State(k, i, j, 0));//あらかじめ左startと右startいれておく
							}
						}
					}
				}

				while(!pq.isEmpty()) {//foot:0左 1右
					State state=pq.poll();
					if(dist[state.foot][state.y][state.x]<state.cost) continue;
					dist[state.foot][state.y][state.x]=state.cost;
					for(int j=1; j<=3; j++) {
						for(int i=-2; i<=2; i++) {
							if(j+Math.abs(i)<=3) {
								int ny=state.y+i;
								int nx=state.x+(state.foot==0?j:-j);
								if(0>ny || ny>h || 0>nx | nx>w) continue;
								if(board[ny][nx]==INF) continue;
								if(dist[1-state.foot][ny][nx]<INF) continue;
								pq.add(new State(1-state.foot,ny, nx, state.cost+(board[ny][nx]>0?board[ny][nx]:0)));
							}
						}
					}
				}
				int ret=INF;
				for(int k=0; k<2; k++) {
					for(int i=1; i<=h; i++) {
						for(int j=1; j<=w; j++) {
							if(board[i][j]==-2) {
								ret=Math.min(ret, dist[k][i][j]);
							}
						}
					}
				}
				System.out.println(ret>=INF? -1:ret);
				


			}

		}

	}
}
