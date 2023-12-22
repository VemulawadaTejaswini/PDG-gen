import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * Packet Transportation
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line);

			// router info
			Router.setCount(n);
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int id, next;
				id = Integer.parseInt(st.nextToken());
				next = Integer.parseInt(st.nextToken());
				Router.setRouter(id);
				for (int j = 0; j < next; j++) {
					Router.getRouter(id).addNext(
							Integer.parseInt(st.nextToken()));
				}
			}

			// packet info
			int p = Integer.parseInt(br.readLine());
			for (int i = 0; i < p; i++) {
				int src, dst, ttl, hop;
				int d1, d2;
				line = br.readLine();
				d1 = line.indexOf(' ');
				d2 = line.indexOf(' ', d1 + 1);
				src = Integer.parseInt(line.substring(0, d1));
				dst = Integer.parseInt(line.substring(d1 + 1, d2));
				ttl = Integer.parseInt(line.substring(d2 + 1));
				hop = Router.getHops(src, dst, ttl);
				if (hop > 0) {
					System.out.println(hop);
				} else {
					System.out.println("NA");
				}
			}

		}
	}
}

class Router {

	int id;
	ArrayList<Integer> nexts;

	private static Router[] routers;

	static Router[] setCount(int n) {
		if (routers == null) {
			routers = new Router[n + 1];
		}
		return routers;
	}

	static void setRouter(int id) {
		Router r = new Router(id);
		routers[r.id] = r;
	}

	static Router getRouter(int id) {
		return routers[id];
	}

	static int getHops(int src, int dst, int ttl) {

		Deque<Router.Hop> deque = new ArrayDeque<Router.Hop>();
		int hop = 0;

		Router r = getRouter(src);
		deque.offer(r.new Hop(r, ttl - 1));
		while (!deque.isEmpty()) {
			Hop h = deque.poll();
			if (h.router.id == dst) {
				hop = ttl - h.ttl;
				break;
			} else if (h.ttl > 0) {
				if (h.router.nexts.size() != 0) {
					for (Integer i : h.router.nexts) {
						r = getRouter(i);
						deque.offer(r.new Hop(r, h.ttl - 1));
					}
				}
			}
		}
		return hop;
	}

	//
	private Router(int id) {
		this.id = id;
		nexts = new ArrayList<Integer>();
	}

	public void addNext(int id) {
		nexts.add(id);
	}

	private class Hop {
		Router router;
		int ttl;

		public Hop(Router router, int ttl) {
			this.router = router;
			this.ttl = ttl;
		}
	}

}