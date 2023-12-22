import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if (k % 2 == 0) {
			System.out.println(-1);
			return;
		}
		int ans = 0;
		for (int i = 7; i <= 777777 / k; i = 10 * i + 7) {
			ans++;
			if (i % k == 0) {
				System.out.println(ans);
				return;
			}
		}
	}

}