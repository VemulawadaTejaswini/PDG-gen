import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int N = sc.nextInt();
			if (N < 105) {
				System.out.print(0);
				return;
			}
			int sum = 1;
			for (int i = 107; i <= N; i += 2) {
				int yakusuu = 2;
				for (int j = 3; j < i; j += 2) {
					if (i % j == 0)
						yakusuu++;
					if (yakusuu > 8)
						break;
				}
				if (yakusuu == 8)
					sum++;
			}
			System.out.print(sum);
		}
	}
}
