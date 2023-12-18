import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		if ( n % 2 == 1 ) {
			System.out.println("No");
			in.close();
			return;
		}

		String s = in.next();
		String half1 = s.substring(0, n / 2);
		String half2 = s.substring(n / 2);
		
		System.out.println( half1.equals(half2) ? "Yes" : "No");

		in.close();
	}
}