import java.awt.*;
import java.util.*;

public class Main{
	static final int dx[]= {0,-1,0,1};
	static final int dy[]= {-1,0,1,0};

	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();
		int w=s.nextInt();

		boolean f[][]=new boolean[h][w];

		ArrayDeque<Point> q=new ArrayDeque<>();

		for(int i=0;i<h;++i) {
			char[]t=s.next().toCharArray();
			for(int j=0;j<w;++j) {
				if(t[j]=='#') {
					f[i][j]=true;
					q.add(new Point(j,i));
				}
			}
		}

		int i=-1;
		for(;!q.isEmpty();++i) {
			//for(boolean[]g:f)System.err.println(Arrays.toString(g));
			System.err.println();
			for(int size=q.size();size>0;--size) {
				Point poll=q.poll();
				for(int d=0;d<4;++d) {
					int y=poll.y+dy[d];
					int x=poll.x+dx[d];
					if(0<=y&&y<h&&0<=x&&x<w&&!f[y][x]) {
						f[y][x]=true;
						q.add(new Point(x,y));
					}
				}
			}
		}
		System.out.println(i);
	}
}