import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();
		String C = sc.next();
		String ans = "";

		if ( A.substring(A.length() -1).equals(B.substring(0,1)) &&  B.substring(B.length() -1).equals(C.substring(0,1))) {
			ans = "YES";
		} else {
			ans = "NO";
		}

		System.out.println( ans );
	}
}