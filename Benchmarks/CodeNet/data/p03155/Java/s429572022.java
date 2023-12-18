import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt(), h = sc.nextInt(), w = sc.nextInt();
		System.out.println((n - h + 1) * (n - w + 1));
	}
}