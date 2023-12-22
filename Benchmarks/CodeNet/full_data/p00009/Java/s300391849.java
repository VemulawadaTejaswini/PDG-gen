import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();

			int c = 0;
			l1 : for (int i = 2; i <= n; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						continue l1;
					}
				}
				++c;
			}
			System.out.println(c);
		}
	}

}