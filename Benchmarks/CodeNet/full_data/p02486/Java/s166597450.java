import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int count = 0;
			if (n == 0 && x == 0)
				break;
			for (int i = 1; i < n + 1; i++) {
				int a = x - i;
				if (a <= 0) {
					break;
				}
				for (int j = i + 1; j < n + 1; j++) {
					int b = a - j;
					if (b <= 0) {
						break;
					}
					for (int k = j + 1; k < n + 1; k++) {
						int c = b - k;
						if (c == 0)
							count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}