import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n];

		int allmonsters = 0;
		for ( int i = 0; i < a.length; i++ ) {
			a[i] = in.nextInt();
			allmonsters += a[i];
		}

		for ( int i = 0; i < b.length; i++ ) {
			b[i] = in.nextInt();
		}

		for ( int i = 0; i < n; i++ ) {
			// モンスタの方が多いor同数の場合
			if ( a[i] >= b[i] ) {
				a[i] -= b[i];
				b[i] = 0;
			} else {
				b[i] -= a[i];
				a[i] = 0;
				// 次の町にも手を出す
				if ( a[i + 1] >= b[i] ) {
					a[i + 1] -= b[i];
					b[i] = 0;
				} else {
					b[i] -= a[i + 1];
					a[i + 1] = 0;
				}
			}
		}

		for ( int i = 0; i < a.length; i++ ) {
			allmonsters -= a[i];
		}

		System.out.println(allmonsters);
		in.close();
	}
}