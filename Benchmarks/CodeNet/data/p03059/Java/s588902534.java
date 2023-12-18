import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = sc.nextInt();

		int count = 0;

		for (int i = 1; i * a <= t + 0.5; i++ ) {
			count = count + b;
		}

		System.out.println(count);

	}

}
