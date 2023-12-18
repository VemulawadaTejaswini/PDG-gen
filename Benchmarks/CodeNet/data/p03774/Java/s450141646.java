import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		Pair p[] = new Pair[n];
		Pair check[] = new Pair[m];

		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			p[i] = new Pair(a, b);
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			int c = Integer.parseInt(str[0]);
			int d = Integer.parseInt(str[1]);

			check[i] = new Pair(c, d);
		}

		for (int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			int minI = -1;
			for (int j = 0; j < m; j++) {
				if (p[i].getDist(check[j].x, check[j].y) < min) {
					min = p[i].getDist(check[j].x, check[j].y);
					minI = j;
				}
			}
			System.out.println(minI + 1);
		}
	}
}

class Pair {
	int x;
	int y;

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getDist(int x, int y) {
		return Math.abs(x - this.x) + Math.abs(y - this.y);
	}
}
