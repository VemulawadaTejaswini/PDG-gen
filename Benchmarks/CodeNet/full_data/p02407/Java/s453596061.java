
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main( String[] args ) {
		try {
			BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
			String tmp = br.readLine();
			int numbersSize = Integer.parseInt(tmp);

			tmp = br.readLine();
			String[] plainNumber = tmp.split(" ");
//			int[] Numbers = new int[plainNumber.length];
//
//			for( int i = 0; i < plainNumber.length; i++ ) {
//				Numbers[i] = Integer.parseInt(plainNumber[i]);
//			}

			//n???????????????????????£??????????????¨?????????

			String result;

			if( numbersSize <= 100 ) {
				result = plainNumber[plainNumber.length - 1] + " ";
				for(int i = ( plainNumber.length - 2 ); i > 0; i--) {
//					System.out.print( plainNumber[i] + " ");
					result = result + plainNumber[i] + " ";
				}
//				System.out.println( plainNumber[0] );
				result = result + plainNumber[0];
				System.out.println(result);
			}

		} catch( IOException e ) {
			e.printStackTrace();
		}
	}
}