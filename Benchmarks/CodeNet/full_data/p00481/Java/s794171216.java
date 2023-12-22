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

	int n, m, k;
	int[][] a;
	P[] ps;

	void run(){
		n=sc.nextInt();
		m=sc.nextInt();
		k=sc.nextInt();
		a=new int[n][m];
		ps=new P[k+1];
		for(int j=0; j<n; j++){
			String s=sc.next();
			for(int i=0; i<m; i++){
				if(s.charAt(i)=='.'){
					a[j][i]=0;
				}else if(s.charAt(i)=='X'){
					a[j][i]=-1;
				}else if(s.charAt(i)=='S'){
					a[j][i]=1;
					ps[0]=new P(i, j);
				}else{
					a[j][i]=s.charAt(i)-'0'+1;
					ps[s.charAt(i)-'0']=new P(i, j);
				}
			}
		}

		int ans=0;
		for(int i=0; i<k; i++){
			ans+=bfs(i);
		}
		println(ans+"");
	}

	int bfs(int s){
		LinkedList<P> que=new LinkedList<P>();
		boolean[][] visited=new boolean[n][m];
		int[][] d=new int[n][m];

		que.offer(ps[s]);
		visited[ps[s].y][ps[s].x]=true;
		int[] dx={0, 0, -1, 1};
		int[] dy={-1, 1, 0, 0};

		for(; !que.isEmpty();){
			P p=que.poll();
			for(int i=0; i<4; i++){
				P q=new P(p.x+dx[i], p.y+dy[i]);
				if(q.x>=0&&q.x<m&&q.y>=0&&q.y<n&&a[q.y][q.x]!=-1
						&&!visited[q.y][q.x]){
					que.offer(q);
					visited[q.y][q.x]=true;
					d[q.y][q.x]=d[p.y][p.x]+1;
				}
			}
		}

		return d[ps[s+1].y][ps[s+1].x];
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