import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		String[] s = sc.nextLine().split(" ");
		if (Arrays.stream(s).filter(e -> e.equals("Y")).count() > 0L) {
			System.out.println("Four");
		} else {
			System.out.println("Three");
		}

		sc.close();
	}
}