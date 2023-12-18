import java.util.* ;

public class Main {
	
	public static void main( String[] args ) {
		Scanner sc			= new Scanner( System.in ) ;
		int		N			= sc.nextInt();
		int		M			= sc.nextInt();
		int		field[][]	= new int[M][3];

		for( int q = 0; q < M; q++ ) {
			for( int p = 0; p < 3; p++ ) {
				field[q][p] = sc.nextInt() ;
			}
		}

		int		matrix[][]		= new int[N][N] ;
		for( int q = 0; q < N; q++ ) {
			for( int p = 0; p < N; p++ ) {
				matrix[q][p] = 0 ;
			}
		}
		
		for(int data = 0; data < M; data++) {
			matrix[field[data][0]-1][field[data][1]-1] = - field[data][2] ;
			matrix[field[data][1]-1][field[data][0]-1] =   field[data][2] ;
		}
		
		int max = 0 ;
		for( int q = 0; q < N; q++ ) {
			for( int p = 0; p < N; p++ ) {
				for( int index = 0; index < N; index++ ) {
					//System.out.println( matrix[q][index] + " + " + matrix[index][p] + " = " + matrix[q][p] ) ;
					if( matrix[q][index] + matrix[index][p] != matrix[q][p] ) {
						System.out.println("No") ;
						return ;
					}
					if( matrix[q][p] > max ) {
						max = matrix[q][p] ;
					}
				}
			}
		}
		
		if( max > 1_000_000_000 ) {
			System.out.println("No") ;
			return ;
		}
		
		System.out.println("Yes") ;
	}
}
