import java.util.*;

public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int x1 = b / (a - 1);
			if (x1 * (a - 1) != b) {
				x1++;
			}
			System.out.println(x1);
		}
}