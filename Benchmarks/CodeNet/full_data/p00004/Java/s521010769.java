import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ax+by=c dx+ey=f
		// aex+bey=ce bdx+bey=bf
		// (ae-bd)x=ce-bf
		// ...
		// (bd-ae)y=dc-af

		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double a = scan.nextDouble();
			double b = scan.nextDouble();
			double c = scan.nextDouble();
			double d = scan.nextDouble();
			double e = scan.nextDouble();
			double f = scan.nextDouble();
			long x = (long) ((c * e - b * f) / (a * e - b * d) * 1000);
			long y = (long) ((d * c - a * f) / (d * b - a * e) * 1000);
			System.out.printf("%.3f %.3f\n", (double) (x / 1000), (double) (y / 1000));
		}
		scan.close();
		System.exit(0);
	}
}