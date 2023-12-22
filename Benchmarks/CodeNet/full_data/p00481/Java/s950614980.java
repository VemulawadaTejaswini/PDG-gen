import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	private static int h, w, n;
	private static boolean[] wall;
	private static int[] sx, sy;
	
	private static int[] dx = { 0, 1,  0, -1 };
	private static int[] dy = { 1, 0, -1,  0 };
	
	private static int getInt() throws Exception {
		int i = 0;
		while(true){
			int buf = System.in.read();
			if('0' > buf || buf > '9'){
				break;
			}
			i = i * 10 + buf - '0';
		}
		return i;
	}
	private static int heuristic(final int sx, final int sy, final int ex, final int ey) {
		return Math.abs(sx - ex) + Math.abs(sy - ey);
	}
	private static int search(final int sx, final int sy, final int ex, final int ey) {
		Comparator<int[]> cmp = new Comparator<int[]>() {
			@Override
			public int compare(int[] a, int[] b) {
				return Integer.compare(a[2] + heuristic(a[0], a[1], ex, ey), b[2] + heuristic(b[0], b[1], ex, ey));
			}
		};
		boolean[] visited = new boolean[h*w];
		PriorityQueue<int[]> q = new PriorityQueue<>(cmp);
		q.offer(new int[]{sx, sy, 0});
		while(true){
			int[] now = q.poll();
			for(int i = 0; i < 4; i++){
				int nx = now[0] + dx[i];
				int ny = now[1] + dy[i];
				int p = nx + ny*w;
				if(0 <= nx && nx < w && 0 <= ny && ny < h && !wall[p] && !visited[p]){
					if(nx == ex && ey == ny) return now[2] + 1;
					visited[p] = true;
					q.offer(new int[]{nx, ny, now[2] + 1});
				}
			}
		}
		
	}
	public static void main(String[] args) throws Exception {
		h = getInt();
		w = getInt();
		n = getInt();
		wall = new boolean[h*w];
		sx = new int[10];
		sy = new int[10];
		for(int y = 0; y < h; y++){
			for(int x = 0; x < w; x++) {
				int buf = System.in.read();
				if(buf =='\n' || buf == '\r'){
					x--;
					continue;
				}
				wall[x + y*w] = buf == 'X';
				if(buf == 'S'){
					sx[0] = x;
					sy[0] = y;
				}
				if('1' <= buf && buf <= '9'){
					buf -= '0';
					sx[buf] = x;
					sy[buf] = y;
				}
			}
		}
		int a = 0;
		for(int i = 1; i <= n; i++) a += search(sx[i-1], sy[i-1], sx[i], sy[i]);
		System.out.println(a);
	}

}