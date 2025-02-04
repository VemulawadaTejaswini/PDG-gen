import java.util.ArrayDeque;
import java.util.BitSet;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] DY = { 1, 0, -1, 0 };
	static int[] DX = { 0, -1, 0, 1 };
	static int W, H;
	static char[][] mapL, mapR;
	static BitSet visited = new BitSet(1 << 24);

	public static void main(String[] args) {
		while (true) {
			W = sc.nextInt();
			H = sc.nextInt();
			if (W == 0) break;
			mapL = new char[H][];
			mapR = new char[H][];
			for (int i = 0; i < H; ++i) {
				mapL[i] = sc.next().toCharArray();
				mapR[i] = sc.next().toCharArray();
			}
			System.out.println(solve() ? "Yes" : "No");
		}
	}

	static boolean solve() {
		visited.clear();
		int pos = 0;
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				if (mapL[i][j] == 'L') {
					pos |= (i << 18) | (j << 12);
				}
				if (mapR[i][j] == 'R') {
					pos |= (i << 6) | j;
				}
			}
		}
		visited.set(pos);
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(pos);
		while (!q.isEmpty()) {
			int p = q.poll();
			int y1 = p >> 18;
			int x1 = (p >> 12) & 0x3F;
			int y2 = (p >> 6) & 0x3F;
			int x2 = p & 0x3F;
			for (int i = 0; i < 4; ++i) {
				int ny1 = y1 + DY[i];
				int nx1 = x1 + DX[i];
				int ny2 = y2 + DY[i];
				int nx2 = x2 - DX[i];
				if (ny1 < 0 || H <= ny1 || nx1 < 0 || W <= nx1 || mapL[ny1][nx1] == '#') {
					ny1 = y1;
					nx1 = x1;
				}
				if (ny2 < 0 || H <= ny2 || nx2 < 0 || W <= nx2 || mapR[ny2][nx2] == '#') {
					ny2 = y2;
					nx2 = x2;
				}
				boolean goalL = mapL[ny1][nx1] == '%';
				boolean goalR = mapR[ny2][nx2] == '%';
				if (goalL && goalR) {
					return true;
				}
				if (!goalL && !goalR) {
					int np = (ny1 << 18) | (nx1 << 12) | (ny2 << 6) | nx2;
					if (!visited.get(np)) {
						visited.set(np);
						q.add(np);
					}
				}
			}
		}
		return false;
	}

}