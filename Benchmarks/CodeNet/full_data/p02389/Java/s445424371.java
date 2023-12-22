import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int a = x * y;
		int b = x * 2 + y * 2;
		String c = a + " " + b;

		System.out.println(c);
	}
}