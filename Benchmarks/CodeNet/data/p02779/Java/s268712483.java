import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] num = new int[n];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				if (num[i] == num[j]) {
					System.out.println("NO");
					cnt++;
					break;
				}
			}
		}
		if (cnt == 0) {
			System.out.println("YES");
		}
	}

}
