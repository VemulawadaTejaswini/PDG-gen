import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();

		if (x * 4 < y || y % 2 == 1) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}