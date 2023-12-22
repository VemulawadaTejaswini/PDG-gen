import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Gifts
 */
public class Main {

	static int[][] HV = {
			{1, 0, 0},
			{0, 1, 0},
			{-1, 0, 1},
			{0, -1, 1},
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int H, W, K;
		H = parseInt(st.nextToken());
		W = parseInt(st.nextToken());
		K = parseInt(st.nextToken());

		char[][] map = new char[H + 2][W + 2];
		int[][][] count = new int[H + 2][W + 2][4];

		for (int i = 0; i < map.length; i++) {
			Arrays.fill(map[i], '#');
		}

		for (int i = 0; i < H; i++) {
			line = br.readLine();
			for (int j = 0; j < line.length(); j++) {
				map[i + 1][j + 1] = line.charAt(j);
			}
		}

		int max = 0;
		Queue<Pos> q = new ArrayDeque<>();
		Pos pos = main.new Pos();
		pos.y = 1;
		pos.x = 1;
		pos.backs = 0;
		pos.gifts = 0;
		q.offer(pos);

		while (!q.isEmpty()) {

			Pos curr = q.poll();

			if (curr.y == H && curr.x == W) {
				max = Math.max(max, curr.gifts);
				if (curr.backs == K) {
					continue;
				}
			}

			for (int i = 0; i < HV.length; i++) {
				Pos next = main.new Pos(curr);
				next.y += HV[i][0];
				next.x += HV[i][1];
				next.backs += HV[i][2];
				char to = map[next.y][next.x];
				if (to != '#' && next.backs <= K) {
					if (to != '.') {
						int shop = next.y * 100 + next.x;
						if (!next.shops.contains(shop)) {
							next.gifts += to - '0';
							next.shops.add(shop);
						}
					}
					if (next.gifts > count[next.y][next.x][i]) {
						count[next.y][next.x][i] = next.gifts;
						q.offer(next);
					}
				}
			}
		}

		System.out.println(max);

	}

	class Pos {
		int y = 0;
		int x = 0;
		int backs = 0;
		int gifts = 0;
		Set<Integer> shops = new HashSet<>();

		Pos() {
		}

		Pos(Pos pos) {
			this.y = pos.y;
			this.x = pos.x;
			this.backs = pos.backs;
			this.gifts = pos.gifts;
			this.shops.addAll(pos.shops);
		}
	}
}