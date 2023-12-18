import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		if (A.compareTo(B) > 0) {
			System.out.println("GREATER");
		} else if (A.compareTo(B) < 0) {
			System.out.println("LESS");
		} else {
			System.out.println("EQUAL");
		}
		sc.close();
	}
}