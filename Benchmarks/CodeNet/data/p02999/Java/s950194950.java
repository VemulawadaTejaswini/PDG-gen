import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		//int r = sc.nextInt();

		if (x < a) {
			System.out.print("0");
		} else {
			System.out.print("10");
		}
	}
}