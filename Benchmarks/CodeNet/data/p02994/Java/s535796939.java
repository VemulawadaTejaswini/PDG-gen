
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int l = sc.nextInt();
			int result = 0;

			if(0 <= l) {
				for (int i = 1; i < n; i++) {
					result += l + i;
				}
			} else {
				if (0 <= n + l) {
					for (int i = 0; i < n; i++) {
						result += l + i;
					}
				} else {
					for (int i = 0; i < n - 1; i++) {
						result += l + i;
					}
				}
			}

			System.out.println(result);
		}
	}
}
