import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		String data = null;
		String[] bmi = new String[3];
		double BMI = 0.0;
		Arrays.fill(bmi, null);

		while(stdin.hasNext()) {

			data = stdin.next();
			bmi = data.split(",");
			BMI = Double.parseDouble(bmi[1]) / (Double.parseDouble(bmi[2]) * Double.parseDouble(bmi[2]));
			if(BMI >= 25) {
				System.out.println(bmi[0]);
			}

		}

	}

}