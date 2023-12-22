import java.util.*;
import java.awt.geom.*;

import static java.lang.Math.*;
public class Main {
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
				H=sc.nextInt(); W=sc.nextInt(); C=sc.nextInt();
				if((H|(W|C))==0)	break;
				solve();
			}
		}
		int H,W,C;
		int[][][] b;
		final int[] vx={0,-1,0,1},vy={-1,0,1,0};
		void solve(){
			b=new int[6][W][H];
			for(int h=0; h<H; ++h)for(int w=0; w<W; ++w)	b[0][w][h]=sc.nextInt();
			System.out.println(backtracking(b,0));
		}
		int backtracking(int[][][] b,int depth){
			if(depth>=4)	return cnt(chg(depth, C));
			int ret=0;
			for(int c=1; c<=6; ++c){
				if(c==b[depth][0][0])	continue;
				chg(depth, c);
				ret=max(ret, backtracking(b, depth+1));
			}
			return ret;
		}
		int[][] chg(int d,int target){
			for(int w=0; w<W; ++w)for(int h=0; h<H; ++h)	b[d+1][w][h]=b[d][w][h];
			b[d+1][0][0]=target;
			chg(d,0,0,target);
			return b[d+1];
		}
		void chg(int d,int x,int y,int target){
			for(int v=0; v<4; ++v){
				int nx=x+vx[v],ny=y+vy[v];
				if(!(0<=nx&&nx<W && 0<=ny&&ny<H))	continue;
				if(b[d][nx][ny]!=b[d][0][0])	continue;
				if(b[d+1][nx][ny]==target)	continue;
				b[d+1][nx][ny]=target;
				chg(d,nx,ny,target);
			}
		}
		int cnt(int[][] a){
			return cnt(a,0,0,a[0][0]);
		}
		int cnt(int[][] a,int x,int y,int c){
			int ret=1;
			a[x][y]=-1;
			for(int v=0; v<4; ++v){
				int nx=x+vx[v],ny=y+vy[v];
				if(!(0<=nx&&nx<W && 0<=ny&&ny<H))	continue;
				if(a[nx][ny]!=c)	continue;
				ret+=cnt(a, nx, ny, c);
			}
			return ret;
		}
	}
}