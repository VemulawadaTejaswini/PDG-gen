import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class Pos {
		int lx, ly, rx, ry;
		Pos(int _lx, int _ly, int _rx, int _ry) {
			lx = _lx;
			ly = _ly;
			rx = _rx;
			ry = _ry;
		}
	}
	
	void run() {
		boolean[][] rooml = new boolean[50][50];
		boolean[][] roomr = new boolean[50][50];
		boolean[][][][] used = new boolean[50][50][50][50]; 
		int dlx, dly, drx, dry, lx, ly, rx, ry;
		dlx = dly = drx = dry = lx = ly = rx = ry = 0;
		Queue<Pos> que = new LinkedList<Pos>();
		int[] dilx = {1, -1, 0, 0};
		int[] dily = {0, 0, 1, -1};
		int[] dirx = {1, -1, 0, 0};
		int[] diry = {0, 0, -1, 1};
		while (true) {
			int w = sc.nextByte(), h = sc.nextByte();
			if (w == 0 && h == 0) break;
			for (int i = 0; i < h; i++) {
				String l = sc.next(), r = sc.next();
				for (int j = 0; j < w; j++) {
					switch (l.charAt(j)) {
					case '.': rooml[i][j] = true; break;
					case '#': rooml[i][j] = false; break;
					case '%': 
						rooml[i][j] = true;
						dlx = i; dly = j;
						break;
					case 'L':
						rooml[i][j] = true;
						lx = i;
						ly = j;
						break;
					}
					switch (r.charAt(j)) {
					case '.': roomr[i][j] = true; break;
					case '#': roomr[i][j] = false; break;
					case '%': 
						roomr[i][j] = true;
						drx = i; dry = j;
						break;
					case 'R':
						roomr[i][j] = true;
						rx = i;
						ry = j;
						break;
					}
				}
			}
			
			que.clear();
			for (int i = 0; i < 50; i++)
				for (int j = 0; j < 50; j++)
					for (int k = 0; k < 50; k++)
						Arrays.fill(used[i][j][k], false);
			que.add(new Pos(lx, ly, rx, ry));
			used[lx][ly][rx][ry] = true;
			boolean flag = false;
			while (!que.isEmpty()) {
				Pos p = que.poll();
				int telx = p.lx, tely = p.ly;
				int terx = p.rx, tery = p.ry;
				if (telx == dlx && tely == dly && terx == drx && tery == dry) {
					flag = true;
					break;
				}
				if (telx == dlx && tely == dly && !(terx == drx && tery == dry)) {
					continue;
				}
				if (!(telx == dlx && tely == dly) && terx == drx && tery == dry) continue;
				for (int i = 0; i < 4; i++) {
					int lX = telx + dilx[i], lY = tely + dily[i];
					int rX = terx + dirx[i], rY = tery + diry[i];
					if (!(0 <= lX && lX < h && 0 <= lY && lY < w && rooml[lX][lY])) {
						lX = telx;
						lY = tely;
					}
					if (!(0 <= rX && rX < h && 0 <= rY && rY < w && roomr[rX][rY])) {
						rX = terx;
						rY = tery;
					}
					if (!used[lX][lY][rX][rY]) {
						used[lX][lY][rX][rY] = true;
						que.add(new Pos(lX, lY, rX, rY));
					}
				}
			}
			
			if (flag)
				out.println("Yes");
			else
				out.println("No");
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}