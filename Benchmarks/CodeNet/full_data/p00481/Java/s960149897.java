import java.io.IOException;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int H, W, N;
		H = in.nextInt();
		W = in.nextInt();
		N = in.nextInt();

		String[] map = new String[H+3];
		String str = "";
		for(int i=0;i<W+2;i++) {
			str += "X";
		}
		map[0] = str;

		in.nextLine();
		for(int i=0;i<H;i++) {
			String s = in.nextLine();
			map[i+1] = "X" + s + "X";
		}
		map[H+1] = str;

		solve(map, H, W, N);
	}

	public static void solve(String[] ma, int H, int W, int N) {
		int ans = 0;
		int posx[] = new int[N+1];
		int posy[] = new int[N+1];

		// ??????S?????´????????¢???
		for(int i=1;i<=H;i++) {
			int pos = ma[i].indexOf("S");
			if(pos >= 0) {
				posx[0] = i;
				posy[0] = pos;
				ma[i].replace("S", "0");
				break;
			}
		}
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=N;j++) {
				int pos = ma[i].indexOf(""+j);
				if(pos >= 0) {
					posx[j] = i;
					posy[j] = pos;
				}
			}
		}

		for(int i=1;i<=N;i++) {
			ans += bfs(ma, posx[i-1], posy[i-1], H, W, ""+i);
		}
		System.out.println(ans);
	}

	public static int bfs(String[]ma, int sh, int sw, int H, int W, String target) {
		// ???????????¢?´¢??§target??¨????????????????????§??????????????¢????¨????
		boolean[][] visited = new boolean[H+2][W+2];
		Queue<P> q = new PriorityQueue<>();
		q.offer(new P(sh, sw, 0)); // ??????????????°????????\??????

		while(!q.isEmpty()) {
			P p = q.poll();
			visited[p.sh][p.sw] = true;

			// ??°?????????????????£???
			if((""+ma[p.sh].charAt(p.sw)).equals(target)) {
				return p.dist;
			}

			int dh[] = {0, 0, +1, -1};
			int dw[] = {1,-1,  0,  0};
			for(int i=0;i<4;i++) {
				int h = p.sh + dh[i];
				int w = p.sw + dw[i];
				if((""+ma[h].charAt(w)).equals("X") || visited[h][w]) continue;
				q.offer(new P(h, w, p.dist + 1));
			}
		}

		assert (false);
		return -1;
	}
}

class P  implements Comparable<P> {
	int sh;
	int sw;
	int dist;
	P(int sh, int sw, int dist) {
		this.sh = sh;
		this.sw = sw;
		this.dist = dist;
	}

	@Override
	public int compareTo(P p) {
		return this.dist - p.dist;
	}
}