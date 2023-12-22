import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int h;
	int w;
	int ch;
	int cw;
	int dh;
	int dw;

	String[] s;
	int[][] visited;
	int[][] wvisited;

	public void run() {
		Scanner sc = new Scanner(System.in);

		h = sc.nextInt();
		w = sc.nextInt();
		ch = sc.nextInt()-1;
		cw = sc.nextInt()-1;
		dh = sc.nextInt()-1;
		dw = sc.nextInt()-1;

		s = new String[h];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next();
		}
		visited = new int[h][w];
		wvisited = new int[h][w];

		int r = bfs(h, w, ch, cw, dh, dw, s);

		System.out.println(r);
	}

	private int bfs(int h, int w, int ch, int cw, int dh, int dw, String[] s) {
		Queue<Pos> wqueue = new PriorityQueue<>();
		Deque<Pos> queue = new ArrayDeque<>();

		wqueue.add(new Pos(ch, cw));

		int warp = 0;
		Pos wnode;
		while ((wnode = wqueue.poll()) != null) {
			queue.add(wnode);

			Pos node;
			while ((node = queue.poll()) != null) {
				if (node.h == dh && node.w == dw) {
					return wnode.warp;
				}
				visited[node.h][node.w]++;

				addQueue(queue, node.h, node.w - 1);
				addQueue(queue, node.h, node.w + 1);
				addQueue(queue, node.h - 1, node.w);
				addQueue(queue, node.h + 1, node.w);

				addWQueue(wqueue, node.h - 2, node.w - 2, wnode.warp );
				addWQueue(wqueue, node.h - 1, node.w - 2, wnode.warp);
				addWQueue(wqueue, node.h - 0, node.w - 2, wnode.warp);
				addWQueue(wqueue, node.h + 1, node.w - 2, wnode.warp);
				addWQueue(wqueue, node.h + 2, node.w - 2, wnode.warp);

				addWQueue(wqueue, node.h - 2, node.w - 1, wnode.warp);
				addWQueue(wqueue, node.h - 1, node.w - 1, wnode.warp);
				// addWQueue(wqueue, node.h - 0, node.w - 1, wnode.warp);
				addWQueue(wqueue, node.h + 1, node.w - 1, wnode.warp);
				addWQueue(wqueue, node.h + 2, node.w - 1, wnode.warp);

				addWQueue(wqueue, node.h - 2, node.w - 0, wnode.warp);
				// addWQueue(wqueue, node.h - 1, node.w - 0, wnode.warp);
				// addWQueue(wqueue, node.h - 0, node.w - 0, wnode.warp);
				// addWQueue(wqueue, node.h + 1, node.w - 0, wnode.warp);
				addWQueue(wqueue, node.h + 2, node.w - 0, wnode.warp);

				addWQueue(wqueue, node.h - 2, node.w + 1, wnode.warp);
				addWQueue(wqueue, node.h - 1, node.w + 1, wnode.warp);
				// addWQueue(wqueue, node.h - 0, node.w + 1, wnode.warp);
				addWQueue(wqueue, node.h + 1, node.w + 1, wnode.warp);
				addWQueue(wqueue, node.h + 2, node.w + 1, wnode.warp);

				addWQueue(wqueue, node.h - 2, node.w + 2, wnode.warp);
				addWQueue(wqueue, node.h - 1, node.w + 2, wnode.warp);
				addWQueue(wqueue, node.h - 0, node.w + 2, wnode.warp);
				addWQueue(wqueue, node.h + 1, node.w + 2, wnode.warp);
				addWQueue(wqueue, node.h + 2, node.w + 2, wnode.warp);

			}
		}
		return -1;
	}

	private void addQueue(Queue<Pos> queue, int h2, int w2) {
		if (h2 < 0 || h <= h2)
			return;
		if (w2 < 0 || w <= w2)
			return;

		queue.add(new Pos(h2, w2));
	}

	private void addWQueue(Queue<Pos> wqueue, int h2, int w2, int wrapc) {
		if (h2 < 0 || h <= h2)
			return;
		if (w2 < 0 || w <= w2)
			return;

		if (visited[h2][w2] != 0) {
			return;
		}
		if (s[h2].charAt(w2) == '#') {
			return;
		}
		Pos e = new Pos(h2, w2, wrapc+1);
		wqueue.add(e);
	}

}

class Pos implements Comparable{

	public Pos(int h, int w) {
		super();
		this.h = h;
		this.w = w;
	}


	public Pos(int h, int w, int warp) {
		super();
		this.h = h;
		this.w = w;
		this.warp = warp;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + h;
		result = prime * result + w;
		result = prime * result + warp;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pos other = (Pos) obj;
		if (h != other.h)
			return false;
		if (w != other.w)
			return false;
		if (warp != other.warp)
			return false;
		return true;
	}


	int h;
	int w;
	
	int warp;

	@Override
	public int compareTo(Object o) {
		Pos t = (Pos) o;
		int dwarp = warp-t.warp;
		if( dwarp != 0)
			return dwarp;
		
		int dw = w-t.w;
		if( dw != 0)
			return dw;
		
		int dh = h - t.h;
		return dh;
		
	}
}