import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ1166().doIt();
	}

	class AOJ1166{
		int w,h;
		int tate[][];
		int yoko[][];
		void solve(){
			int[][] memo = new int[h][w];
			for(int i=0;i<h;i++)Arrays.fill(memo[i], Integer.MAX_VALUE);
			memo[0][0] = 0;
			PriorityQueue<State> q = new  PriorityQueue<State>();
			q.add(new State(0, 0, 0));
			int sx[] = {0,1,0,-1};
			int sy[] = {-1,0,1,0};
			int result = -1;
			while(q.size()>0){
				State now = q.remove();
				int x = now.x;
				int y = now.y;
				int cost = now.cost;
				if(x==w-1&&y==h-1){
					result = cost;
					break;
				}
				for(int i=0;i<4;i++){
					int nx = x+sx[i];
					int ny = y+sy[i];
					if(nx<0||nx>=w||ny<0||ny>=h)continue;
					if(i==1){
						if(yoko[ny][x]==1)continue;
					}else if(i==3){
						if(yoko[ny][nx]==1)continue;
					}else if(i==2){
						if(tate[y][nx]==1)continue;
					}else if(i==0){
						if(tate[ny][nx]==1)continue;
					}
					if(memo[ny][nx]<=cost+1)continue;
					q.add(new State(nx, ny, cost+1));
					memo[ny][nx] = cost+1;
				}
			}
//			System.out.println();
//			for(int i=0;i<h;i++){
//				for(int s=0;s<w;s++)System.out.print(memo[i][s]+" ");
//				System.out.println();
//			}
			
			System.out.println(result+1);
		}
		
		void doIt(){
			while(in.hasNext()){
				w = in.nextInt();
				h = in.nextInt();
				if(w+h==0)break;
				yoko = new int[h][w-1];
				tate = new int[h+1][w];
				for(int i=0;i<2*h-1;i++){
					if(i%2==0)for(int s=0;s<w-1;s++)yoko[i/2][s] = in.nextInt();
					else if(i%2==1)for(int s=0;s<w;s++)tate[i/2][s] = in.nextInt();
				}
				
//				for(int i=0;i<h;i++){
//					for(int s=0;s<w-1;s++)System.out.print(yoko[i][s]+" ");
//					System.out.println();
//				}
//				System.out.println();
//				for(int i=0;i<=h;i++){
//					for(int s=0;s<w;s++)System.out.print(tate[i][s]+" ");
//					System.out.println();
//				}
				solve();
			}
		}
		
		class State implements Comparable<State>{
			int x,y,cost;
			public State(int x,int y,int cost) {
				this.x = x;
				this.y = y;
				this.cost = cost;
			}
			public int compareTo(State o) {
				return cost - o.cost;
			}
		}
		
	}

}