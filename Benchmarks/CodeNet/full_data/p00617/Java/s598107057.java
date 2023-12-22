import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {
			int n = Integer.parseInt(line);
			Panel parent, child;
			parent = parse(br.readLine());
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int p[] = new int[2];
				p[0] = Integer.parseInt(line.split(" ")[0]);
				p[1] = Integer.parseInt(line.split(" ")[1]);
				child = parent.touched(main.new Point(p[0], p[1]));
				if (child == null) {
					System.out.println("OUT OF MAIN PANEL 1");
				} else {
					System.out
							.println(child.name + " " + child.children.size());
				}
			}
		}
	}

	// タグ文字列のパース
	public static Panel parse(String struct) {

		Stack<Panel> stack = new Stack<P1031.Panel>();
		Panel result = null;

		char c;
		StringBuilder name, points;
		name = points = null;
		for (int i = 0; i < struct.length(); i++) {
			c = struct.charAt(i);

			// 名前の読み取り
			if (c == '<') {
				i++;
				c = struct.charAt(i);
				if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
					name = new StringBuilder();
					while (c != '>') {
						name.append(c);
						i++;
						c = struct.charAt(i);
					}
				} else if (c == '/') {
					stack.pop();
					while (c != '>') {
						i++;
						c = struct.charAt(i);
					}
				}
			}
			// 座標の読み取り
			if ((c >= '0' && c <= '9') || c == ',') {
				points = new StringBuilder();
				points.append(c);
				while (struct.charAt(i + 1) != '<') {
					i++;
					points.append(struct.charAt(i));
				}
			}
			// 新しいパネル
			if (name != null && points != null) {

				int[] p = new int[4];
				p[0] = Integer.parseInt(points.toString().split(",")[0]);
				p[1] = Integer.parseInt(points.toString().split(",")[1]);
				p[2] = Integer.parseInt(points.toString().split(",")[2]);
				p[3] = Integer.parseInt(points.toString().split(",")[3]);

				Point top, buttom;
				Panel panel;

				top = main.new Point(p[0], p[1]);
				buttom = main.new Point(p[2], p[3]);
				panel = main.new Panel(name.toString(), top, buttom);

				if (stack.size() > 0) {
					stack.peek().children.add(panel);
					stack.push(panel);
				} else {
					stack.push(main.new Panel(name.toString(), top, buttom));
					result = stack.firstElement();

				}
				name = points = null;
			}
		}
		return result;
	}

	// ポイント
	public class Point {
		int x, y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	// パネル
	public class Panel {
		String name;
		Point top, buttom;
		ArrayList<Panel> children;

		public Panel(String name, Point top, Point buttom) {
			this.name = name;
			this.top = top;
			this.buttom = buttom;
			children = new ArrayList<Panel>();
		}

		public ArrayList<Panel> add(Panel panel) {
			if (children.add(panel))
				return children;
			else
				return null;
		}

		private boolean isIntercect(Point touch) {
			if (touch.x >= top.x && touch.y >= top.y)
				if (touch.x <= buttom.x && touch.y <= buttom.y)
					return true;
			return false;
		}

		public Panel touchedChild(Point touch) {
			for (Panel child : children) {
				if (child.isIntercect(touch))
					return child;
			}
			return this;
		}

		public Panel touched(Point touch) {
			Panel result = null;
			if (this.isIntercect(touch)) {
				Panel parent, child;
				parent = this;
				child = parent.touchedChild(touch);
				while (!child.equals(parent)) {
					parent = child;
					child = parent.touchedChild(touch);
				}
				result = child;
			}
			return result;
		}
	}
}