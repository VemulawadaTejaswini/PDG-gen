import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Color the Map
public class Main{

	class R{
		List<L> l;
		List<R> adj;
		boolean u;
		int color, id;
		public R(int id) {
			this.id = id;
			adj = new ArrayList<R>();
			l = new ArrayList<L>();
			u = false;
			color = 0;
		}
		boolean adj(R r){
			for(L a:l)for(L b:r.l){
				int x1 = a.x2-a.x1, y1 = a.y2-a.y1, x2 = b.x2-b.x1, y2 = b.y2-b.y1;
				if(x1*y2-x2*y1!=0)continue;
				if(x1==0){
					if(a.x1!=b.x1)continue;
					P[] p = new P[4];
					p[0] = new P(a.x1, a.y1, 0); p[1] = new P(a.x2, a.y2, 0);
					p[2] = new P(b.x1, b.y1, 1); p[3] = new P(b.x2, b.y2, 1);
					Arrays.sort(p);
					if(p[0].id==p[1].id)continue;
					if(!p[1].eq(p[2]))return true;
				}
				else{
					double alpha = y1/x1;
					double beta = a.y1-alpha*a.x1;
					double y = b.y1, x = alpha*b.x1+beta;
					if(Math.abs(y-x)<1e-7){
						P[] p = new P[4];
						p[0] = new P(a.x1, a.y1, 0); p[1] = new P(a.x2, a.y2, 0);
						p[2] = new P(b.x1, b.y1, 1); p[3] = new P(b.x2, b.y2, 1);
						Arrays.sort(p);
						if(p[0].id==p[1].id)continue;
						if(!p[1].eq(p[2]))return true;
					}
				}
			}
			return false;
		}
	}
	class P implements Comparable<P>{
		int id;
		double x, y;
		public P(double x, double y, int d) {
			this.x = x;
			this.y = y;
			id = d;
		}
		public int compareTo(P o) {
			if(x<o.x)return -1;
			if(o.x<x)return 1;
			return (int) Math.signum(y-o.y);
		}
		boolean eq(P p){
			return Math.abs(x-p.x)<1e-7 && Math.abs(y-p.y)<1e-7;
		}
	}
	class L{
		int x1, y1, x2, y2;
		public L(int x1, int y1, int x2, int y2) {
			if(x1<x2||x1==x2&&y1<y2){
				this.x1 = x1;
				this.y1 = y1;
				this.x2 = x2;
				this.y2 = y2;
			}
			else{
				this.x1 = x2;
				this.y1 = y2;
				this.x2 = x1;
				this.y2 = y1;
			}
		}
	}

	R[] c;
	int N;
	
	boolean f(int max){
		for(int i=0;i<N;i++){
			if(c[i].u)continue;
			if(!dfs(i, 1, max))return false;
		}
		return true;
	}
	boolean dfs(int k, int col, int limit){
//		System.out.println("DFS:" + k + " Col:"+col+" Limit:"+limit);
		int max = col;
		boolean[] u = new boolean[11];
		for(R r:c[k].adj)if(r.u){
			max = Math.max(max, r.color);
			u[r.color] = true;
		}
		if(u[col])return false;
		c[k].color = col; c[k].u = true;
		boolean f = true;
		for(R r:c[k].adj)if(!r.u)f = false;
		if(f)return true;
//		for(int i=0;i<N;i++){
//			System.out.println("I:"+i + " Color:"+c[i].color);
//		}
		for(int t=1;t<=Math.min(max+1, limit);t++){
			if(t==col)continue;
			for(R r:c[k].adj){
				if(r.u)continue;
				if(dfs(r.id, t, limit))return true;
			}
		}
		c[k].color = 0; c[k].u = false;
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			int id = 0;
			Map<String, Integer> ref = new HashMap<String, Integer>();
			c = new R[10];
			while(n--!=0){
				String name = sc.next();
				R r;
				if(ref.containsKey(name))r = c[ref.get(name)];
				else{
					r = new R(id);
					c[id] = r;
					ref.put(name, id++);
				}
				int sx = sc.nextInt(), sy = sc.nextInt();
				int px = sx, py = sy;
				for(;;){
					int x = sc.nextInt();
					if(x==-1){
						r.l.add(new L(px, py, sx, sy));
						break;
					}
					int y = sc.nextInt();
					r.l.add(new L(px, py, x, y));
					px = x; py = y;
				}
			}
			boolean[][] adj = new boolean[id][id];
			for(int i=0;i<id;i++)for(int j=i+1;j<id;j++){
				if(adj[i][j])continue;
				if(c[i].adj(c[j])){
//					System.out.println("ADJ: " + i+" - "+j);
					adj[i][j] = true;
					adj[j][i] = true;
				}
				if(adj[i][j]){
					c[i].adj.add(c[j]);
					c[j].adj.add(c[i]);
				}
			}
			N = id;
			for(int t=1;t<=10;t++){
				if(!f(t))continue;
				System.out.println(t);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}