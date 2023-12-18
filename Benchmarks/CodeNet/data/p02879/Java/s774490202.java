import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();

		if(A >= 10) {
			System.out.println(-1);
			return;
		}
		if(B >= 10) {
			System.out.println(-1);
			return;
		}

		System.out.println(A * B);
	}
}