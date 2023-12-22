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

			double x0 = Double.parseDouble(params[0]);
			double y0 = Double.parseDouble(params[1]);
			double r0 = Double.parseDouble(params[2]);
			double x1 = Double.parseDouble(params[3]);
			double y1 = Double.parseDouble(params[4]);
			double r1 = Double.parseDouble(params[5]);
			
			double d = Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
			
			if (d > (r0 + r1)) {
				System.out.println("0");
			} else if (r0 > r1) {
				if ((d + r1) > r0) {
					System.out.println("1");
				} else {
					System.out.println("-2");
				}
			} else {
				if ((d + r0) > r1) {
					System.out.println("1");
				} else {
					System.out.println("2");
				}
			}
		}
	}
}