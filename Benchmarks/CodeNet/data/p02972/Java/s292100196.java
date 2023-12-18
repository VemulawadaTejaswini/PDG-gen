package atcoder134;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] arr = new int[N + 1];
		boolean allZero = true;
		for (int i = 1; i <= N; i++) {
			int current = Integer.parseInt(sc.next());
			arr[i] = current;
			if (allZero) {
				allZero = current == 0;
			}
		}
		sc.close();
		if (allZero) {
			System.out.println(0);
			return;
		}
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = N; i > 0; i--) {
			int div = N / i;
			if (div == 1 && arr[i] == 1) {
				set.add(i);
				count++;
				continue;
			}
			boolean bl = false;
			for (int j = 2; j <= div; j++) {
				if (set.contains(j * i)) {
					bl = !bl;
				}
			}
			if (bl != (arr[i] == 1)) {
				set.add(i);
				count++;
			}
		}
		System.out.println(count);
		Iterator iterator = set.iterator();
		for (int i = 0; i < count; i++) {
			System.out.print(iterator.next() + " ");
		}
	}
}
