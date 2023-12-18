import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		if(scan.next().equals("Sunny")) {
			System.out.println("Cloudy");
		}
		if(scan.next().equals("Cloudy")) {
			System.out.println("Rainy");
		}
		if(scan.next().equals("Rainy")) {
			System.out.println("Sunny");
		}

	}
}