import java.util.Scanner;

public class Main {
	static boolean isFill(int[][] f) {
		for ( int i = 0; i < f.length; i++ ) {
			for( int j = 0; j < f[i].length; j++ ) {
				if ( f[i][j] == 0 ) return false;
			}
		}
		return true;
	}
	static void putAry( int[][] f ) {
		for ( int i = 0; i < f.length; i++ ) {
			for ( int j = 0; j < f[i].length; j++ )
				System.out.printf("%4d", f[i][j]);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( !sc.hasNext("0") ) {
			int n = sc.nextInt();
			int[][] field = new int[n][n];
			int y = (n/2)+1, x = n/2 , num = 1;
			field[y][x] = num++;
			x++; y++;
			while ( true ) {
				if ( y >= n ) y = 0;
				else if ( y < 0 ) y = n-1;
				if ( x >= n ) x = 0;
				else if ( x < 0 ) x = n-1;
				if ( field[y][x] != 0 ) {
					y++; x--;
				} else {
					field[y][x] = num++;
					if ( isFill(field) ) break;
					x++; y++;
				}
			}
			putAry(field);
		}
	}
}