
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0;
		int a = s.nextInt();
		int max = a;
		int min = a;
		for (i = 0; i < n - 1; i++) {
			int b = s.nextInt();
			if (b > max) {
				max = b;
			}
			if (b < min) {
				min = b;
			}

		}
		int ans = max - min;
		System.out.println(ans);
	}

}