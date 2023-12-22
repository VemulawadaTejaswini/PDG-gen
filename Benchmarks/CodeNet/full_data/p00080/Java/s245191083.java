import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			double q = Double.parseDouble(sc.nextLine());
			if (q == -1.0) break;
			
			double x = q / 2;
			while (Math.abs(x * x * x - q) >= (q * 1E-5)) {
				x = x - (x * x * x - q) / (3 * x * x);
			}
			
			System.out.println(x);
		}
	}
}