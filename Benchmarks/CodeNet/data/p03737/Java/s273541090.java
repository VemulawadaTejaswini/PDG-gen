import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s1 = scan.next();
		String s2 = scan.next();
		String s3 = scan.next();

		System.out.println(s1.substring(0, 1).toUpperCase() + s2.substring(0, 1).toUpperCase() + s3.substring(0, 1).toUpperCase());
 	}
}