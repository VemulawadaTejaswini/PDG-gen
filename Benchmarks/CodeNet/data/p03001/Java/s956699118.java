import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (x == 0 && y == 0) {
			double min = w * h;
			System.out.print(String.format("%.6f", min));
			System.out.print(" " + 0);
		} else if (x == 0 || y == 0) {
			double min = 0;
			if (x == 0) {
				double min1 = y * w;
				double min2 = (h - y) * w;
				if (min1 > min2) {
					min = min2;
				} else {
					min = min1;
				}
			} else {
				double min1 = x * h;
				double min2 = (w - x) * h;
				if (min1 > min2) {
					min = min2;
				} else {
					min = min1;
				}
			}
			System.out.print(String.format("%.6f", min));
			System.out.print(" " + 0);
		} else {
			//縦
			double min0 = 0;
			double min1 = x * h;
			double min2 = (w - x) * h;
			if (min1 < min2) {
				min0 = min1;
			} else {
				min0 = min2;
			}
			//横
			double min5 = 0;
			double min3 = y * w;
			double min4 = (h - y) * w;
			if (min3 < min4) {
				min5 = min3;
			} else {
				min5 = min4;
			}
			if (min5 < min0) {
				System.out.print(String.format("%.6f", min0));
			} else {
				System.out.print(String.format("%.6f", min5));
			}
			if (min0 == min5) {
				System.out.print(" " + 1);
			} else {
				System.out.print(" " + 0);
			}

		}
	}
}