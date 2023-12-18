
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int k;
		int ans = 0;

		k = sc.nextInt();
		if (k % 2 == 0) {
			ans = (k / 2) * (k / 2);
		} else {
			ans = ((k + 1) / 2) * (k / 2);
		}

		System.out.println(ans);
		sc.close();
	}
}
