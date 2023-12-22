import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int a, b, c;

		num = scanner.nextInt();
		for (int i = 0; i < num; i++){
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			if (((Math.abs(a*a - b*b) - c*c) == 0) || (Math.abs(a*a - c*c) - b*b) == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}