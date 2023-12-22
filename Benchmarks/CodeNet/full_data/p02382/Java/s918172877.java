import java.util.Scanner;

public class Main {

	static double min_dst_p ( int[] x, int[] y, int n, int p ) {
		double min_dst = 0.0;
		double max_xy = 0.0;

		for ( int i = 0 ; i < n ; i++ ) {
			
			if( i == 0 ) {
				max_xy = Math.abs( x[i] - y[i] );
			} else  if ( Math.abs( x[i] - y[i] ) > max_xy ) {
				max_xy = Math.abs( x[i] - y[i] );
			}

			min_dst += Math.pow( Math.abs( x[i] - y[i] ), p );

		}

		if ( p == 2 ) {
			min_dst = Math.sqrt( min_dst );
		} else if ( p == 3 ) {
			min_dst = Math.cbrt( min_dst );
		} else if  (p == 4){
			min_dst = max_xy;
		}

		return min_dst;
	}

	public static void main(String[] args) {

		int[] vector_x;
		int[] vector_y;
		int vector_num = 0;
		double[] min_dst_p = new double[4];

		Scanner sc= new Scanner( System.in );

		vector_num = sc.nextInt();
		vector_x = new int[vector_num];
		vector_y = new int[vector_num];

		for ( int i = 0; i < vector_num ; i++ ) {
			vector_x[i] = sc.nextInt();
		}

		for ( int i = 0; i < vector_num ; i++ ) {
			vector_y[i] = sc.nextInt();
		}

		for  ( int i = 0; i < 4 ; i++ ) {
			min_dst_p[i] = min_dst_p( vector_x, vector_y, vector_num ,i+1 );
			System.out.println( min_dst_p[i] );
		}

		sc.close();
	}
}

