import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int x = scan.nextInt();

		int d = 0;
		int count = 0;

		while (d <= x && count < n) {
			count++;
			d = d + scan.nextInt();
		}

		System.out.println(count);

		scan.close();
	}

}