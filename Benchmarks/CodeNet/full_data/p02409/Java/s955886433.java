import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[][][] room = new int[4][3][10];
		int n = 0;
		int b = 0;
		int f = 0;
		int r = 0;
		int v = 0;

    	//初期化
    	for( int i = 0 ; i < room.length ; i++ ) {
    		for ( int j = 0 ; j <room[i].length ; j++ ) {
        		for ( int k = 0 ; k < room[i][j].length ; k++ ) {
        			room[i][j][k] = 0;
        		}
    		}

    	}

    	Scanner sc= new Scanner( System.in );
    	n = sc.nextInt();

    	for ( int i = 0 ; i < n ; i++ ) {
        	b = sc.nextInt();
        	f = sc.nextInt();
        	r = sc.nextInt();
        	v = sc.nextInt();

        	room[b-1][f-1][r-1] += v;

    	}

    	for ( int i = 0 ; i < room.length ; i++ ) {
    		for ( int j = 0 ; j <room[i].length ; j++ ) {
        		for ( int k = 0 ; k < room[i][j].length ; k++ ) {
    				System.out.print( " " + room[i][j][k] );
        		}
				System.out.print( "\n" );
    		}
    		if ( i != room.length-1 ) {
				System.out.println( "####################" );
    		}
    	}
    	sc.close();
	}
}
