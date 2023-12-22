import java.util.*;
import java.text.*;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			double a = scan.nextInt();
			double b = scan.nextInt();
			double e = scan.nextInt();
			double c = scan.nextInt();
			double d = scan.nextInt();
			double f = scan.nextInt();
			
			double x = (d * e - b * f) / (a * d - b * c);
			double y = (a * f - c * e) / (a * d - b * c);
			
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(3);
			nf.setMinimumFractionDigits(3);
			
			if (x == 0) {
				x = 0;
			}
			if (y == 0) {
				y = 0;
			}
			
			System.out.println(nf.format(x) +" "+ nf.format(y));
		}
	}
}