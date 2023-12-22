
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String[] line = scanner.nextLine().split(",");
			int num = Integer.parseInt(line[0]);
			double w = Double.parseDouble(line[1]);
			double h = Double.parseDouble(line[2]);
			double bmi = w / (h * h);
			if (bmi >= 25) {
				System.out.println(num);
			}
		}
	}
}