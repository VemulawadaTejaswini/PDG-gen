import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		if (a.matches("[a-z]")) {
			System.out.println("a");
		}else {
			System.out.println("A");
		}
	}

}
