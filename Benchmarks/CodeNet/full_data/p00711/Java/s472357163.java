import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		new A1130().ans(sc);
	}

}

class Code {

}

class A1130 {

	int[] xdis = { -1, 0, +1, 0 };
	int[] ydis = { 0, -1, 0, +1 };

	int[][] cm;

	public void ans(Scanner sc) {
		while (true) {
			String str = sc.nextLine();
			String[] cut = str.split(" ");
			int W = Integer.parseInt(cut[0], 10);
			int H = Integer.parseInt(cut[1], 10);

			if (W == 0) {
				break;
			}

			cm = new int[H][W];

			int x = 0;
			int y = 0;
			for (int h = 0; h < H; h++) {
				String map = sc.nextLine();
				for (int w = 0; w < W; w++) {
					char c = map.charAt(w);
					switch (c) {
					case '.':
						cm[h][w] = 0;
						break;
					case '@':
						x = w;
						y = h;
						cm[h][w] = 0;
						break;
					case '#':
						cm[h][w] = -1;
						break;
					}
				}
			}
			rec(x, y);


			int count=0;
			for (int h = 0; h < H; h++) {
				for (int w = 0; w < W; w++) {
					if(cm[h][w]==1){
						count++;
					}
				}
			}
			System.out.println(count);

		}
	}

	void rec(int x, int y) {
		if (y < 0 || cm.length <= y) {
			return;
		}
		if (x < 0 || cm[0].length <= x) {
			return;
		}
		if (cm[y][x] != 0) {
			return;
		}

		cm[y][x] = 1;
		for (int i = 0; i < xdis.length; i++) {
			rec(x + xdis[i], y + ydis[i]);
		}
	}
}