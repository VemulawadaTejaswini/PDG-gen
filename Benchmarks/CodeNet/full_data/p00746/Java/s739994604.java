import java.util.Scanner;

public class Main {
	Scanner sc;
	final int LEFT  = 0;
	final int DOWN  = 1;
	final int RIGHT = 2;
	final int UP    = 3;

	private Main(){
		sc = new Scanner( System.in );
	}
	private void run(){
		while( true ){
			int n = sc.nextInt();
			if( n == 0 ){ break; }
			Position[] pos = new Position[ n ];
			pos[ 0 ] = new Position( 0, 0 );
			for( int i = 1; i < n; i++ ){
				int base = sc.nextInt();
				int dir = sc.nextInt();
				switch( dir ){
				case LEFT:
					pos[ i ] = new Position( pos[ base ].x - 1, pos[ base ].y );
					break;
				case DOWN:
					pos[ i ] = new Position( pos[ base ].x, pos[ base ].y + 1 );
					break;
				case RIGHT:
					pos[ i ] = new Position( pos[ base ].x + 1, pos[ base ].y );
					break;
				case UP:
					pos[ i ] = new Position( pos[ base ].x, pos[ base ].y - 1 );
					break;
				}
			}
			int minXIndex = 0;
			int minYIndex = 0;
			int maxXIndex = 0;
			int maxYIndex = 0;
			for( int i = 1; i < n; i++ ){
				if( pos[ i ].x < pos[ minXIndex ].x ){
					minXIndex = i;
				}
				if( pos[ i ].x > pos[ maxXIndex ].x ){
					maxXIndex = i;
				}
				if( pos[ i ].y < pos[ minYIndex ].y ){
					minYIndex = i;
				}
				if( pos[ i ].y > pos[ maxYIndex ].y ){
					maxYIndex = i;
				}
			}
			System.out.println( ( pos[ maxXIndex ].x - pos[ minXIndex ].x + 1 ) + " " + ( pos[ maxYIndex ].y - pos[ minYIndex ].y + 1) );
		}

	}

	public static void main( String[] args ){
		new Main().run();
	}
}

class Position{
	int x, y;
	Position( int x, int y ){
		this.x = x;
		this.y = y;
	}
}