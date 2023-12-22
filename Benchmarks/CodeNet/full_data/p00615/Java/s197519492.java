import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main( String[] args ){
		Scanner sc = new Scanner( System.in );
		while( true ){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if( n == 0 && m == 0){ break;}
			int[] tl = new int[ n + m ];
			for( int i = 0; i < n; i++ ){
				tl[ i ] = sc.nextInt();
			}
			for( int i = n; i < n + m; i++ ){
				tl[ i ] = sc.nextInt();
			}
			Arrays.sort( tl );

			int max = 0;
			for( int i = 0; i < tl.length; i++ ){
				int temp = ( i == 0 ) ?  tl[ i ] - 0 : tl[ i ] - tl[ i - 1 ];
				if( max < temp ){ max = temp; }
			}
			System.out.println( max );
		}
	}
}