

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();

		long count = 0;

		ArrayList<Long> deque = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			deque.add(scan.nextLong());
		}

		Collections.sort(deque);

		for (int i = 0; i < k; i++) {
			deque.remove(deque.size() - 1);
		}

		for (long i : deque) {
			count += i;
		}

		System.out.println(count);
	}

}
