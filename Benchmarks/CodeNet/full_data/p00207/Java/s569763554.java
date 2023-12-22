import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-9;

	int w, h;
	int sx, sy;
	int gx, gy;
	int[][] a;

	void run(){
		for(;;){
			w=sc.nextInt();
			h=sc.nextInt();
			if((w|h)==0){
				break;
			}
			sx=sc.nextInt()-1;
			sy=sc.nextInt()-1;
			gx=sc.nextInt()-1;
			gy=sc.nextInt()-1;
			int n=sc.nextInt();
			a=new int[h][w];
			for(int k=0; k<n; k++){
				int c=sc.nextInt();
				int d=sc.nextInt();
				int x=sc.nextInt()-1;
				int y=sc.nextInt()-1;
				for(int j=0; j<2; j++){
					for(int i=0; i<4; i++){
						if(d==0){
							a[y+j][x+i]=c;
						}else{
							a[y+i][x+j]=c;
						}
					}
				}
			}
			solve();
		}
	}

	void solve(){
		LinkedList<P> que=new LinkedList<P>();
		boolean[][] visited=new boolean[h][w];

		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};

		que.offer(new P(sx, sy));
		visited[sy][sx]=true;

		for(; !que.isEmpty();){
			P p=que.poll();
			for(int i=0; i<4; i++){
				P q=new P(p.x+dx[i], p.y+dy[i]);
				if(q.x>=0&&q.x<w&&q.y>=0&&q.y<h&&a[q.y][q.x]==a[sy][sx]
						&&!visited[q.y][q.x]){
					que.offer(q);
					visited[q.y][q.x]=true;
				}
			}
		}
		println(visited[gy][gx]?"OK":"NG");
	}

	class P{
		int x, y;

		P(int x, int y){
			this.x=x;
			this.y=y;
		}
	}

	void debug(Object... os){
		System.err.println(Arrays.deepToString(os));
	}

	void print(String s){
		System.out.print(s);
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		// System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
		new Main().run();
	}
}