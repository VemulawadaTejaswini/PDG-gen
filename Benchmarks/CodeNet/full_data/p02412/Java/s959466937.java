import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, count, num;
		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			// conditions to terminate
			if (n == 0 && x == 0) {
				break;
			}
			// count
			count = 0;
			for (i = 1; i <= n; ++i) {
				for (int j = i + 1; j <= n; ++j) {
					for (int k = j + 1; k <= n; ++k) {
						num = i + j + k;
						if (num == x) {
							++count;
						}
					}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}

