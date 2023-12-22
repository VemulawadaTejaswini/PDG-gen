import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	MyScanner sc = new MyScanner();
	Scanner sc2 = new Scanner(System.in);
	int mod = 1000000007;

	byte[] dx = { 1, 0, -1, 0, 0 };
	byte[] dy = { 0, 1, 0, -1, 0 };

	void run() {
		for (;;) {
			byte H = (byte) sc.nextInt();
			byte W = (byte) sc.nextInt();
			if ((H | W) == 0) {
				return;
			}
			char[][] field = new char[H][W];
			// HashSet<String> hs = new HashSet<String>();
			boolean visit[][][][] = new boolean[H][W][H][W];
			byte gH = 0, gW = 0, goH = 0, goW = 0;
			for (byte i = 0; i < H; i++) {
				String input = sc.next();
				for (byte j = 0; j < W; j++) {
					field[i][j] = input.charAt(j);
					if (input.charAt(j) == 'A') {
						gH = i;
						gW = j;
					}
					if (input.charAt(j) == 'B') {
						goH = i;
						goW = j;
					}
				}
			}
			String direction = sc.next();
			LinkedList<Info> queue = new LinkedList<Info>();
			queue.add(new Info(gH, gW, goH, goW));
			int cnt = 0;
			int ansH = 0;
			int ansW = 0;
			int index = 0;
			boolean able = false;
			int roop = 0;
			label: while (!queue.isEmpty()) {
				int size = queue.size();
				char exe = direction.charAt(index % direction.length());
				for (int I = 0; I < size; I++) {
					Info now = queue.poll();
					if (now.girlH == now.gohostH && now.girlW == now.gohostW) {
						ansH = now.girlH;
						ansW = now.girlW;
						able = true;
						break label;
					}
					visit[now.girlH][now.girlW][now.gohostH][now.gohostW] = true;
					// hs.add(now.girlH + "-" + now.girlW + "-" + now.gohostH
					// + "-" + now.gohostW);
					byte girl_nextH = 0;
					byte girl_nextW = 0;
					byte gohost_nextH = 0;
					byte gohost_nextW = 0;
					for (int i = 0; i < 5; i++) {
						girl_nextH = (byte) (now.girlH + dy[i]);
						girl_nextW = (byte) (now.girlW + dx[i]);
						if (exe == '5') {
							gohost_nextW = (byte) (now.gohostW + dx[4]);
							gohost_nextH = (byte) (now.gohostH + dy[4]);
						}
						if (exe == '8') {
							gohost_nextW = (byte) (now.gohostW + dx[3]);
							gohost_nextH = (byte) (now.gohostH + dy[3]);
						}
						if (exe == '6') {
							gohost_nextW = (byte) (now.gohostW + dx[0]);
							gohost_nextH = (byte) (now.gohostH + dy[0]);
						}
						if (exe == '4') {
							gohost_nextW = (byte) (now.gohostW + dx[2]);
							gohost_nextH = (byte) (now.gohostH + dy[2]);
						}
						if (exe == '2') {
							gohost_nextW = (byte) (now.gohostW + dx[1]);
							gohost_nextH = (byte) (now.gohostH + dy[1]);
						}
						if (gohost_nextH < 0) {
							gohost_nextH = 0;
						}
						if (gohost_nextH == H) {
							gohost_nextH = (byte) (H - 1);
						}
						if (gohost_nextW < 0) {
							gohost_nextW = 0;
						}
						if (gohost_nextW == W) {
							gohost_nextW = (byte) (W - 1);
						}
						if (girl_nextH < 0) {
							girl_nextH = 0;
						}
						if (girl_nextH == H) {
							girl_nextH = (byte) (H - 1);
						}
						if (girl_nextW < 0) {
							girl_nextW = 0;
						}
						if (girl_nextW == W) {
							girl_nextW = (byte) (W - 1);
						}
						if (0 <= girl_nextH && girl_nextH < H
								&& 0 <= girl_nextW && girl_nextW < W
								&& 0 <= gohost_nextH && gohost_nextH < H
								&& 0 <= gohost_nextW && gohost_nextW < W
								&& field[girl_nextH][girl_nextW] != '#') {
							Info next = new Info(girl_nextH, girl_nextW,
									gohost_nextH, gohost_nextW);
							if (!visit[next.girlH][next.girlW][next.gohostH][next.gohostW]) {
								roop = 0;
								queue.add(next);
							}
						}
					}
					if (queue.isEmpty()) {
						roop++;
						if (roop <= 10) {
							queue.add(now);
						}
					}
				}
				cnt++;
				index++;
			}
			System.out.println(able ? cnt + " " + ansH + " " + ansW
					: "impossible");
		}
	}

	class Info {
		byte girlH;
		byte girlW;
		byte gohostH;
		byte gohostW;

		public Info(byte girlH, byte girlW, byte gohostH, byte gohostW) {
			this.girlH = girlH;
			this.girlW = girlW;
			this.gohostH = gohostH;
			this.gohostW = gohostW;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

	class MyScanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-')
					return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String next() {
			try {
				StringBuilder res = new StringBuilder("");
				int c = System.in.read();
				while (Character.isWhitespace(c))
					c = System.in.read();
				do {
					res.append((char) c);
				} while (!Character.isWhitespace(c = System.in.read()));
				return res.toString();
			} catch (Exception e) {
				return null;
			}
		}
	}
}