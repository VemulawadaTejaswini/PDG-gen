import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static class Page {
		String name;
		int lnum;
		Link link[];

		Page(String name, int lnum) {
			this.name = name;
			this.lnum = lnum;
		}
	}

	static class Link {
		int x1, y1, x2, y2;
		String name;

		Link(int x1, int y1, int x2, int y2, String name) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.name = name;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int w, h;
		Page page[];
		int buf[];
		int pointer;
		int bufMax;
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			w = sc.nextInt();
			h = sc.nextInt();
			page = new Page[n];
			map.clear();
			for (int i = 0; i < n; i++) {
				String name = sc.next();
				int lnum = sc.nextInt();
				page[i] = new Page(name, lnum);
				page[i].link = new Link[lnum];
				for (int j = 0; j < lnum; j++) {
					int x1 = sc.nextInt();
					int y1 = sc.nextInt();
					int x2 = sc.nextInt();
					int y2 = sc.nextInt();
					String linkName = sc.next();
					page[i].link[j] = new Link(x1, y1, x2, y2, linkName);
				}
				map.put(name, i);
			}

			m = sc.nextInt();
			buf = new int[m + 5];
			pointer = 0;
			bufMax = 0;
			for (int i = 0; i < m; i++) {
				String o = sc.next();
				if (o.equals("click")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for (int j = 0; j < page[pointer].lnum; j++) {
						if (page[pointer].link[j].x1 <= x && x <= page[pointer].link[j].x2 &&
								page[pointer].link[j].y1 <= y && y <= page[pointer].link[j].y2) {
							buf[pointer + 1] = map.get(page[pointer].link[j].name);
							pointer++;
							bufMax = pointer;
						}
					}
				} else if (o.equals("show")) {
					System.out.println(page[pointer].name);
				} else if (o.equals("back")) {
					if (0 < pointer) {
						pointer--;
					}
				} else if (o.equals("forward")) {
					if (pointer < bufMax) {
						pointer++;
					}
				}
			}
		}
	}
}