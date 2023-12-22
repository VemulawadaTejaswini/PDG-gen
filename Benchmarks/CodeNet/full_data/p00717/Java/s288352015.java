import java.util.Scanner;

public class Main {
	static String[] getFigure(Scanner sc) {
		StringBuilder str = new StringBuilder();
		StringBuilder rev = new StringBuilder();
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
		rev.append(length);
		for (int j = 2; j < m; j++) {
			int nextx = sc.nextInt();
			int nexty = sc.nextInt();
			int newway = nextx == x ? 0 : 1;
			if (nexty - y < 0 || nextx - x < 0) {
				newway += 2;
				dir = way == 3 || way == 0 ? "L" : "R";
			} else {
				dir = way == 3 || way == 0 ? "R" : "L";
			}
			str.append(dir);
			rev.insert(0, dir.equals("L") ? "R" : "L");
			length = Math.abs(x - nextx) + Math.abs(y - nexty);
			str.append(length);
			rev.insert(0, length);
			x = nextx;
			y = nexty;
			way = newway;
		}
		String[] s = new String[2];
		s[0] = str.toString();
		s[1] = rev.toString();
		return s;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			String[] origin = getFigure(sc);
			for (int i = 0; i < n; i++) {
				String[] figure = getFigure(sc);
				if (origin[0].equals(figure[0]) || origin[1].equals(figure[0])) {
					System.out.println(i + 1);
				}
			}
			System.out.println("+++++");
		}
	}
}