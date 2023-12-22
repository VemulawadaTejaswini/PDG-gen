import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner scanner = new Scanner( System.in );

		ArrayList<Integer> nums = new ArrayList<Integer>();

		while ( true ) {
			String inputText = scanner.nextLine();


			int x = Integer.parseInt( inputText );
			if ( x == 0) {
				break;
			}
			nums.add( x );
		}

		for ( int i = 0; i < nums.size(); i++ ) {
			System.out.println("Case " + (i + 1) + ": " + nums.get( i ) );
		}

		scanner.close();
	}
}