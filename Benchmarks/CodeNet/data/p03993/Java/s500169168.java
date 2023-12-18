import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] array = new int[num];
		int count = 0;
		for (int i = 1; i < num + 1; i++) {
			if (scanner.hasNextInt()) {
				int a = scanner.nextInt();
				array[i - 1] = a;
				if (i > a) {
					if (array[a - 1] == i) count++;
				}
			}
		}
		scanner.close();
		for (int i = 0; i < num; i++) {
			System.out.print(array[i]);
		}
		System.out.println(count);
	}
}
