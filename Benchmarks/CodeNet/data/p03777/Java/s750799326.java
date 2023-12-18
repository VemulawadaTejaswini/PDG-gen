import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next();
		char b = sc.next();
		if (a == 'H') {
			if (b == 'H') {
				System.out.println("H");
			} else {
				System.out.println("D");
			}
		} else {
			if (b == 'H') {
				System.out.println("D");
			} else {
				System.out.println("H");
			}
		}
	}
}