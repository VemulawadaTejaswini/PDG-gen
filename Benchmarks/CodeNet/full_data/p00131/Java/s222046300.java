import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);

	final int T = Integer.parseInt( stdin.nextLine() );
	for ( int t = 0; t < T; t++ ) {

	    boolean[][] map = new boolean[10][10];
	    for ( int c = 0; c < 10; c++ ) {
		final String[] input = stdin.nextLine().split( " " );
		for ( int r = 0; r < 10; r++ ) {
		    map[c][r] = input[r].equals( "1" );
		}
	    }

	    boolean[][] answer = new boolean[10][10];

	    for ( int c = 0; c < 8; c++ ) {
		for ( int r = 0; r < 10; r++ ) {
		    if ( map[c][r] ) {
			put( map, c + 1, r );
			answer[c + 1][r] = true;
		    }
		}
	    }

	    for ( int c = 0; c < 10; c++ ) {
		System.out.print( map[c][0] ? 1 : 0 );
		for ( int r = 1; r < 10; r++ ) {
		    System.out.printf(" %d", ( answer[c][r] ? 1 : 0 ) );
		}
		System.out.println();
	    }	    
	}	
    }

    static int[] dx = { 0, 0, -1, 0, 1 };
    static int[] dy = { 0, 1, 0, -1, 0 };
    static void put( boolean[][] map, int y, int x ) {
	for ( int i = 0; i < 5; i++ ) {
	    final int nx = x + dx[i];
	    final int ny = y + dy[i];
	    if ( 0 <= nx && nx < map.length  &&
		 0 <= ny && ny < map[0].length ){
		
		map[ny][nx] = !map[ny][nx];
	    }
	}
    }

    static void printArray( boolean[][] array ) {
	for ( boolean[] ar : array ) {
	    System.out.println( Arrays.toString( ar ) );
	}	
    }	
}