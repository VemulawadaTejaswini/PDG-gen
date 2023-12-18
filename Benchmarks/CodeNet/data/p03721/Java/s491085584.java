import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		int sum = 0;
		int i = 0, j = 0;
		int temp = 0;
		long[] ans = new long[100001];
		int n = 0, k = 0;
		n = sc.nextInt();
		k = sc.nextInt();

		for (i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			ans[a] += b;
		}
		for (i = 1; i < 100001; i++) {
			if (k <= ans[i]) {
				System.out.println(i);
				break;
			}
			k -= ans[i];
		}

	}

}
