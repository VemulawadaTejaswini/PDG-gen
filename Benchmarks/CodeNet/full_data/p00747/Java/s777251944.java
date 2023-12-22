import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (read())
			solve();
	}
	
	static int W, H;
	static int[][] field;
	static boolean read() {
		W = sc.nextInt(); H = sc.nextInt();
		if (W == 0) return false;
		
		field = new int[2 * H - 1 + 2][2 * W - 1 + 2];
		for (int i = 0; i < 2 * H - 1 + 2; i++) fill(field[i], 0);
		for (int i = 0; i < 2 * H - 1 + 2; i++) field[i][0] = field[i][2 * W] = 1;
		for (int j = 0; j < 2 * W - 1 + 2; j++) field[0][j] = field[2 * H][j] = 1;		
		
		for (int i = 0; i < 2 * H - 1; i++) {
			int w = (i % 2 == 0) ? W - 1 : W;
			int a = (i % 2 == 0) ? 1 : 0;
			for (int j = 0; j < w; j++) {
				field[i + 1][2 * j + a + 1] = sc.nextInt();
			}
		}
		
		return true;
	}

	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static void solve() {
		Queue<State> que = new LinkedList<State>();
		que.add(new State(1, 1, 1));
		while (!que.isEmpty()) {
			State s = que.poll();
			if (field[s.y][s.x] != 0) continue;
			field[s.y][s.x] = s.s;
			for (int i = 0; i < 4; i++) {
				if (field[s.y + dy[i]][s.x + dx[i]] == 0) {
					que.add(new State(s.x + dx[i] * 2, s.y + dy[i] * 2, s.s + 1));
				}
			}
		}
		
		System.out.println(field[2 * H - 1][2 * W - 1]);
	}	
}

class State{
	int x, y, s;
	State(int x, int y, int s) {
		this.x = x; this.y = y; this.s = s;
	}
}