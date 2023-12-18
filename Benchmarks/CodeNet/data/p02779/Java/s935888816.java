import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double n = scan.nextDouble();
		StringBuilder sb = new StringBuilder();

		for (double i = 0; i < n; i++) {
			double input = scan.nextDouble();
			sb.append(input);
			if (sb.toString().indexOf(String.valueOf(input)) > 0) {
				System.out.println("NO");
				scan.close();
				return;
			}
		}

		scan.close();
		System.out.println("YES");
	}

}
