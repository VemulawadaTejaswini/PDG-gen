import java.util.Scanner;

public class Main {
	Scanner sc;
	private Main(){
		sc = new Scanner( System.in );
	}

	private void run(){
		while ( true ){
			int n = sc.nextInt();
			int p = sc.nextInt();
			int winner;
			if( n == 0 && p == 0 ){ break; }
			int[] player = new int[ n ];
			for( int i = 0; i < player.length; i++ ){
				player[ i ] = 0;
			}
			for( int i = 0; ; i = ( ++i ) % n ){
				if( p > 0 ){
					p--;
					player[ i ]++;
				}else if( player[ i ] > 0){
					boolean end = true;
					for( int j = 0; j < n; j++ ){
						if( j == i ){ continue; }
						if( player[ j ] != 0){
							end = false;
							break;
						}
					}
					if( end ){
						winner = i;
						break;
					}
					p += player[ i ];
					player[ i ] -= player[ i ];
				}
			}
			System.out.println( winner );
		}
	}

	public static void main( String[] args){
		new Main().run();
	}
}