import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Main {
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in ) ;
		String line = sc.nextLine();
		Pattern ptn = Pattern.compile( "^([0-9]+)\\s([0-9]+)\\s([0-9]+)\\s([0-9]+)\\s([0-9]+)$" ) ;
		Matcher mch = ptn.matcher( line );
		if ( mch.find() == true ) {
			int w = Integer.parseInt( mch.group(1) ) ;
			int h = Integer.parseInt( mch.group(2) ) ;
			int x = Integer.parseInt( mch.group(3) ) ;
			int y = Integer.parseInt( mch.group(4) ) ;
			int r = Integer.parseInt( mch.group(5) ) ;
			if ( x > r && y > r && (h-y) > r && (w-x) > r ) {
				System.out.println( "Yes" ) ;
			} else {
				System.out.println( "No" ) ;
			}
		}
	}
}