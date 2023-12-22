import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(" ");

			double ax0 = Double.parseDouble(nico[0]);
			double ay0 = Double.parseDouble(nico[1]);
			double ax1 = Double.parseDouble(nico[2]);
			double ay1 = Double.parseDouble(nico[3]);
			double bx0 = Double.parseDouble(nico[4]);
			double by0 = Double.parseDouble(nico[5]);
			double bx1 = Double.parseDouble(nico[6]);
			double by1 = Double.parseDouble(nico[7]);

			if ((ax0 < bx1) && (bx0 < ax1) && (ay0 < by1) && (by0 < ay1)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}