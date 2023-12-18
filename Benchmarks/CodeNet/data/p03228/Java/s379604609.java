import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		int k = scan.nextInt();
		long taka = a;
		long ao = b;

		for (int i = 1; i <= k; i++) {
			if (i % 2 == 1) {
				if (taka % 2 == 1) {
					taka = taka - 1;
				}
				long A = taka/2;
				taka -= A;
				ao += A;
			} else {
				if (ao % 2 == 1) {
					ao = ao - 1;
				}
				long B = ao/2;
				ao -= B;
				taka += B;
			}
		}

		System.out.println(taka + " " + ao);
	}
}
