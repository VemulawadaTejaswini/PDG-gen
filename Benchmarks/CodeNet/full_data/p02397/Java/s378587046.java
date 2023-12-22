import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
	public static void main( String[] args ) {
		int[] intAry = new int[2];
		Scanner sc = new Scanner( System.in ) ;
		String s = sc.nextLine() ;
		scanInt( s, intAry ) ;
		while( intAry[0] != 0 || intAry[1] != 0 ) {
			if ( intAry[0] > intAry[1] ) {
				System.out.println( intAry[1] + " " + intAry[0] ) ;
			} else {
				System.out.println( intAry[0] + " " + intAry[1] ) ;
			}
			s = sc.nextLine();
			scanInt( s, intAry ) ;
		}
	}
	public static void scanInt( String str, int[] intAry ) {
		Pattern ptn = Pattern.compile( "([0-9]+)\\s+([0-9]+)");
		Matcher mch = ptn.matcher( str ) ;
		if ( mch.find() == true ) {
			intAry[0] = Integer.parseInt( mch.group(1) ) ;
			intAry[1] = Integer.parseInt( mch.group(2) ) ;
		}
	}
}