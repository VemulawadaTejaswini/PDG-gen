import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		locateTresure();
	}

	private static void locateTresure() {
		double x = 0;
		double y = 0;
		int angle = 0;

		do {

			String input = sc.nextLine();
			if (input.equals("0,0")) {
				break;
			}

			String[] dt = input.split(",");

			int d = Integer.parseInt(dt[0]);
			int a = Integer.parseInt(dt[1]);

			x += d * Math.sin( Math.toRadians(angle) );
			y += d * Math.cos( Math.toRadians(angle) );

			angle += a;

		}while(true);

		System.out.printf("%f %f", x, y);



	}

}
