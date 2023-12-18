import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();


		for (int i=n; i<=999; i++) {
			int a = i/100;
			int b = i%100 / 10;
			int c = i%100 % 10;
			if (a == b && a == c) {
				System.out.println(i);
				break;
			}
		}

		sc.close();
	}

}
