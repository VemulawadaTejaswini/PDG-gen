import java.util.Scanner;

public class Main {

	// 2点間を通る直線の傾きを求める
	public static double getA (double x1, double y1, double x2, double y2) {
		if (x1 == x2) return 0;
		return (y1 - y2) / (x1 - x2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double x4 = sc.nextDouble();
			double y4 = sc.nextDouble();
			double a = getA(x1,y1,x2,y2);
			double b = getA(x3,y3,x4,y4);
			System.out.println(Math.abs(a - b) < 0.0000001 ? "YES" : "NO");
		}

	}

}