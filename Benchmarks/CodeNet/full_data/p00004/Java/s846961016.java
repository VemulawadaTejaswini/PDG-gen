package aizu.online.judge.volume0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> ret = new ArrayList<String>();
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			double mag = (double) d / a;
			double y = (mag * c - f) / (mag * b - e);
			if (Double.isNaN(y)) {
				y = 0;
			}
			double x = (f - e * y) / d;
			if (x == 0) {
				x = Math.abs(x);
			}
			if (y == 0) {
				y = Math.abs(y);
			}
			String ans = String.format("%.3f", x).concat(" ").concat(String.format("%.3f", y));
			ret.add(ans);
		}
		for (String ans : ret) {
			System.out.println(ans);
		}
	}
}