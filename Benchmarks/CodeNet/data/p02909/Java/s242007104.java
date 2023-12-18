import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		if (s.contains("sunny")) {
			System.out.println("cloudy");
		} else if (s.contains("cloudy")) {
			System.out.println("rainy");
		} else {
			System.out.println("sunny");
		}
		sc.close();
	}
}