import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int mojiSum[] = new int[n];
		char c[] = new char[10];
		for (int i = 0; i < n; i++) {
			c = sc.next().toCharArray();
			for (int j = 0; j < 10; j++) {
				mojiSum[i] += (int) c[j];
			}
		}

		Arrays.sort(mojiSum);
		int ans = 0;
		int j = 1;
		for (int i = 0; i < n - 1; i++) {
			if (mojiSum[i] == mojiSum[i + 1]) {
				ans += j++;
			} else {
				j = 1;
			}
		}

		System.out.println(ans);
	}
}
