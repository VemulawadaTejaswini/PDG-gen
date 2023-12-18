import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P implements Comparable<P>{
		long x;
		long y;
		P(long x, long y){
			this.x=x;
			this.y=y;
		}
		@Override
		public int compareTo(P arg0) {
			return Long.compare(this.x, arg0.x);
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<P> ps = new ArrayList<>();
		for(int i=0; i<n; i++) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			ps.add(new P(x,y));
		}

		Collections.sort(ps);
		long ans = Long.MAX_VALUE;
		for(int i=0; i<n-k+1; i++) {
			long minx=Long.MAX_VALUE;
			long maxx=-Long.MAX_VALUE;
			long miny=Long.MAX_VALUE;
			long maxy=-Long.MAX_VALUE;
			for(int j=i; j<i+k; j++) {
				P p = ps.get(j);
				minx=Math.min(minx, p.x);
				maxx=Math.max(maxx, p.x);
				miny=Math.min(miny, p.y);
				maxy=Math.max(maxy, p.y);
			}
			ans = Math.min(ans, (maxx-minx)*(maxy-miny));
		}
		System.out.println(ans);

		sc.close();
	}



}
