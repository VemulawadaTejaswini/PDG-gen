
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] height = new long[n];
		for (int i = 0; i < n; i++) {
			height[i] = s.nextLong();
		}
		s.close();
		String judge = "Yes";
		for (int i = 1; i < n - 1; i++) {
			if (height[i - 1] - 1 > height[i]) {
				if (height[i] - 1 > height[i + 1]) {
					judge = "No";
					break;
				}
			}
		}
		System.out.println(judge);
	}

}
