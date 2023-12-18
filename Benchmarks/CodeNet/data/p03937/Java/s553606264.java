import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] map = new char[H][W];
		for (int i=0; i<H; i++) {
			map[i] = sc.next().toCharArray();
		}
		//
		int[] dx = {1, 0}, dy = {0, 1};
		LinkedList<P> que = new LinkedList<>();
		que.offer(new P(0,0));
		while (!que.isEmpty()) {
			if (que.size()!=1) break;
			P p = que.poll();
			map[p.y()][p.x()] = '.';
			for (int i=0; i<2; i++) {
				P n = new P(p.x()+dx[i], p.y()+dy[i]);
				if (n.x()<0 || n.y()<0 || W<=n.x() || H<=n.y()) continue;
				if (map[n.y()][n.x()]!='#') continue;
				que.offer(n);
			}
		}
		System.out.println(map[H-1][W-1]=='.' ? "Possible" : "Impossible");
		sc.close();
	}
	
	public static class P {
		private final int v1;
		private final int v2;
		public P(int v1, int v2) {
			this.v1 = v1;
			this.v2 = v2;
		}
		public int x() { return v1; }
		public int y() { return v2; }
	}

}
