import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		String op = scan.next();
		int n2 = scan.nextInt();

		if(op.equals("+")) {
			System.out.println(n1 + n2);
		} else {
			System.out.println(n1 - n2);
		}
	}
}
