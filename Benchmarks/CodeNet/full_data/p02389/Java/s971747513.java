import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Main {
	public static void main( String[] args ) {
		Scanner sc = new Scanner( System.in ) ;
		String line = sc.nextLine();
		Pattern ptn = Pattern.compile( "^([0-9]+)\\s([0-9]+)$" ) ;
		Matcher mch = ptn.matcher( line );
		if ( mch.find() == true ) {
			int i = Integer.parseInt( mch.group(1) ) ;
			int j = Integer.parseInt( mch.group(2) ) ;
			System.out.println( i*j + " " + (2*i + 2*j) ) ;
		}
	}
}