import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int alice = 0, bob = 0;

		Arrays.sort(a, Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			alice += a[i];
			i++;
			if (i == n) {
				break;
			}
			bob += a[i];
		}

		System.out.println(alice - bob);
	}
}