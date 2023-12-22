
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			Map<Integer, Point2D.Double> map = new HashMap<Integer, Point2D.Double>();
			while (n-- > 0) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				map.put(a, new Point2D.Double(b, c));
			}
			int s = scanner.nextInt();
			while (s-- > 0) {
				int e = scanner.nextInt();
				int f = scanner.nextInt();
				slove(e, f, map);
			}
		}
	}

	private static void slove(int e, int f, Map<Integer, Double> map) {
		Deque<Deque<Integer>> deque = new ArrayDeque<Deque<Integer>>();
		Deque<Integer> d = new ArrayDeque<>();
		d.push(e);
		deque.offer(d);
		while (!deque.isEmpty()) {
			int t = deque.size();
			for (int i = 0; i < t; i++) {
				Deque<Integer> tmp = deque.poll();
				for (Entry<Integer, Point2D.Double> entry : map.entrySet()) {
					if (!tmp.contains(entry.getKey())) {
						double dis = map.get(tmp.peekLast()).distance(entry.getValue());
						if (dis <= 50) {
							if (entry.getKey() == f) {
								for (int ans : tmp) {
									System.out.print(ans + " ");
								}
								System.out.println(entry.getKey());
								return;
							}
							Deque<Integer> tmpDeque  = new ArrayDeque<Integer>();
							tmpDeque.addAll(tmp);
							tmpDeque.offer(entry.getKey());
							deque.offer(tmpDeque);
						}
					}
				}
			}
		}
		System.out.println("NA");
	}
}