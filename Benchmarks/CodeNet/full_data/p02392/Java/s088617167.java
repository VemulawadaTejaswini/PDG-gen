
import java.util.Scanner;

public class Main {

	static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		while(a < 0 || a > 100);
		while(b < 0 || b > 100);
		while(c < 0 || c > 100);
		if(a < b && b < c) {
			System.out.println("Yes");
		}else
			System.out.println("No");
		}
	}
}

