import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			double det = a * e - b * d;
			if(det != 0) {
				double x = (double) ((e * c - b * f) / det);
				double y = (double) ((d * c - a * f) / det);
				if (x == 0) x = 0;
				if (y == 0) y = 0;
				System.out.printf("%.3f %.3f",x,y);
			}
		}
	}
		
}