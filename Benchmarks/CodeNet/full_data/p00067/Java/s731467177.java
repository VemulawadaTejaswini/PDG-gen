import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) {

	Scanner stdin = new Scanner(System.in);
	while ( stdin.hasNextLine() ) {
	    char[][] map = new char[12][];
	    for ( int i = 0; i < 12; i++ ) {
		map[i] = stdin.nextLine().toCharArray();
	    }

	    boolean[][] visited = new boolean[12][12];

	    int count = 0;
	    for ( int i = 0; i < 12; i++ ) {
		for ( int j = 0; j < 12; j++ ) {
		    if ( !visited[i][j] && map[i][j] == '1' ) {
			dfs( visited, i, j, map );
			count++;
		    }
		}
	    }
	    System.out.println( count );
	    if ( stdin.hasNextLine() ){
		stdin.nextLine();
	    }
	}
    }

    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, -1, 0, 1 };
	
    static void dfs( boolean[][] visited, int y, int x, char[][] map ) {
	visited[y][x] = true;
	for ( int i = 0; i < 4; i++ ) {
	    final int nx = x + dx[i];
	    final int ny = y + dy[i];

	    if ( 0 <= nx && nx < 12 && 0 <= ny && ny < 12 &&
		 !visited[ny][nx] && map[ny][nx] == '1') {

		dfs( visited, ny, nx, map );
	    }
	}	
    }
    
}