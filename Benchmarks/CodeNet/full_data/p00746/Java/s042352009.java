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

	int m;
	int[] n, d;

	void run(){
		for(;;){
			m=sc.nextInt();
			if(m==0){
				break;
			}
			n=new int[m];
			d=new int[m];
			for(int i=0; i<m-1; i++){
				n[i]=sc.nextInt();
				d[i]=sc.nextInt();
			}
			solve();
		}
	}

	void solve(){
		int[] dx={-1, 0, 1, 0};
		int[] dy={0, 1, 0, -1};
		P[] ps=new P[m];
		ps[0]=new P(0, 0);
		P min=new P(0, 0);
		P max=new P(0, 0);
		for(int i=0; i<m-1; i++){
			ps[i+1]=new P(ps[n[i]].x+dx[d[i]], ps[n[i]].y+dy[d[i]]);
			min.x=min(min.x, ps[i+1].x);
			min.y=min(min.y, ps[i+1].y);
			max.x=max(max.x, ps[i+1].x);
			max.y=max(max.y, ps[i+1].y);
		}
		// debug(min.x, min.y, max.x, max.y);
		println((max.x-min.x+1)+" "+(max.y-min.y+1));
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