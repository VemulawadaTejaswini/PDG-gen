import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();

		int d = 0;
		int count = 1;

		while (count < (n + 1)) {
			d = d + scan.nextInt();
			if (d > x) {
				break;
			}
			count++;
		}

		System.out.println(count);

		scan.close();
	}

}