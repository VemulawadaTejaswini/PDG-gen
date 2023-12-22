import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < n; i++) {
			String time = scanner.nextLine();
			int hour = Integer.parseInt(time.substring(0, 2));
			int min = Integer.parseInt(time.substring(3, 5));
			
			double rad_min = 6.0 * min;
			double rad_hour = 30.0 * hour + 30.0 * min / 60.0;
			
			double rad = Math.abs(rad_min - rad_hour);
			if (rad > 180) {rad -= 180;}
			
			if (rad < 30.0) {
				System.out.println("alert");
			} else if (rad >= 90.0) {
				System.out.println("safe");
			} else {
				System.out.println("warning");
			}
		}
	}

}