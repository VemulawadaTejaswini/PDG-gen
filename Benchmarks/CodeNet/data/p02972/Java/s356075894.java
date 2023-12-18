import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int a[] = new int[n+1];
		for ( int i = 1; i <= n; i++ ) {
			a[i] = in.nextInt();
		}
		
		int box[] = new int[n+1];
		int cnt = 0;

		// 自分の倍数がない場合を埋める
		int n_per2 = (n+1) / 2;
		for ( int b = n; n_per2 < b; b-- ) {
			box[b] = a[b];
			if ( a[b] == 1 ) cnt++;
		}
		
		for ( int b = n_per2; 0 < b; b-- ) {

			// 振り返りチェック
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
		for ( int i : box ) {
			if(i == 1) System.out.print(i + " ");
		}

		in.close();
	}

//	// 2進数で見た時、xビットごとに1が現れ他は0になるような数を返す
//	private static int makeBitPtr(int x, int n) {
//		int ptr = 0;
//		int bit = 1 << (x - 1);
//		int lim = 1 << (n - 1);
//
//		while ( lim >= bit ) {
//			ptr += bit;
//			bit = bit << x;
//
//			System.out.println(ptr);
//		}
//		return ptr;
//	}
}
