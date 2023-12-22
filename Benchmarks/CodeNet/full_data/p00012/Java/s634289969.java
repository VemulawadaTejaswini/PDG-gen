import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3, xp, yp;
		double s1, s2, s3,s4;

		while (scan.hasNext()) {
			x1 = scan.nextDouble();
			y1 = scan.nextDouble();
			x2 = scan.nextDouble();
			y2 = scan.nextDouble();
			x3 = scan.nextDouble();
			y3 = scan.nextDouble();
			xp = scan.nextDouble();
			yp = scan.nextDouble();

			s1=Math.abs((x1*y2+x2*y3+x3*y1-y1*x2-y2*x3-y3*x1)/2);
			s2=Math.abs((xp*y2+x2*y3+x3*yp-yp*x2-y2*x3-y3*xp)/2);
			s3=Math.abs((x1*yp+xp*y3+x3*y1-y1*xp-yp*x3-y3*x1)/2);
			s4=Math.abs((x1*y2+x2*yp+xp*y1-y1*x2-y2*xp-yp*x1)/2);

			if (s1 ==s2 + s3+s4) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}