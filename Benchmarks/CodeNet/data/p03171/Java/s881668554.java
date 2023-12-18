import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		// ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		int a[] = new int[n];
		for ( int i = 0; i < n; i++ ) {
			a[i] = in.nextInt();
			// q.add(in.nextInt());
		}

		//		for ( Integer i : q ) {
		//			System.out.println(i);
		//		}

		long X = 0, Y = 0;
		int l = 0, r = n - 1;
		for ( int i = 0; i < n; i++ ) {
			int get = 0;

			if ( r - l < 3 ) {
				if ( a[l] < a[r] ) {
					get = a[r];
					r--;
				} else {
					get = a[l];
					l++;
				}
			} else {
				int left = a[l] - a[l + 1];
				int right = a[r] - a[r - 1];

				if ( left < right ) {
					get = a[r];
					r--;
				} else {
					get = a[l];
					l++;
				}
			}

			if ( i % 2 == 0 ) {
				// System.out.println("X get " + get);
				X += get;
			} else {
				// System.out.println("Y get " + get);
				Y += get;
			}
		}
		// System.out.println("X:" + X + " Y:" + Y + " X-Y:" + (X - Y));
		System.out.println(X-Y);
		in.close();
	}
}
