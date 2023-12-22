import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] strings = line.split(" ");
		int a = Integer.parseInt(strings[0]);
		int b = Integer.parseInt(strings[1]);
		int mennseki = a * b;
		int mawari = 2 * (a + b);
		System.out.print(mennseki + " " + mawari);
	}

}