import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int X = Integer.parseInt(tokens[1]);
		List<Integer> points = new ArrayList<>();
		points.add(X);
		tokens = in.nextLine().split(" ");
		for (int i = 0; i < N; ++i) {
			points.add(Integer.parseInt(tokens[i]));
		}
		Collections.sort(points);
		Queue<Integer> queue = new PriorityQueue<Integer>(N + 1, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				} else if (o1 < o2) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		for (int i = 1; i < points.size(); ++i) {
			queue.add(points.get(i) - points.get(i - 1));
		}

		while (true) {
			if (queue.size() == 1) {
				break;
			}
			Integer a = queue.poll();
			Integer b = queue.poll();
			if (a == b) {
				queue.add(a);
			} else {
				queue.add(gcd(a, b));
			}
		}
		System.out.println(queue.poll());

		in.close();
	}

	private static int gcd(int large, int small) {
		if (small > large) {
			return gcd(small, large);
		}
		if (small == large) {
			return small;
		}
		return gcd(small, large - small);
	}

}