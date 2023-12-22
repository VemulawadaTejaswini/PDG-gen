import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		switch (N % 10) {
			case 3:
				System.out.println("bon");
				break;
			case 0:
			case 1:
			case 6:
			case 8:
				System.out.println("pon");
				break;
			default:
				System.out.println("hon");
				break;
		}
	}
}
