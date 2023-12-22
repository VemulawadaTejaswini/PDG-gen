import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String line = sc.readLine();
			String[] lineAry = line.split(" ");
			int n = Integer.parseInt(lineAry[0]);
			int m = Integer.parseInt(lineAry[1])
			int a = Integer.parseInt(lineAry[2]);
			List<CrossBar> crbar = new ArrayList<>();
			if (n == 0 && m == 0 && a == 0) {
				return;
			}
			for (int i = 0; i < m; i++) {
				line = sc.readLine();
				lineAry = line.split(" ");
				crbar.add(new CrossBar(Integer.parseInt(lineAry[0]), Integer.parseInt(lineAry[1]),
						Integer.parseInt(lineAry[2])));
			}
			
			MyPoint mypoint = new MyPoint(a, 1002);

			while (mypoint.y > 0) {
				mypoint.y--;
				for (int k = 0; k < m; k++) {
					if (crbar.get(k).y == mypoint.y && crbar.get(k).x1 == mypoint.x) {
						mypoint.setPoint(crbar.get(k).x2, mypoint.y);
						break;
					}
					if (crbar.get(k).y == mypoint.y && crbar.get(k).x2 == mypoint.x) {
						mypoint.setPoint(crbar.get(k).x1, mypoint.y);
						break;
					}
				}
			}
			System.out.println(mypoint.x);
		}
	}

	static class MyPoint {

		private int x = 0;
		private int y = 0;

		public MyPoint(int x_val, int y_val) {
			x = x_val;
			y = y_val;
		}

		public void setPoint(int x_val, int y_val) {
			x = x_val;
			y = y_val;
		}

	}

	static class CrossBar implements Comparable<Object> {

		private int x1 = 0;
		private int x2 = 0;
		private int y = 0;

		public CrossBar(int h, int p, int q) {
			y = h;
			x1 = p;
			x2 = q;
		}

		public int compareTo(Object obj) {
			return Integer.toString(((CrossBar) obj).y).compareTo(Integer.toString(this.y));
		}
	}

}