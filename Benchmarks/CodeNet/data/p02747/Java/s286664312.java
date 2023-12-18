import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		if ( S.length() <= 1 ) {
			System.out.println("No");
			return;
		}
		
		String ans = "Yes";
		for ( int i = 0 ; i < S.length() ; i++ ) {
			if ( i % 2 == 0 ) {
				if ( S.charAt(i) != 'h' ) {
					ans = "No";
					break;
				}
			} else {
				if ( S.charAt(i) != 'i' ) {
					ans = "No";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
