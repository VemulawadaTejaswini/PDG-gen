import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numM = scan.nextInt();
		int numD = scan.nextInt();

		int result = 0;
		for (int i = 4; i <= numM; i++) {
			for (int j = 22; j <= numD; j++) {
				int k = j % 10;
				int l = j / 10;
				if (k > 1 && i == k * l) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
