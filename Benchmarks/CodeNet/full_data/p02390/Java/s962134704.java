import java.util.Scanner;

class Main {
	private static Scanner scan = new Scanner(System.in);;

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(scan.next());
			System.out.println((n / 3600) + ":" + (n % 3600 / 60) + ":" + (n % 3600 % 60));
		} catch (Exception e) {
			System.exit(0);
		}
	}
}