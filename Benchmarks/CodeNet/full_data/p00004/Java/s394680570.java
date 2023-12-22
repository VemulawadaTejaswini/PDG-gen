import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double v[] = new double[6];
			for (int i = 0; i < 6; i++) {
				v[i] = sc.nextDouble();
			}
			double root = v[0]*v[4] - v[1]*v[3];
			double x = (v[4]*v[2] - v[1]*v[5]) / root;
			double y = (v[0]*v[5] - v[3]*v[2]) / root;
			System.out.printf("%.3f %.3f\n", x, y);
		}
	}
}