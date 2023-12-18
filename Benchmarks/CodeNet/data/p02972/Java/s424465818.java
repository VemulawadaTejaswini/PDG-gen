import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n + 1];
		for ( int i = 1; i <= n; i++ ) {
			a[i] = in.nextInt();
		}

		int box[] = new int[n + 1];
		int cnt = 0;

		// 自分の倍数がない場合を埋める
		int n_per2 = n / 2;
		for ( int b = n; n_per2 < b; b-- ) {
			box[b] = a[b];
			if ( a[b] == 1 ) cnt++;
		}

		// 倍数がある場合
		for ( int b = n_per2; 0 < b; b-- ) {

			// 振り返りチェックしつつ埋める
			int sum = 0;
			for ( int i = b; i <= n; i += b ) {
				sum += box[i];
			}
			if ( sum % 2 != a[b] ) {
				box[b] = 1;
				cnt++;
			}
		}

		System.out.println(cnt);
		for ( int i = 1; i <= n; i++ ) {
			if ( box[i] == 1 ) System.out.print(i + " ");
		}

		in.close();
	}
}