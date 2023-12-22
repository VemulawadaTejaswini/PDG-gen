import java.util.Arrays;
import java.util.Scanner;

//Dragon Fantasy
public class Main{

	int n, hx, hy, dx, dy;
	R[] p;
	double EPS = 1e-8;
	
	class R implements Comparable<R>{
		int x, y;
		double r;
		public R(int x, int y) {
			this.x = x;
			this.y = y;
			r = Math.hypot(dx-x, dy-y);
		}
		public int compareTo(R o) {
			return (int) Math.signum(r-o.r);
		}
	}
	
	boolean dfs(int k, int S, double t){
		if(S==(1<<n)-1)return true;
		int x = k==-1?hx:p[k].x, y = k==-1?hy:p[k].y;
		for(int i=0;i<n;i++){
			if(((S>>i)&1)>0)continue;
			if(p[i].r<t+Math.hypot(x-p[i].x, y-p[i].y)+EPS)return false;
		}
		for(int i=0;i<n;i++){
			if(((S>>i)&1)>0)continue;
			if(p[i].r>t+Math.hypot(x-p[i].x, y-p[i].y)){
				if(dfs(i, S+(1<<i), t+Math.hypot(x-p[i].x, y-p[i].y)))return true;
			}
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt(); hx = sc.nextInt(); hy = sc.nextInt(); dx = sc.nextInt(); dy = sc.nextInt();
			if((n|hx|hy|dx|dy)==0)break;
			p = new R[n];
			for(int i=0;i<n;i++)p[i] = new R(sc.nextInt(), sc.nextInt());
			Arrays.sort(p);
			System.out.println(dfs(-1, 0, 0)?"YES":"NO");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}