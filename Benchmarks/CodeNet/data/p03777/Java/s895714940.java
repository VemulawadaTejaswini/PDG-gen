import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		if (a == "H") {
			if (b == "H") {
				System.out.println("H");				
			}
			if (b == "D") {
				System.out.println("D");				
			}
		}
		if (a == "D") {
			if (b == "H") {
				System.out.println("D");				
			}
			if (b == "D") {
				System.out.println("H");				
			}
		}
	}
}
