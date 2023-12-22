import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		try (Scanner scanner = new Scanner(System.in)) {
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
		}

		if(a>=0&&c<=100) {
			if(a<b&&b<c) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}