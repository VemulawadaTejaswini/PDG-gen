import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		String S = sc.next();
		String str = S;
		
		String[] words = {
				"dream", 
				"dreamer", 
				"erase", 
				"eraser"
		};
		String T = "";
		
		while ( T.length() < S.length() ) {
			
			for ( String w: words ) {
				
				if ( str.endsWith(w) ) {
					T = w + T;
					str = str.substring(0, str.length() - w.length());
				}
			}
		}
		
		if ( str.length() == 0 ) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		sc.close();

	}

}