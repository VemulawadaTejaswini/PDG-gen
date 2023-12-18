import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.next();
		b = sc.next();


		if(a.length() == b.length()) {
			if(a.compareTo(b) > 0) System.out.println("GREATER");
			else if(a.compareTo(b) < 0) System.out.println("LESS");
			else System.out.println("EQUAL");
		} else {
			System.out.print(a.length() > b.length() ? "GREATER" : "LESS");
		}
	}
}