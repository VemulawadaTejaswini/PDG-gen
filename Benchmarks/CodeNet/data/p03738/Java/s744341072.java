import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a, b;
		a = sc.next();
		b = sc.next();

		if(a.length() != b.length()) {
			if(a.length() > b.length()) {
				System.out.print("GREATER");
				return;
			}
			else {
				System.out.print("LESS");
				return;
			}
		} else {
			if(a.compareTo(b) == 1) {
				System.out.print("GREATER");
				return;
			}
			else if(a.compareTo(b) == -1){
				System.out.print("LESS");
				return;
			}
		}

		System.out.print("EQUAL");
	}
}