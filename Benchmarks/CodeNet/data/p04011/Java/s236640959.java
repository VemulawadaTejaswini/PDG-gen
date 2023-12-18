import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();

		int a = k * x;
		int b = 0;

		if (n > k) {
			b = (n - k) * y;
			System.out.println(a+b);

		} else {
			b = n * x;
			System.out.println(b);
		}

		//System.out.println(a + b);

	}

}