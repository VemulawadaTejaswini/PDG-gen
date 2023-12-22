
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNextInt()) {
			int n = stdIn.nextInt();
			int cou = 0;
			int[] a = new int[n];

			for (int i = 2; i < n; i++)
				a[i] = 0;

			for (int i = 2; i < n; i++) {
				if (a[i] == 1)
					;
				else {
					cou++;
					for (int j = i + i; j < n; j += i)
						a[j] = 1;
				}
			}
			System.out.println(cou);
		}
	}
}