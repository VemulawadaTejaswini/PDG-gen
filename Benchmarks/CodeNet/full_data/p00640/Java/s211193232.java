
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			String s = "";
			int w = scanner.nextInt();
			int h = scanner.nextInt();
			Map<String, Page> map = new HashMap<String, Page>();
			while (n-- > 0) {
				String name = scanner.next();
				if (s.isEmpty())
					s = name;
				int b = scanner.nextInt();
				Button[] buttons = new Button[b];
				for (int i = 0; i < b; i++) {
					int sx = scanner.nextInt();
					int sy = scanner.nextInt();
					int ex = scanner.nextInt();
					int ey = scanner.nextInt();
					String to = scanner.next();
					buttons[i] = new Button(sx, sy, ex, ey, to);
				}
				map.put(name, new Page(buttons));
			}
			int m = scanner.nextInt();
			String[] buff = new String[m];
			buff[0] = s;
			int l = 0;
			int r = 1;
			while (m-- > 0) {
				String op = scanner.next();
				if (op.equals("click")) {
					int x = scanner.nextInt();
					int y = scanner.nextInt();
					String to = map.get(buff[l]).click(x, y);
					if (!to.isEmpty()) {
						buff[++l] = to;
						r = l + 1;
					}
				} else if (op.equals("back"))
					l = Math.max(0, l - 1);
				else if (op.equals("forward"))
					l = Math.min(r - 1, l + 1);
				else
					System.out.println(buff[l]);
			}
		}
	}

	class Button {
		int sx, sy, ex, ey;
		String to;

		public Button(int sx, int sy, int ex, int ey, String to) {
			super();
			this.sx = sx;
			this.sy = sy;
			this.ex = ex;
			this.ey = ey;
			this.to = to;

		}

		boolean isHit(int x, int y) {
			return sx <= x && x <= ex && sy <= y && y <= ey;

		}

	}

	class Page {
		Button[] buttons;

		public Page(Button[] buttons) {
			super();
			this.buttons = buttons;
		}

		String click(int x, int y) {
			for (Button b : buttons) {
				if (b.isHit(x, y))
					return b.to;
			}
			return "";
		}
	}
}