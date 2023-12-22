
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 3; i <= a; i++) {
			if (i % 3 == 0 || String.valueOf(i).contains("3"))
				System.out.print(" " + i);
		}
		System.out.println();
	}
}