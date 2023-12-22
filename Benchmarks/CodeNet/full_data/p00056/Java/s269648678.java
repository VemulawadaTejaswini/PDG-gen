import java.util.Scanner;

public class Main {

	Scanner sc;
	int[] table = new int[ 50001 ];
	int[] prime = new int[ 50001 ];
	int pCounter = 0;

	private Main(){
		sc = new Scanner( System.in );
		table[ 1 ] = 1;
		for( int i = 2; i < table.length; i++ ){
			table[ i ] = 0;
		}
		for( int i = 2; i < table.length; i++ ){
			if( table[ i ] == 1 ){ continue; }
			prime[ pCounter++ ] = i;
			for( int j = i * 2; j < table.length; j += i){
				table[ j ] = 1;
			}
		}
	}

	private void run(){
		while( true ){
			int n = sc.nextInt();
			if( n == 0 ){ break; }
			int counter = 0;

			for( int i = 0; prime[ i ] <= n / 2; i++ ){
				int cN = n - prime[ i ];
				if( table[ cN ] == 0 ){ counter++; }
			}
			System.out.println( counter );
		}
	}
	public static void main( String[] args ){
		new Main().run();
	}
}