import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();

		String ans = "" + s1.toUpperCase().charAt(0) + s2.toUpperCase().charAt(0) + s3.toUpperCase().charAt(0);
		System.out.println(ans);
	}

}