import java.awt.geom.*;
import java.util.*;
import static java.lang.Math.*;
public class Main{
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1174();
	}
	
	class AOJ1174{
		AOJ1174(){
			while(sc.hasNext()){
				h=sc.nextInt();
				w=sc.nextInt();
				c=sc.nextInt();
				if(h==0)	break;
				solve();
			}
		}
		int h,w,c;
		int[] vx={0,1,0,-1},vy={-1,0,1,0};
		void solve(){
			int[][] b=new int[w][h];
			for(int y=0; y<h; ++y)for(int x=0; x<w; ++x)	b[x][y]=sc.nextInt();
			System.out.println(dfs(b, 1, -1));
		}
		int dfs(int[][] b,int depth,int last){
			// debug
//			System.out.println(depth);
			if(depth>=5){
				int[][] b2=change(b, c);
				return cnt(b2);
			}
			int ret=1;
			for(int i=1; i<=6; ++i){
				if(i==last)	continue;
				ret=max(ret, dfs(change(b, i), depth+1, i));
			}
			return ret;
		}
		int[][] change(int[][] b,int target){
			int base=b[0][0];
			LinkedList<Pair> open=new LinkedList<Pair>();
			open.add(new Pair(0,0));
			int[][] nb=new int[w][h];
			for(int x=0; x<w; ++x)for(int y=0; y<h; ++y)	nb[x][y]=b[x][y];
			nb[0][0]=target;
			boolean[][] closed=new boolean[w][h];
			closed[0][0]=true;
			while(!open.isEmpty()){
				Pair now=open.poll();
				// debug
//				System.out.println(now);
				if(b[now.x][now.y]==base){
					nb[now.x][now.y]=target;
					for(int i=0; i<4; ++i){
						int xx=now.x+vx[i],yy=now.y+vy[i];
						if(!(0<=xx&&xx<w && 0<=yy&&yy<h))	continue;
						if(closed[xx][yy])	continue;
						open.add(new Pair(xx,yy));
						closed[xx][yy]=true;
					}
				}
			}
			return nb;
		}
		int cnt(int[][] b){
			
//			for(int y=0; y<h; ++y){
//				for(int x=0; x<w; ++x)System.out.print(b[x][y]+" ");
//				System.out.println();
//			}
			
			int base=b[0][0],
				ret=0;
			LinkedList<Pair> open=new LinkedList<Pair>();
			open.add(new Pair(0,0));
			boolean[][] closed=new boolean[w][h];
			closed[0][0]=true;
			while(!open.isEmpty()){
				Pair now=open.poll();
				if(b[now.x][now.y]==base){
					++ret;
					for(int i=0; i<4; ++i){
						int xx=now.x+vx[i],yy=now.y+vy[i];
						if(!(0<=xx&&xx<w && 0<=yy&&yy<h))	continue;
						if(closed[xx][yy])	continue;
						open.add(new Pair(xx,yy));
						closed[xx][yy]=true;
					}
				}
			}
			
//			System.out.println(ret);
//			System.out.println();
			return ret;
		}
		class Pair{
			int x,y;
			Pair(int x,int y){
				this.x=x;
				this.y=y;
			}
			@Override public String toString(){
				return x+","+y;
			}
		}
	}
}