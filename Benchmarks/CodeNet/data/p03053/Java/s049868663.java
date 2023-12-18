import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		Main main = new Main();
		List<Point> targetList = new ArrayList<Point>();
		char c[][] = new char[H][W];
		for (int i = 0; i < H; i++) {
			String s = sc.next();
			char temp[] = s.toCharArray();
			for (int j = 0; j < W; j++) {
				c[i][j] = temp[j];
				if (c[i][j] == '#') {
					Point p = main.new Point();
					p.x = i;
					p.y = j;
					targetList.add(p);
				}
			}
		}
		int count =0;
		while (targetList.size()>0) {
			List<Point> temp = new ArrayList<Point>();
			for (Point p :targetList) {
				if (p.y>0) {
					if (c[p.x][p.y-1]=='.') {
						c[p.x][p.y-1] = '#';
						Point t = main.new Point();
						t.x = p.x;
						t.y = p.y-1;
						temp.add(t);
					}
				}
				if (p.x>0) {
					if (c[p.x-1][p.y]=='.') {
						c[p.x-1][p.y] = '#';
						Point t = main.new Point();
						t.x = p.x-1;
						t.y = p.y;
						temp.add(t);
					}
				}
				if (p.x<H-1) {
					if (c[p.x+1][p.y]=='.') {
						c[p.x+1][p.y] = '#';
						Point t = main.new Point();
						t.x = p.x+1;
						t.y = p.y;
						temp.add(t);
					}
				}
				if (p.y<W-1) {
					if (c[p.x][p.y+1]=='.') {
						c[p.x][p.y+1] = '#';
						Point t = main.new Point();
						t.x = p.x;
						t.y = p.y+1;
						temp.add(t);
					}
				}
			}
			targetList = temp;
			if (temp.size()>0) {
				count++;
			}
		}
		System.out.println(count);
	}

	public class Point {
		int x;
		int y;
	}
}