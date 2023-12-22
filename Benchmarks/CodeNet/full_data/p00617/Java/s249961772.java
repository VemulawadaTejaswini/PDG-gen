import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			String line = sc.next();
			Panel root = new Parser(line).parse();
			for (int i = 0; i < N; ++i) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				Panel p = root.hit(x, y);
				if (p == null) {
					System.out.println("OUT OF MAIN PANEL 1");
				} else {
					System.out.println(p.name + " " + p.child.size());
				}
			}
		}
	}

	static class Parser {

		char[] str;
		int pos;

		Parser(String line) {
			this.str = line.toCharArray();
		}

		Panel parse() {
			++pos;
			StringBuilder name = new StringBuilder();
			while (str[pos] != '>') {
				name.append(str[pos]);
				++pos;
			}
			++pos;
			int x1 = parseInt();
			++pos;
			int y1 = parseInt();
			++pos;
			int x2 = parseInt();
			++pos;
			int y2 = parseInt();
			Panel ret = new Panel(x1, y1, x2, y2, name.toString());
			while (str[pos + 1] != '/') {
				ret.child.add(parse());
			}
			while (str[pos] != '>') {
				++pos;
			}
			++pos;
			return ret;
		}

		int parseInt() {
			int ret = 0;
			while ('0' <= str[pos] && str[pos] <= '9') {
				ret *= 10;
				ret += str[pos] - '0';
				++pos;
			}
			return ret;
		}
	}

	static class Panel {
		int x1, y1, x2, y2;
		String name;
		ArrayList<Panel> child = new ArrayList<Panel>();

		Panel(int x1, int y1, int x2, int y2, String name) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.name = name;
		}

		Panel hit(int x, int y) {
			if (x < this.x1 || this.x2 < x || y < this.y1 || this.y2 < y) return null;
			for (Panel c : child) {
				Panel ret = c.hit(x, y);
				if (ret != null) return ret;
			}
			return this;
		}
	}

}