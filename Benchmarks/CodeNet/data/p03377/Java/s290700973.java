import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int X = sc.nextInt();
		String ans = "";

		if ( A > X ) {
			ans = "No" ;
		} else if (A <= X ) {
			if ( X-A <= B) {
			ans = "Yes" ;
			} else if (B <X-A) {
				ans = "No" ;
			}
		}

		System.out.println( ans );
	}
}