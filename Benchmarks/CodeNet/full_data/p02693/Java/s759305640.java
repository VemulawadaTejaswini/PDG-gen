import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int K = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int f = 0;

		for (int i = A; i <= B; i++) {
			if (i % K ==0) {
				f++;
				break;
			}
		}

		if (f == 0) System.out.println("NG");
		if (f == 1) System.out.println("OK");

	}

}