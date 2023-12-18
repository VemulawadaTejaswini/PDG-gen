import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		if (A % 2 == 1 && B % 2 == 1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scan.close();
	}
}
