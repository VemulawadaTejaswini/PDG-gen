import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		System.out.println(Math.min(a, b) + " " + Math.max(0, (a + b) - n));
	}
}