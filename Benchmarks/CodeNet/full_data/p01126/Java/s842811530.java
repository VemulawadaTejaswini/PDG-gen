package volume_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String line = sc.readLine();
		String[] lineAry = line.split(" ");
		int n = Integer.parseInt(lineAry[0]);// ???????????¬??°
		int m = Integer.parseInt(lineAry[1]);// ?¨?????????¬??°
		int a = Integer.parseInt(lineAry[2]);// ????????????????????????
		List<Main.CrossBar> crbar = new ArrayList<>();

		for (int i = 0; i < m; i++) {// ?¨?????????????????????????, ???????????£??????????????????????????2
			line = sc.readLine();
			lineAry = line.split(" ");
			crbar.add(new Main.CrossBar(Integer.parseInt(lineAry[0]), Integer.parseInt(lineAry[1]),
					Integer.parseInt(lineAry[2])));
		}

		Collections.sort(crbar);

		MyPoint mypoint = new MyPoint(a, crbar.get(0).y + 1);

		while (mypoint.y > 0) {
			// System.out.println("(x, y) = (" + mypoint.x + ", " + mypoint.y +
			// ")");
			for (int k = 0; k < m; k++) {
				if (crbar.get(k).y == mypoint.y && crbar.get(k).x1 == mypoint.x) {
					mypoint.setPoint(crbar.get(k).x2, mypoint.y - 1);
					break;
				}
				if (crbar.get(k).y == mypoint.y && crbar.get(k).x2 == mypoint.x) {
					mypoint.setPoint(crbar.get(k).x1, mypoint.y - 1);
					break;
				}
				if (k == m - 1) {
					mypoint.y--;
				}
			}
		}
		System.out.println(mypoint.x);
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
			// y?????????????????????
			return Integer.toString(((CrossBar) obj).y).compareTo(Integer.toString(this.y));
		}
	}

}