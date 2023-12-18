import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		ArrayList<Long> b = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			b.add(a[i]);
			Collections.reverse(b);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(b.get(i));
			System.out.print(" ");
		}
		System.out.println("");
	}
}
