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
			
			double dx0 = points[2] - points[0];
			double dy0 = points[3] - points[1];
			double dx1 = points[6] - points[4];
			double dy1 = points[7] - points[5];
			if (Double.compare(dx0, 0.0) == 0) {
				if (Double.compare(dx1, 0.0) == 0) System.out.println("NO");
				else System.out.println("YES");
				
				continue;
			}

			double d0 = dy0 / dx0;
			double d1 = dy1 / dx1;
			
			if (Double.compare(d0, d1) == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}