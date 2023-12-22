import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;

	int sx, sy, gx, gy;
	int n;
	int[] xs, ys;
	int lx, ly;

	void run(){
		sx=sc.nextInt();
		sy=sc.nextInt();
		gx=sc.nextInt();
		gy=sc.nextInt();
		n=sc.nextInt();
		xs=new int[n];
		ys=new int[n];
		for(int i=0; i<n; i++){
			xs[i]=sc.nextInt();
			ys[i]=sc.nextInt();
		}
		lx=sc.nextInt();
		ly=sc.nextInt();
		solve();
	}

	void solve(){
		int[] dx={0, 1, 1, 0, -1, -1, 0};
		int[] dy0={1, 0, -1, -1, -1, 0, 0};
		int[] dy1={1, 1, 0, -1, 0, 1, 0};

		LinkedList<P> que=new LinkedList<P>();
		HashMap<P, Integer> map=new HashMap<P, Integer>();

		HashSet<P> wall=new HashSet<P>();
		for(int i=0; i<n; i++){
			for(int t=0; t<6; t++){
				wall.add(new P(xs[i], ys[i], t));
			}
		}

		que.addFirst(new P(sx, sy, 0));
		map.put(new P(sx, sy, 0), 0);

		for(; !que.isEmpty();){
			P p=que.removeLast();
			int[] dy=abs(p.x)%2==0?dy0:dy1;
			int op=abs(p.x*p.y*p.t)%6;
			for(int i=0; i<7; i++){
				P q=new P(p.x+dx[i], p.y+dy[i], (p.t+1)%6);
				if(abs(q.x)>lx||abs(q.y)>ly||wall.contains(q)){
					continue;
				}
				int ignore=map.get(p)+(i==op?0:1);
				if(map.containsKey(q)){
					if(ignore<map.get(q)){
						map.put(q, ignore);
						que.addFirst(q);
					}
				}else{
					map.put(q, ignore);
					if(ignore==map.get(p)){
						que.addLast(q);
					}else{
						que.addFirst(q);
					}
				}
			}
		}

		int min=INF;
		for(int i=0; i<6; i++){
			P p=new P(gx, gy, i);
			if(map.containsKey(p)){
				min=min(min, map.get(p));
			}
		}
		println((min<INF?min:-1)+"");
	}

	class P{
		int x, y, t;

		P(int x, int y, int t){
			this.x=x;
			this.y=y;
			this.t=t;
		}

		@Override
		public int hashCode(){
			return t*200*200+(y+100)*200+x;
		}

		@Override
		public boolean equals(Object o){
			P p=(P)o;
			return x==p.x&&y==p.y&&t==p.t;
		}
	}

	void println(String s){
		System.out.println(s);
	}

	void debug(Object... os){
		System.err.println(deepToString(os));
	}

	public static void main(String[] args){
		new Main().run();
	}
}