import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println(n*(int)Math.pow(100, d));
	}
}
