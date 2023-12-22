import java.util.Scanner;

public class Main {
	static String getFigure(Scanner sc) {
		StringBuilder str = new StringBuilder();
		int m = sc.nextInt();
		int startx = sc.nextInt();
		int starty = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int way = startx == x ? 0 : 1;
		String dir = "";
		if (y - starty < 0 || x - startx < 0) {
			way += 2;
		}
		int length = Math.abs(x - startx) + Math.abs(y - starty);
		str.append(length);
		for (int j = 2; j < m; j++) {
			int nextx = sc.nextInt();
			int nexty = sc.nextInt();
			int newway = nextx == x ? 0 : 1;
//			dir = nextx == x ? "L" : "R";
			if (nexty - y < 0 || nextx - x < 0) {
				newway += 2;
			}
			if (nexty - y < 0 || nextx - x < 0) {
				dir = way == 3 || way == 0 ? "L" : "R";
			} else {
				dir = way == 3 || way == 0 ? "R" : "L";
			}
/*			if (nextx == x) {
				if (nexty - y < 0) {
					dir = way == 3 ? "L" : "R";
				} else {
					dir = way == 3 ? "R" : "L";
				}
			} else {
				if (nextx - x < 0) {
					dir = way == 0 ? "L" : "R";
				} else {
					dir = way == 0 ? "R" : "L";
				}
			}*/
			str.append(dir);
			length = Math.abs(x - nextx) + Math.abs(y - nexty);
			str.append(length);
			x = nextx;
			y = nexty;
			way = newway;
		}
		return str.toString();
	}

	private static String Reverse(String str) {
		StringBuilder origin_rev = new StringBuilder();
		StringBuilder num = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				num.append(c);
			} else if (c == 'L') {
				origin_rev.insert(0, num);
				origin_rev.insert(0, 'R');
				num = new StringBuilder();
			} else {
				origin_rev.insert(0, num);
				origin_rev.insert(0, 'L');
				num = new StringBuilder();
			}
		}
		origin_rev.insert(0, num);
		return origin_rev.toString();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			String origin = getFigure(sc);
			String origin_rev = Reverse(origin);
			for (int i = 0; i < n; i++) {
				String figure = getFigure(sc);
				if (origin.equals(figure) || origin_rev.equals(figure)) {
					System.out.println(i + 1);
				}
			}
			System.out.println("+++++");
		}
	}
}