import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		boolean bb = true;
		while (bb) {
			int i = c - b;
			if (i <= 0) {
				System.out.println("Yes");
				break;
			} else {
				c = i;
			}
			int ii = a - d;
			if (ii <= 0) {
				System.out.println("No");
				break;
			} else {
				a = ii;
			}
		}

		sc.close();
	}
}