import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		int a[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			a[i] = in.nextInt();
		}
		in.close();

		int amin = a[0];
		int amax = a[n - 1];
		int len = amin + amax;

		char ptrn[] = new char[len];
		Arrays.fill(ptrn, 's');
		for ( int pi = amin; pi < len; pi++ ) {
			for ( int ai = 0; ai < n; ai++ ) {
				if ( 0 <= pi - a[ai] && pi - a[ai] < amin ) {
					ptrn[pi] = 'f';
					break;
				}
			}
		}

		if ( ptrn[k % len] == 'f' ) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}
	}
}