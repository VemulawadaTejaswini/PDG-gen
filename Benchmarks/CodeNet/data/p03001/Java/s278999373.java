import java.util.Scanner;

public class Main {
	static boolean memo[];
	static int ans, min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		long area1, area2, area3, area4;
		long min, min1, min2;
		area1 = h * x;
		area2 = h * (w - x);
		area3 = y * w;
		area4 = (h - y) * w;
		if (area1 == 0 || area2 == 0) {
			min1 = Long.MAX_VALUE;
		} else {
			min1 = Math.min(area1, area2);
		}
		if (area3 == 0 || area4 == 0) {
			min2 = Long.MAX_VALUE;
		} else {
			min2 = Math.min(area3, area4);
		}

		if (min1 == min2) {
			System.out.println(min1 + " " + 1);
		} else {
			System.out.println(Math.max(min1, min2) + " " + 0);
		}

	}
}
