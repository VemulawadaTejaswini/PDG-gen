import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double x1, y1, x2, y2, x3, y3, x4, y4;
		double d12, d34;
		for (int i = 0; i < n; i++) {
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			x4 = scan.nextDouble();
			y4 = scan.nextDouble();
			d12 = (y1 - y2) / (x1 - x2);
			d34 = (y3 - y4) / (x3 - x4);
			if (d12 == d34) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}