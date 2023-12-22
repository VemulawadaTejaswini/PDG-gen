import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		N = N % 10;

		if (N == 3) {
			System.out.println("bon");
		}else if(N == 0 || N == 1 || N == 6 || N == 8) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}
}
