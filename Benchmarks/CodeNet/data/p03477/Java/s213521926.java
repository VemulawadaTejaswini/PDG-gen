import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int L = A + B;
		int R = C + D ;

		String ans = "";

		if ( L < R ) {
			ans = "Right";
		} else if ( R < L ) {
			ans = "Left";
		} else {
			ans = "Balanced";
		}

		System.out.println( ans );
	}
}