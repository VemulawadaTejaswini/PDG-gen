import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			String[] nico = sc.nextLine().split(",");
			double w = Double.parseDouble(nico[1]);
			double h = Double.parseDouble(nico[2]);
			
			if ((w / (h * h)) >= 25.0) System.out.println(nico[0]);
		}
	}
}