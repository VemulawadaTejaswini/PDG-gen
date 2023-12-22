import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ2253().doIt();
	}
	
	class AOJ2253{
		int t,n;
		HashSet<Point2D> set;
		int cnt = 0;
		boolean[][] map;
		int[] sx = {1,0,-1,0,1,-1};
		int[] sy = {0,1,0,-1,1,-1};
		void dfs(Point2D p,int cost){
			int x = (int) p.getX();
			int y = (int) p.getY();
			map[y][x] = true;
			if(cost == t)return;
			for(int i=0;i<6;i++){
				int nx = x+sx[i];
				int ny = y+sy[i];
				if(nx<0||nx>100||ny<0||ny>100)continue;
				Point2D np = new Point2D.Double(nx,ny);
				if(set.contains(np))continue;
				dfs(np,cost+1);
			}
		}
		
		void solve(){
			cnt = 0;
			map = new boolean[100][100];
			dfs(new Point2D.Double(in.nextInt()+50,in.nextInt()+50),0);
			for(int i=0;i<100;i++)for(int s=0;s<100;s++)if(map[i][s])cnt++;
			System.out.println(cnt);
		}
		
		void doIt(){
			while(in.hasNext()){
				t = in.nextInt();
				n = in.nextInt();
				if(t+n==0)break;
				set = new HashSet<Point2D>();
				for(int i=0;i<n;i++)set.add(new Point2D.Double(in.nextInt()+50,in.nextInt()+50));
				solve();
			}
		}
	}
	
}