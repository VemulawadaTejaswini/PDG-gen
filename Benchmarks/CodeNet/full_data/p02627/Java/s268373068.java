
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			if ('A' <= a.charAt(0) && a.charAt(0) <= 'Z') {
				System.out.println("A");
			} else {
				System.out.println("a");
			}
		}
	}
}
