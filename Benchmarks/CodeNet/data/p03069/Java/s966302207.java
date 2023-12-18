import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String s = scanner.next();

		String searchString = ".#";

		if(s.indexOf(".") ==-1 || s.indexOf("#") == -1) {
			System.out.println("0");
			scanner.close();
		} else {
			System.out.println(s.split(searchString).length);

			scanner.close();

		}

	}
}