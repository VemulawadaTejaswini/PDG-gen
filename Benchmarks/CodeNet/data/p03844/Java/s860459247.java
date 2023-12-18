import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = sc.next();
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(op.equals("+")) {
			System.out.println(A+B);
		}
		else {
			System.out.println(A-B);
		}
	}
}
