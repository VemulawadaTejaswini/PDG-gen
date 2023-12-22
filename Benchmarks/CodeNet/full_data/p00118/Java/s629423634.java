import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0118().doIt();
	}
	
	class AOJ0118{
		int w,h;
		char[][] map;
		boolean sw[][];
		int sx[],sy[];
		void dfs(int x,int y,char f){
			LinkedList<Point2D> q = new LinkedList<Point2D>();
			q.add(new Point2D.Double(x,y));
			while(q.size()>0){
				Point2D p = q.remove();
				for(int i=0;i<4;i++){
					int nx = (int)p.getX()+sx[i];
					int ny = (int)p.getY()+sy[i];
					if(nx<0||nx>=w||ny<0||ny>=h)continue;
					if(sw[ny][nx]||map[ny][nx]!=f)continue;
					sw[ny][nx]=true;
					q.add(new Point2D.Double(nx,ny));
				}
			}
		}
		
		int solve(){
			int result = 0;
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(!sw[i][s]){
				result++;
				sw[i][s] = true;
				dfs(s,i,map[i][s]);
			}
			return result;
		}
		
		void doIt(){
			sx = new int[4];
			sy = new int[4];
			sx[0]=1;sx[1]=0;sx[2]=-1;sx[3]=0;
			sy[0]=0;sy[1]=1;sy[2]=0;sy[3]=-1;
			while(true){
				h = in.nextInt();
				w = in.nextInt();
				if(h==0&&w==0)break;
				map = new char[h][w];
				sw = new boolean[h][w];
				for(int i=0;i<h;i++)map[i] = in.next().toCharArray();
				System.out.println(solve());
			}
		}
	}
	
}