package volume_20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No_2000 {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			} else {
				List<Point> treasure = new ArrayList<>();
				for (int i = 0; i < n; i++) {
					line = sc.nextLine();
					String[] lineAry = line.split(" ");
					treasure.add(new Point(Integer.parseInt(lineAry[0]), Integer.parseInt(lineAry[1])));
				}
				line = sc.nextLine();
				int m = Integer.parseInt(line);
				int trecount = 0;
				Point mypoint = new Point(10, 10);
				for (int i = 0; i < m; i++) {
					line = sc.nextLine();
					String[] lineAry = line.split(" ");
					int d = Integer.parseInt(lineAry[1]);
					if (lineAry[0].equals("N")) {
						for (int j = 0; j < d; j++) {
							mypoint.setY(mypoint.getY() + 1);
							for (Point tmp : treasure) {// tresure?????????????????´????????????????????????????´¢
								if (tmp.getX() == mypoint.getX() && tmp.getY() == mypoint.getY()) {
									trecount++;
									treasure.remove(tmp);
									break;
								}
							}
						}
					}
					if (lineAry[0].equals("E")) {
						for (int j = 0; j < d; j++) {
							mypoint.setX(mypoint.getX() + 1);
							for (Point tmp : treasure) {// tresure?????????????????´????????????????????????????´¢
								if (tmp.getX() == mypoint.getX() && tmp.getY() == mypoint.getY()) {
									trecount++;
									treasure.remove(tmp);
									break;
								}
							}
						}
					}
					if (lineAry[0].equals("S")) {
						for (int j = 0; j < d; j++) {
							mypoint.setY(mypoint.getY() - 1);
							for (Point tmp : treasure) {// tresure?????????????????´????????????????????????????´¢
								if (tmp.getX() == mypoint.getX() && tmp.getY() == mypoint.getY()) {
									trecount++;
									treasure.remove(tmp);
									break;
								}
							}
						}
					}
					if (lineAry[0].equals("W")) {
						for (int j = 0; j < d; j++) {
							mypoint.setX(mypoint.getX() - 1);
							for (Point tmp : treasure) {// tresure?????????????????´????????????????????????????´¢
								if (tmp.getX() == mypoint.getX() && tmp.getY() == mypoint.getY()) {
									trecount++;
									treasure.remove(tmp);
									break;
								}
							}
						}
					}
					System.out.println(mypoint.getX() + ", " + mypoint.getY() + " : " + trecount);
				}
				if (trecount == n) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
}

class Point {
	private int x;
	private int y;

	public void setX(int inX) {
		x = inX;
	}

	public void setY(int inY) {
		y = inY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int inX, int inY) {
		x = inX;
		y = inY;
	}
}