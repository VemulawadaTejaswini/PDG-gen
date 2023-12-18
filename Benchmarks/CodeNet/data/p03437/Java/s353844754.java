import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long X = scan.nextLong() ;
		long Y = scan.nextLong() ;

		if ( X % Y == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(X);

	}
}