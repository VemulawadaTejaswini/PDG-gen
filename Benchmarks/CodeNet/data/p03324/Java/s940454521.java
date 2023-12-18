import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt();
		int n = sc.nextInt();

		int x = 1;
		if (d == 1) {
			x = 100;
		} else {
			x = 10000;
		}
		if (n == 100) {
			n = n-1;
		}

		System.out.println(x*n);

		sc.close();

	}
}