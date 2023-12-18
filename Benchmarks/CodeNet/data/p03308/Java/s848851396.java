import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Integer a[] = new Integer[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			Arrays.sort(a);
			System.out.println(a[n - 1] - a[0]);
		}

	}

}