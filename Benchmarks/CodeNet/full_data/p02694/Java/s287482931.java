import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long X = scan.nextLong();
		long money = 100;
		int year = 0;

		while (money < X) {
			money *= 1.01;
			year++;
		}

		System.out.println(year);
	}

}