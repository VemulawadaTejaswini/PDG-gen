import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		if (num.contains("7")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
