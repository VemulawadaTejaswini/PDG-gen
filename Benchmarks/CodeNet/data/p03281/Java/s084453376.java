import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int sum = 0;
		for (int i = 1; i <= n; i += 2) {
			if (enumDivisors(i).size() == 8) {
				sum++;
			}
		}
		System.out.println(sum);
		sc.close();
	}

	//約数列挙
	//約数列挙の処理は、計算量O(√N)
	static List<Long> enumDivisors(long n) {
		List<Long> list = new ArrayList<>();
		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
				if (n / i != i) {
					list.add(n / i);
				}
			}
		}
		Collections.sort(list);
		return list;
	}
}