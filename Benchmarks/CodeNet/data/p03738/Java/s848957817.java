import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.next();
		b = sc.next();

		if(a.length() != b.length()) {
			if(a.length() > b.length()) System.out.print("GREATER");
			else System.out.print("LESS");
			return;
		} else {
			for (int i = 0; i < a.length(); i++) {
				if(a.charAt(i) > b.charAt(i)) {
					System.out.print("GREATER");
					return;
				} else if(a.charAt(i) < b.charAt(i)) {
					System.out.print("LESS");
					return;
				}
			}
		}

		System.out.print("EQUAL");
	}
}