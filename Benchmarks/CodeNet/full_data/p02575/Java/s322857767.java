import java.util.*;
public class Main {
	
	public static class Point {
		long x, y;
		public Point(long x, long y){
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Long INF = Long.MAX_VALUE/2;
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		Map<Point, Long> m, pm = new HashMap<>();
		long[] ans = new long[H];
		Arrays.fill(ans, -1);
		pm.put(new Point(1, W), 0L);
		for(int i = 0; i < H; i++) {
			m = new HashMap<>();
			int A = sc.nextInt();
			int B = sc.nextInt();
			long min = INF;
			for(Map.Entry<Point, Long> e : pm.entrySet()) {
				Point p = e.getKey(), pn;
				Long v = e.getValue();
				Point x = new Point(INF, 0);
				if(p.x >= A && B == W)
					continue;
				if(p.x < A) {
					pn = new Point(p.x, Math.min(A-1, p.y));
					m.put(pn, Math.min(v+1, m.getOrDefault(pn, INF)));
					if(v+1 < min) {
						min = v+1;
						x = new Point(min, p.x);
					}
				}
				if(p.y > B) {
					if(x.x + Math.max(p.x, B+1) - x.y <= v+1)
						continue;
					pn = new Point(Math.max(p.x, B+1), p.y);
					m.put(pn, Math.min(v+1, m.getOrDefault(pn, INF)));
					if(v+1 < min) {
						min = v+1;
						x = new Point(min, Math.max(p.x, B+1));
					}
				}
				else {
					if(x.x + Math.max(p.x, B+1) - x.y <= v+2+B-p.x)
						continue;
					pn = new Point(Math.max(p.x, B+1), p.y);
					m.put(pn, Math.min(v+2+B-p.x, m.getOrDefault(pn, INF)));
					if(v+2+B-p.x < min) {
						min = v+2+B-p.x;
						x = new Point(min, p.x);
					}
				}
			}
			if(m.size() == 0)
				min = -1;
			pm = new HashMap<>(m);
			ans[i] = min;
		}
		for(int i = 0; i < H; i++)
			System.out.println(ans[i]);
	}

}
