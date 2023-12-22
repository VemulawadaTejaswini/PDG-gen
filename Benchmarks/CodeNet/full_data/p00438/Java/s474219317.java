import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] map;
	static int a, b;
	static int route;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {
			a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			b = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			map = new int[a][b];
			route = 0;

			int a1, b1, n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				a1 = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				b1 = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				map[a1 - 1][b1 - 1] = 1;
			}
			go(new int[] { 0, 0 });
			System.out.println(route);
		}

	}

	static void go(int[] p) {
		if (p[0] + 1 == a && p[1] + 1 == b) {
			route++;
			return;
		}

		int[] e = east(p);
		int[] n = north(p);
		if (e != null)
			go(e);
		if (n != null)
			go(n);
	}

	static int[] east(int[] p) {
		if (p[0] + 1 < a && map[p[0] + 1][p[1]] != 1) {
			int[] q = (int[]) p.clone();
			q[0]++;
			return q;
		} else {
			return null;
		}
	}

	static int[] north(int[] p) {
		if (p[1] + 1 < b && map[p[0]][p[1] + 1] != 1) {
			int[] q = (int[]) p.clone();
			q[1]++;
			return q;
		} else {
			return null;
		}
	}
}