import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		while(scanner.hasNext()) {
			if (a == 0 && b == 0) {
				System.out.println(1);
			} else {
				System.out.println((int)Math.floor(Math.log10(a + b)) + 1);
			}
			a = scanner.nextInt();
			b = scanner.nextInt();
		}
	}
}