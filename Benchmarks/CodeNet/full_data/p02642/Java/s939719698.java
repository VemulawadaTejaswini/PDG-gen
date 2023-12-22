import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			Prime prime = new Prime(1000000);
			int n = sc.nextInt();

			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				if (value == 1) {
					System.out.println(0);
					return;
				}
				list.add(value);
			}

			Collections.sort(list);
			Collections.reverse(list);

			int count = 0;
			for (int i = 0; i < n; i++) {
				if (prime.primes.contains(list.get(i))) {
					if ((0 < i && list.get(i) != list.get(i - 1)) && (i + 1 < n) && list.get(i) != list.get(i + 1)) {
						count++;
						continue;
					}
				}

				if (0 < i && list.get(i) == list.get(i - 1)) {
					continue;
				}

				boolean flag = true;
				for (int j = i + 1; j < n; j++) {

					if (list.get(i) % list.get(j) == 0) {
						flag = false;
						break;
					}
				}

				if (flag)
					count++;

			}

			System.out.println(count);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}

class Prime {
	public ArrayList<Integer> primes = new ArrayList<>();

	public Prime(long max) {
		primes.add(2);
		for (int i = 3; i <= max; i += 2) {
			if (isPrime(i))
				primes.add(i);
		}
	}

	public boolean isPrime(long value) {
		if (value <= 1) {
			return false;
		} else if (value == 2) {
			return true;
		}

		boolean flag = true;
		for (int i = 3; i * i <= value; i += 2) {
			if (value % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}
}