import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = 1;
		do {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
			} else {
				while (true) {
					if (x % 10 == 3) {
						System.out.print(" " + i);
						break;
					} else {
						x /= 10;
						if (x != 0) {
							continue;
						} else {
							break;
						}
					}
				}
			}
		} while (++i <= n);
		System.out.println("");
	}
}