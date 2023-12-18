import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char[] s = in.next().toCharArray();

		int idx = 0;
		while ( idx < s.length ) {
			// Rの個数をカウント
			int cntR = 0;
			while ( idx < s.length && s[idx] == 'R' ) {
				cntR++;
				idx++;
			}

			// Rの連続がLに移行したポイントを記録
			int changePoint = cntR;

			// Lの個数をカウント
			int cntL = 0;
			while ( idx < s.length && s[idx] == 'L' ) {
				cntL++;
				idx++;
			}

			// 表示
			if ( (cntR + cntL) % 2 == 0 ) {
				for ( int i = 0; i < cntR + cntL; i++ ) {
					if ( i == changePoint - 1 || i == changePoint ) {
						System.out.print((cntR + cntL) / 2 + " ");
					} else {
						System.out.print(0 + " ");
					}
				}
			} else {
				for ( int i = 0; i < cntR + cntL; i++ ) {
					if ( i != changePoint - 1 && i != changePoint ) {
						System.out.print(0 + " ");

					} else
					// 切り替わりのR	
					if ( i != changePoint - 1 ) {

						if ( (changePoint - 1) % 2 == (cntR + cntL) % 2 ) {
							System.out.print(((cntR + cntL) / 2 + 1) + " ");
						} else {
							System.out.print((cntR + cntL) / 2 + " ");
						}
					} else
					// 切り替わりのL	
					if ( i != changePoint ) {

						if ( (changePoint) % 2 == (cntR + cntL) % 2 ) {
							System.out.print(((cntR + cntL) / 2 + 1) + " ");
						} else {
							System.out.print((cntR + cntL) / 2 + " ");
						}
					}
				}
			}
		}
		in.close();
	}
}