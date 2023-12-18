
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P{
		long x;
		long y;
		P(long x,long y){
			this.x=x;
			this.y=y;
		}
	}
	ArrayList<P> pl;
	long ans = Long.MAX_VALUE;
	boolean used[];
	int n;
	int k;
	public void run() {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		pl = new ArrayList<P>();
		used = new boolean[n];
		for(int i=0; i<n; i++) {
			P p = new P(sc.nextLong(), sc.nextLong());
			pl.add(p);
		}
		for(int i=0; i<n; i++) {
			P p = pl.get(i);
			used[i]=true;
			solve(1, p.x, p.x, p.y, p.y);
			used[i]=false;
		}
		System.out.println(ans);
		sc.close();
	}

	private void solve(int c, long x1, long x2, long y1, long y2) {
		if(c==k) {
			ans = Math.min(ans, Math.abs(x1-x2)*Math.abs(y1-y2));
		}else {
			for(int i=0; i<n; i++) {
				if(!used[i]) {
					P p = pl.get(i);
					used[i]=true;
					solve(c+1, Math.min(x1, p.x), Math.max(x2, p.x), Math.min(y1, p.y), Math.max(y2,  p.y));
					used[i]=false;
				}
			}
		}
	}
}
