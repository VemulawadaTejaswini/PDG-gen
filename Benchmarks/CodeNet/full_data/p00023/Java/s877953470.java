import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double xa, ya, ra, xb, yb, rb;
		int flag;
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			xa = scan.nextDouble();
			ya = scan.nextDouble();
			ra = scan.nextDouble();
			xb = scan.nextDouble();
			yb = scan.nextDouble();
			rb = scan.nextDouble();

			double d = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
			if (d > ra + rb) {
				flag = 0;
			} else if (d >= ra && d >= rb) {
				flag = 1;
			} else {
				if (ra > rb) {
					flag = 2;
				} else {
					flag = -2;
				}
			}
			System.out.println(flag);
		}
	}

}