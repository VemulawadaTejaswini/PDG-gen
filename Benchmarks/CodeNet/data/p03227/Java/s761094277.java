import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();

		if (str.length() == 2) {
			System.out.println(str);
		} else {
			System.out.print(str.substring(2));
			System.out.print(str.substring(1, 2));
			System.out.println(str.substring(0, 1));
		}

		reader.close();

	}

}
