import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int sum = 0;
		for(int i = 0; i  < n; i++) {
			int q = scan.nextInt();
			while (q % 2 == 0) {
				q /= 2;
				sum++;

			}
		}

		System.out.println(sum);
	}
}