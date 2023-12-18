import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		if (N.equals("Sunny")) {
			System.out.println("Cloudy");
		}else if (N.equals("Cloudy")) {
			System.out.println("Rainy");
		}else if (N.equals("Rainy")) {
			System.out.println("Sunny");
		}
		sc.close();
	}
}