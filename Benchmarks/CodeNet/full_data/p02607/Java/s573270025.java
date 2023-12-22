
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {



	b.main(null);

	}

}

class b {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] ar = scanner.nextLine().split(" ");

		int count = 0;
		for (int i = 1; i < ar.length; i += 2) {
			if (Integer.parseInt(ar[i]) % 2 != 0) {
				count++;
			}
		}

		System.out.println(count);

	}

}

class a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		int r = scanner.nextInt();
		int d = scanner.nextInt();

		int count = (r - l) / d;
		if (r % d == 0) {
			count++;
		}

		if (r == l) {
			count = 1;
		}

		System.out.println(count);

	}

}