import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		while (sc.hasNextLine()) {
			double weight = Double.parseDouble(sc.nextLine());
			
			String c = "";
			if (weight > 91.0) c = "heavy";
			else if (weight > 81.0) c = "light heavy";
			else if (weight > 75.0) c = "midle";
			else if (weight > 69.0) c = "light middle";
			else if (weight > 64.0) c = "welter";
			else if (weight > 60.0) c = "light welter";
			else if (weight > 57.0) c = "light";
			else if (weight > 54.0) c = "feather";
			else if (weight > 51.0) c = "bantam";
			else if (weight > 48.0) c = "fly";
			else c = "light fly";
			
			System.out.println(c);
		}
	}
}