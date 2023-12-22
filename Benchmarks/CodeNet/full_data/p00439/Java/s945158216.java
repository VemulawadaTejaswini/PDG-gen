import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			final int n = in.nextInt();
			final int k = in.nextInt();
			if (n == 0 && k == 0) {
				break;
			}
			int max = -10000, val = 0;
			Deque<Integer> deq = new ArrayDeque<Integer>(k);
			for (int i = 0; i < n; i++) {
				final int number = in.nextInt();
				if (i < k) {
					val += number;
				} else {
					final int f = deq.poll();
					val += (number - f);
				}
				deq.addLast(number);
				if (val > max) {
					max = val;
				}
			}
			System.out.println(max);
		}
	}
}