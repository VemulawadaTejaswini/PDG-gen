import java.util.Scanner;

//AtCoder Beginner Contest 141
//A	Weather Prediction
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		if ("Sunny".equals(S)) {
			System.out.println("Cloudy");
		} else if ("Cloudy".equals(S)) {
			System.out.println("Rainy");
		} else {
			System.out.println("Sunny");
		}
	}
}
