import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0223().doIt();
	}

	class AOJ0223{
		int x,y;
		
		void solve(){
			Person p1 = new Person(in.nextInt()-1, in.nextInt()-1);
			Person p2 = new Person(in.nextInt()-1, in.nextInt()-1);
			int[][] map = new int[y][x];
			int[][][][] memo = new int[y][x][y][x];
			int INF = Integer.MAX_VALUE/2;
			for(int i=0;i<y;i++)for(int s=0;s<x;s++)for(int k=0;k<y;k++)for(int r=0;r<x;r++)memo[i][s][k][r]=INF;
			memo[p1.y][p1.x][p2.y][p2.x] = 0;
			for(int i=0;i<y;i++)for(int s=0;s<x;s++)map[i][s] = in.nextInt();
			LinkedList<Data> q = new LinkedList<Data>();
			q.add(new Data(p1,p2,0));
			int sx[] = {1,0,-1,0};
			int sy[] = {0,1,0,-1};
			int sx2[] = {-1,0,1,0};
			int sy2[] = {0,-1,0,1};
			boolean isNA = true;
			int result = 0;
			while(q.size()>0){
				Data data = q.remove();
				Person t = data.p1;
				Person k = data.p2;
				if(data.cost>=100)continue;
				if(memo[t.y][t.x][k.y][k.x]<data.cost)continue;
				memo[t.y][t.x][k.y][k.x] = data.cost;
				memo[k.y][k.x][t.y][t.x] = data.cost;
				if(t.x==k.x&&t.y==k.y){
					isNA = false;
					result = data.cost;break;
				}
				for(int i=0;i<4;i++){
					int nx1 = t.x+sx[i];
					int ny1 = t.y+sy[i];
					int nx2 = k.x+sx2[i];
					int ny2 = k.y+sy2[i];
					if(nx1<0||nx1>=x||ny1<0||ny1>=y){
						nx1 = t.x;ny1 = t.y;
					}
					if(map[ny1][nx1]==1){
						nx1 = t.x;ny1 = t.y;
					}
					if(nx2<0||nx2>=x||ny2<0||ny2>=y){
						nx2 = k.x;ny2 = k.y;
					}
					if(map[ny2][nx2]==1){
						nx2 = k.x;ny2 = k.y;
					}
					if(memo[ny1][nx1][ny2][nx2]<=data.cost+1)continue;
					q.add(new Data(new Person(nx1, ny1),new Person(nx2, ny2),data.cost+1));
				}
			}
			System.out.println(isNA==true? "NA":result);
		}

		void doIt(){
			while(true){
				x = in.nextInt();y = in.nextInt();
				if(x+y==0)break;
				solve();
			}
		}
		
		class Person{
			int x, y;
			public Person(int x,int y) {
				this.x = x;
				this.y = y;
			}
		}
		
		class Data{
			int cost;
			Person p1,p2;
			public Data(Person p1,Person p2,int cost) {
				this.p1 = p1;
				this.p2 = p2;
				this.cost = cost;
			}
			public String toString(){
				return p1.x+" "+p1.y+" ::: "+p2.x+" "+p2.y+" +++ "+cost;
			}
		}
	}


}