import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		System.out.println("2018" + s.substring(4, s.length()));

		scan.close();

	}

}