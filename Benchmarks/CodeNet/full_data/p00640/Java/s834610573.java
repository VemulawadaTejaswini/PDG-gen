import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static class Page {
		String name;
		int bnum;
		Link link[];
		String linkName[];
	}

	static class Link {
		int x1, y1, x2, y2;

		Link(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int w, h;
		Page page[];
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int buf[];
		int bufMax;
		int pointer;

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
				page[i] = new Page();
				String name = sc.next();
				int lnum = sc.nextInt();
				page[i].name = name;
				page[i].bnum = lnum;
				page[i].link = new Link[page[i].bnum];
				page[i].linkName = new String[page[i].bnum];
				for (int j = 0; j < page[i].bnum; j++) {
					int x1 = sc.nextInt();
					int y1 = sc.nextInt();
					int x2 = sc.nextInt();
					int y2 = sc.nextInt();
					String linkName = sc.next();
					page[i].link[j] = new Link(x1, y1, x2, y2);
					page[i].linkName[j] = linkName;
				}
				map.put(name, i);
			}

			m = sc.nextInt();
			buf = new int[10000000];
			bufMax = 0;
			pointer = 0;
			for (int i = 0; i < m; i++) {
				String order = sc.next();
				if (order.equals("click")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for (int j = 0; j < page[pointer].bnum; j++) {
						if (page[pointer].link[j].x1 <= x && x <= page[pointer].link[j].x2 && 
								page[pointer].link[j].y1 <= y && y <= page[pointer].link[j].y2) {
							buf[pointer + 1] = map.get(page[pointer].linkName[j]);
							bufMax++;
							pointer++;
						}
					}
				} else if (order.equals("show")) {
					System.out.println(page[pointer].name);
				} else if (order.equals("back")) {
					if (0 < pointer) {
						pointer--;
					}
				} else if (order.equals("forward")) {
					if (pointer < bufMax) {
						pointer++;
					}
				}
			}
		}
	}
}