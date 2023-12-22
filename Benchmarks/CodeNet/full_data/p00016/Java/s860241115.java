import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		double x = 0;
		double y = 0;
		double r = 0;
		double w = 90;
		double t;
		String[] inputData = new String[2];

		while (true) {
			inputData = sc.nextLine().split(",");
	
			r = Double.valueOf(inputData[0]);
			t = Double.valueOf(inputData[1]);
			x += r * Math.cos(w / 180 * Math.PI);
			y += r * Math.sin(w / 180 * Math.PI);
			w -= t;
			
			if (r == 0 && t == 0) {
				break;
			}
		}
		System.out.println((int) x);
		System.out.println((int) y);
	}

}