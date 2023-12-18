import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();

		HashSet<Long> answers = new HashSet<Long>();
		List<Long> list1 = getDivisors(n);
		list1.remove(0);
		for (long k : list1) {
			long n2 = n;
			while ((n2 % k) == 0 && n2 > 1) {
				n2 /= k;
			}
			if (n2 == 1 || n2 % k == 1) {
				answers.add(k);
			}
		}

		List<Long> list2 = getDivisors(n - 1);
		list2.remove(0);
		for (long k : list2) {
			answers.add(k);
		}

		System.out.print(answers.size());
	}

	public static List<Long> getDivisors(long number) {
		List<Long> list1 = new ArrayList<Long>();
		for (long i = 1; i < (long) Math.sqrt(number) + 1; i++) {
			if (number % i == 0) {
				list1.add(i);
			}
		}

		List<Long> list2 = new ArrayList<Long>();
		for (long i : list1) {
			long divisor = number / i;
			if (divisor != i) {
				list2.add(divisor);
			}
		}

		Collections.reverse(list2);
		list1.addAll(list2);
		return list1;
	}
}