import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		new AOJ0156().doIt();
	}
	
	class AOJ0156{
		int mx,my;
		char[][] map;
		int[][] cost;
		int INF = Integer.MAX_VALUE/2;
		int[] sx,sy;
		void doIt(){
			sx = new int[4];sx[0]=0;sx[1]=1;sx[2]=0;sx[3]=-1;
			sy = new int[4];sy[0]=1;sy[1]=0;sy[2]=-1;sy[3]=0;
			while(true){
				mx = in.nextInt();
				my = in.nextInt();
				if(mx+my == 0)return;
				map = new char[my+2][mx+2];
				cost = new int[my+2][mx+2];
				for(int i=0;i<my+2;i++){
					Arrays.fill(map[i], '.');
					Arrays.fill(cost[i], -1);
				}
				for(int i=0;i<my;i++){
					char input[] = in.next().toCharArray();
					for(int s=0;s<mx;s++)map[i+1][s+1] = input[s];
				}
//				print();
				PriorityQueue<State> q = new PriorityQueue<State>();
				q.add(new State(0, 0, 0,false));int result = 0;
				while(q.size()>0){
					State now = q.remove();
//					System.out.println(now.x+" "+now.y+" "+now.cost);
					if(map[now.y][now.x]=='&'){
						result = now.cost;
						break;
					}
					for(int i=0;i<4;i++){
						int nx = now.x+sx[i];
						int ny = now.y+sy[i];
						if(nx<0||nx>=mx+2||ny<0||ny>=my+2)continue;
						if(cost[ny][nx]>=now.cost)continue;
						cost[ny][nx] = map[ny][nx]=='#'&&!now.isHori?now.cost+1:now.cost;
						boolean sw = map[now.y][now.x]!=map[ny][nx] && map[ny][nx]=='#';
						q.add(new State(nx, ny, cost[ny][nx], sw));
					}
				}
				System.out.println(result);
			}
		}		
		void print(){
			for(int i=0;i<my+2;i++){
				for(int s=0;s<mx+2;s++)System.out.print(map[i][s]);
				System.out.println();
			}
		}
		
		class State implements Comparable<State>{
			int x,y,cost;
			boolean isHori;
			public State(int x,int y,int cost,boolean isHori) {
				this.x = x;
				this.y = y;
				this.cost = cost;
				this.isHori = isHori;
			}
			public int compareTo(State o) {
				return cost-o.cost;
			}
		}
		
	}
	
}