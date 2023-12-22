import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class Main {
	
	private HashMap<String, Pair> thisM, thatM;
	private class Pair {
		public int a, b;
		public Pair( int a, int b ) {
			this.a = a;
			this.b = b;
		}
	}
	private Scanner sc;
	private void init() {
		thisM = new HashMap<String, Pair> ();
		thatM = new HashMap<String, Pair> ();
		
		for( int a = 0; a < 26; a++ ) {
			if( a % 2 == 0 || a % 13 == 0 ){ continue; }
			for( int b = 0; b < 26; b++ ) {
				String thisT = "", thatT = "";
				Pair p = new Pair( a, b );
				for( int i = 0; i < 4; i++ ) {
					thisT += (char)( 'a' + ( ( "this".charAt(i) - 'a' ) * a + b ) % 26 ) + "";
					thatT += (char)( 'a' + ( ( "that".charAt(i) - 'a' ) * a + b ) % 26 ) + "";
				}
				thisM.put( thisT, p );
				thatM.put( thatT, p );
			}
		}
		
	}
	private void run() {
		init();
		sc = new Scanner( System.in );
		int n = sc.nextInt();
		sc.nextLine(); // pass \n
		
		for( int i = 0; i < n; i++ ) { //<dataset>
			String line = sc.nextLine();
			String[] words = line.split(" ");
			ArrayList<String> fourLengthWords = new ArrayList<String>();
			for( int j = 0; j < words.length; j++ ) {
				if( words[ j ].length() == 4 ) {
					fourLengthWords.add( words[ j ] );
				}
			}

			// 途中まで aとbを求めたら, 復号
			for( String str : fourLengthWords ) {
				Pair p1 = thisM.get( str );
				Pair p2 = thatM.get( str );
				if( p1 != null ) {
					System.out.println( decode( line, p1 ) );
				} else if( p2 != null ) {
					System.out.println( decode( line, p2 ) );
				}
				
			}
			
		} // </dataset> 
	}
	
	private String decode( String line, Pair p ) {
		char[] cstr = line.toCharArray();
		String dest ="";
		for( int i = 0; i < cstr.length; i++ ) {
			if( cstr[ i ] == ' ' ) {
				dest += " ";
				continue;
			}
			for( int j = 0; ; j++ ) {
				int dist = 26 * j - p.b;
				if( ( cstr[ i ] - 'a' + dist ) % p.a == 0 )  {
					dest += (char)( ( cstr[ i ] - 'a' + dist ) / p.a % 26 + 'a' ) + "";
					break;
				}
			}
		}
		return dest;
	}
	
	public static void main( String[] args ) {
		new Main().run();
	}
}