import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String b = sc.next();

		if (b == "A") {
			System.out.print("T");
		} else if (b == "T") {
			System.out.print("A");
		} else if (b == "C") {
			System.out.print("G");
		} else {
			System.out.print("C");
		}
	}
}