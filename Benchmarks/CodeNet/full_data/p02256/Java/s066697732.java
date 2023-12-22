import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		int a = y;

		while((a = x % a) != 0) {
			x = y;
			y = a;
		}

		System.out.println(y);

	}

}

