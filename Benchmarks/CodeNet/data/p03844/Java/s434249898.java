import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String s = scan.next();
		int b = scan.nextInt();
		char c = s.charAt(0);
		if (c == '+') {
			System.out.println(a+b);
		}
		else
		System.out.println(a-b);
	}
}
