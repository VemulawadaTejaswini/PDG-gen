import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static class State{
		int x,y, cost;
		State(int x,int y, int cost){
			this.x=x;
			this.y=y;
			this.cost=cost;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int w=sc.nextInt();
				int h=sc.nextInt();
				if(w+h==0) break;
				int xs=sc.nextInt();
				int ys=sc.nextInt();
				int xg=sc.nextInt();
				int yg=sc.nextInt();
				int n=sc.nextInt();
				int[][] field=new int[h+1][w+1];
				int color=0;
				while(n-->0) {
					int c=sc.nextInt();
					int d=sc.nextInt();
					int x=sc.nextInt();
					int y=sc.nextInt();
					if(d==0) {
						for(int i=0; i<2; i++) {
							for(int j=0; j<4; j++) {
								field[y+i][x+j]=c;
								if(y+i==ys && x+j==xs) color=c;
							}
						}
					}else {
						for(int i=0; i<4; i++) {
							for(int j=0; j<2; j++) {
								field[y+i][x+j]=c;
								if(y+i==ys && x+j==xs) color=c;
							}
						}
					}
				}
				Queue<State> q=new LinkedList<>();
				int[][] minstep=new int[h+1][w+1];
				int INF=100000000;
				int[] dx= {1, 0, -1, 0};
				int[] dy= {0, 1, 0, -1};
				for(int i=1; i<=h; i++) {
					for(int j=1; j<=w; j++) {
						minstep[i][j]=INF;
					}
				}
				q.add(new State(xs, ys, 0));
				while(!q.isEmpty()) {
					State state=q.poll();
					if(minstep[state.y][state.x]<INF) continue;
					minstep[state.y][state.x]=state.cost;
					if(state.x==xg&&state.y==yg) break;
					for(int i=0; i<4; i++) {
						if(state.x+dx[i]<1 || state.x+dx[i]>w || state.y+dy[i]<1 || state.y+dy[i]>h) {
							continue;
						}
						if(field[state.y+dy[i]][state.x+dx[i]]==color) {
							q.add(new State(state.x+dx[i], state.y+dy[i], state.cost+1));
						}
					}
				}
				System.out.println(minstep[yg][xg]==INF? "NG":"OK");
				q.clear();
			}
		}

	}
}
