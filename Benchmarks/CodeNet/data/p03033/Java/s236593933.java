import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int q = in.nextInt();
		STX[] stx = new STX[n];
		for (int i = 0; i < n; i++) {
			stx[i] = new STX(in.nextInt(), in.nextInt(), in.nextInt());
		}
		DX[] dx = new DX[q];
		for (int i = 0; i < q; i++) {
			dx[i] = new DX(i, in.nextInt(), -1);
		}
		solve(stx, dx);
		in.close();
	}

	private static void solve(STX[] stx, DX[] dx) {
		Arrays.sort(stx, (a, b) -> a.x - b.x);
		Arrays.sort(dx, (a, b) -> a.d - b.d);
		for (int i = 0; i < stx.length; i++) {
			solveSTX(stx[i].s - stx[i].x, stx[i].t - stx[i].x, stx[i].x, dx);
		}
		Arrays.sort(dx, (a, b) -> a.id - b.id);
		for (int i = 0; i < dx.length; i++)
			System.out.println(dx[i].x);
	}

	private static void solveSTX(int s, int t, int x, DX[] dx) {
		int l = 0;
		int r = dx.length;
		while (l + 1 < r) {
			int m = (l + r) / 2;
			if (dx[m].d < s)
				l = m;
			else
				r = m;
		}
		for (int i = l; i < dx.length; i++)
			if (dx[i].d >= t)
				break;
			else if (dx[i].d >= s && dx[i].x == -1)
				dx[i].x = x;
	}

	static class STX {
		public STX(int s, int t, int x) {
			this.s = s;
			this.t = t;
			this.x = x;
		}

		int s;
		int t;
		int x;
	}

	static class DX {
		public DX(int id, int d, int x) {
			this.id = id;
			this.d = d;
			this.x = x;
		}

		int id;
		int d;
		int x;
	}

}