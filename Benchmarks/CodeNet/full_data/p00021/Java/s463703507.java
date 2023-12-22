import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		int nico = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < nico; i++) {
			String[] params = sc.nextLine().split(" ");
			
			double[] points = new double[8];
			for (int j = 0; j < points.length; j++) {
				points[j] = Double.parseDouble(params[j]);
			}
			
			double dx0 = (points[2] - points[0]) * 10000;
			double dy0 = (points[3] - points[1]) * 10000;
			double dx1 = (points[6] - points[4]) * 10000;
			double dy1 = (points[7] - points[5]) * 10000;

			int d = (int)(dx0 * dy1 - dy0 * dx1);
			if (d == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}