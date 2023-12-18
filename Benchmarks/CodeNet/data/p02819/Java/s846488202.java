import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long a = sc.nextLong();
			if (a <= 2) {
				System.out.println(2);
				return;
			}

			List<Integer> primeList = new ArrayList<>();
			primeList.add(2);

			for (int i = 3; i < 110000; i++) {
				boolean isPrime = true;
				for (int prime : primeList) {
					if (i % prime == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					if (a <= i) {
						System.out.println(i);
						break;
					}
					primeList.add(i);
				}
			}
		}
	}
}
