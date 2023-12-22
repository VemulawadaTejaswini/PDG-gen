import java.awt.Point;
import java.util.*;
public class Main {

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
				if(p.x < A) {
					pn = new Point(p.x, Math.min(A-1, p.y));
					m.put(pn, Math.min(v+1, m.getOrDefault(pn, INF)));
					min = Math.min(min, v+1);
				}
				if(p.y > B) {
					pn = new Point(Math.max(p.x, B+1), p.y);
					m.put(pn, Math.min(v+1, m.getOrDefault(pn, INF)));
					min = Math.min(min, v+1);
				}
				if(p.x >= A && p.y <= B) {
					if(p.x >= A && B == W)
						continue;
					pn = new Point(Math.max(p.x, B+1), p.y);
					m.put(pn, Math.min(v+2+B-p.x, m.getOrDefault(pn, INF)));
					min = Math.min(min, v+2+B-p.x);
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
