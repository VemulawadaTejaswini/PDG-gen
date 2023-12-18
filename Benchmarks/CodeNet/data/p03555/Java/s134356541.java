import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String C11 = sc.next();
		String C22 = sc.next();
		String ans = " ";

		if ( C11.charAt(0) == C22.charAt(2) && C11.charAt(1) == C22.charAt(1) && C11.charAt(2) == C22.charAt(0)) {
			ans = "Yes";
		} else {
			ans = "No";
		}

		System.out.println( ans );
	}
}