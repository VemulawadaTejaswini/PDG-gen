import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String we = sc.next();

		if(we.equals("Sunny")) {
			System.out.println("Cloudy");
		}else if(we.equals("Cloudy")) {
			System.out.println("Rainy");
		} else {
			System.out.println("Sunny");
		}
	}
}