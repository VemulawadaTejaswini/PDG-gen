import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		int count = 0;
		if (1 <= a && a <= 10000 && 1 <= b && b <= 10000 && 1 <= c && c <= 10000) {
			if (a <= b) {
				for (int i = a; i <= b; i++) {
					if (c % i == 0) {
						count++;
					}

				}
			}
		}
		System.out.println(count);

	}

}