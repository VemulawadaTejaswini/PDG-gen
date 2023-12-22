import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (stdIn.hasNextInt()) {
			int a = stdIn.nextInt();
			int b = a;
			int cou = 1;
			for (; 1 < a; a--) {
				a:for (int i = a - 1; 1 < i; i--) {
					if (a % i == 0) {
						cou++;
						break a;
					}
				}
			}
			System.out.println(b-cou);
		}
	}
}