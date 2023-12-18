import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0;
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		int takahashi = 0;
		int aoki = 0;

		Scanner scanner = new Scanner(System.in);

		n = scanner.nextInt();

		for (int i = 0; n > i; i++) {
			a.add(scanner.nextInt());
			b.add(scanner.nextInt());
		}

		for (int i = n-1; i >= 0; i--) {
			if (i % 2 == 0) {
				takahashi += a.get(i);
			} else {
				aoki += b.get(i);
			}
		}

		System.out.print(takahashi - aoki);

		scanner.close();
	}

}
