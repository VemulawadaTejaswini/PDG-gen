import java.util.Scanner;

public class Q042 {

	public static void Main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] count = new int[11];
			count[scanner.nextInt()]++;
			count[scanner.nextInt()]++;
			count[scanner.nextInt()]++;

			if (count[5] == 2 && count[7] == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}