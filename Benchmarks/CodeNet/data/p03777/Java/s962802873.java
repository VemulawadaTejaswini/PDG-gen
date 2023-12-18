import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		if (a == "H") {
			System.out.println(b);
		}
		if (a == "D") {
			if (b == "D") {
				System.out.println("H");
			} else if (b == "H") {
				System.out.println("D");
			}
		}
	}
}