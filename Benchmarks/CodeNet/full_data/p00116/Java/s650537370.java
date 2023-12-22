import java.util.Scanner;
import java.util.Stack;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if ((H | W) == 0) {
				return;
			}
			char map[][] = new char[H][W];
			int cnt[][] = new int[H][W + 1];
			for (int i = 0; i < H; i++) {
				String line = sc.next();
				for (int j = 0; j < W; j++) {
					map[i][j] = line.charAt(j);
					if (map[i][j] == '.') {
						cnt[i][j] = 1;
					}
				}
				cnt[i][W] = 0;
			}
			for (int i = 1; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (map[i][j] == '.') {
						cnt[i][j] = cnt[i - 1][j] + 1;
					}
				}
			}
			Stack<Rect> stack = new Stack<Rect>();
			int max = 0;
			for (int i = 0; i < H; i++) {
				for (int j = 0; j <= W; j++) {
					Rect rect = new Rect(cnt[i][j], j);
					if (stack.isEmpty() || stack.peek().height < cnt[i][j]) {
						stack.push(rect);
					} else if (stack.peek().height > cnt[i][j]) {
						int last = -1;
						while (!stack.isEmpty()
								&& stack.peek().height > cnt[i][j]) {
							Rect pre = stack.pop();
							max = Math.max(max, pre.height * (j - pre.pos));
							last = pre.pos;
						}
						rect.pos = last;
						stack.push(rect);
					}
				}
			}
			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	class Rect {
		int height;
		int pos;

		Rect(int height, int pos) {
			this.height = height;
			this.pos = pos;
		}
	}
}