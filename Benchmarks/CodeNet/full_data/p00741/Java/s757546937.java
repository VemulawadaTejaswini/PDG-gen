import java.util.Scanner;

public class Main {
	Scanner sc;
	int[][] map;
	int width, height;

	private Main(){
		sc = new Scanner( System.in );
	}

	private void visit( int x, int y ){
		if( x < 0 || y < 0 || x >= width || y >= height || map[ x ][ y ] == 0){ return; }
		map[ x ][ y ] = 0;
		visit( x - 1, y - 1 );
		visit( x - 1, y     );
		visit( x - 1, y + 1 );
		visit( x    , y - 1 );
		visit( x    , y + 1 );
		visit( x + 1, y - 1 );
		visit( x + 1, y     );
		visit( x + 1, y + 1 );

	}

	private void run(){
		while( true ){
			width = sc.nextInt();
			height = sc.nextInt();
			int counter = 0;
			map = new int[ width ][ height ];
			if( width == 0 && height == 0){ break; }
			for( int y = 0; y < height; y++ ){
				for(int x = 0; x < width; x++ ){
					map[ x ][ y ] = sc.nextInt();
				}
			}

			for( int y = 0; y < height; y++ ){
				for( int x = 0; x < width; x++ ){
					if( map[ x ][ y ] == 1 ){
						counter++;
						visit( x, y );
					}
				}
			}
			System.out.println( counter );
		}
	}

	public static void main( String[] args ){
		new Main().run();
	}

}