package aoj00xx;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	private int caseCounter;
	private int maxW, n;
	private int[] p, w;
	private int[][] opt;
	private static final int WMAX = 10000 + 1;
	private static final int NMAX = 1000 + 1;
	private Main(){
		sc = new Scanner( System.in );
		p = new int[ NMAX ];
		w = new int[ NMAX ];
		opt = new int [WMAX][NMAX];
		caseCounter = 1;
	}

	private void dp(){

		// basis
		for( int j = 0; j <= maxW; j++ ){
			opt[ 0 ][ j ] = 0;
		}

		for( int i = 1; i <= n; i++ ){
			for( int j = 0; j <= maxW; j++ ){

				if( j < w[ i - 1 ] ){ // 重さが足りなければ無理.
					opt[ i ][ j ] = opt[ i - 1 ][ j ];
				}else if( opt[ i - 1 ][ j  - w[ i - 1 ] ] + p[ i - 1 ]  > opt[ i - 1 ][ j ]){
					opt[ i ][ j ] = opt[ i - 1 ][ j - w[ i - 1 ] ] + p[ i - 1 ]; // selected
				}else{
					opt[ i ][ j ] = opt[ i ][ j - 1 ]; // 選ばない方がいい場合
				}
			}
		}
/*
		// 仮設DP表 -> 標準エラー
		for( int i = 0; i <= n; i++ ){
			for( int j = 0; j <= maxW; j++ ){
				System.err.printf( "%4d", opt[ i ][ j ] );
			}
			System.err.println();
		}
*/
	}

	private void run(){
		while( true ){
			maxW = sc.nextInt();
			if( maxW == 0 ){ return; }
			n = sc.nextInt();
			for( int i = 0; i < n; i++ ){
				String[] spw = sc.next().split( "," );
				p[ i ] = Integer.parseInt( spw[ 0 ] );
				w[ i ] = Integer.parseInt( spw[ 1 ] );
			}
			dp();

			// 出力
			int i = n;
			int j = maxW;
			int sumP = 0;
			int sumW = 0;
			while( i > 0 ){
				if( opt[ i ][ j ] > opt[ i - 1 ][ j ] ){
					sumP += p[ i - 1 ];
					sumW += w[ i - 1 ];
					j -= w[ i - 1 ];
				}
				i--;
			}
			System.out.println( "Case " + caseCounter + ":" );
			System.out.println( sumP );
			System.out.println( sumW );

			caseCounter++;
		}
	}

	public static void main( String[] args ){
		new Main().run();
	}
}