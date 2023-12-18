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
		for ( int i1 = 0; i1 < len; i1++ ) {
			if ( i1 < amin ) {
				ptrn[i1] = 's';

			} else {
				boolean getF = false;
				for ( int i2 = 0; i2 < n; i2++ ) {
					if ( i1 - a[i2] >= 0 && ptrn[i1 - a[i2]] == 's' ) {
						ptrn[i1] = 'f';
						getF = true;
						break;
					}
				}
				if ( !getF ) ptrn[i1] = 's';
			}
		}

		for ( char c : ptrn ) {
			System.out.print(c);
		}
		System.out.println();

		int idx = k % len;
		if ( ptrn[idx] == 'f' ) {
			System.out.println("First");
		} else {
			System.out.println("Second");
		}

	}
}