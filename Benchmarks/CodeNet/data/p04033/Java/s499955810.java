
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		String ans = "Negative";

		if (a < 0 && b < 0) {
			if ((b - a + 1) % 2 == 0) {
				ans = "Positive";
			}
		} else if (a <= 0 && b >= 0) {
			ans = "Zero";
		} else {
			ans = "Positive";
		}

		System.out.println(ans);
	}

}
