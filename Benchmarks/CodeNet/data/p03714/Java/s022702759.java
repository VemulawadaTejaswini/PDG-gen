import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class MyComparator implements Comparator<Long> {

	public int compare(Long obj1, Long obj2) {

		long num1 = (long) obj1;
		long num2 = (long) obj2;

		if (num1 < num2) {
			return 1;
		} else if (num1 > num2) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long left[] = new long[N];
		long center[] = new long[N];
		long right[] = new long[N];
		long suml[] = new long[N + 1];
		long sumr[] = new long[N + 1];
		Queue<Long> lqueue = new PriorityQueue<Long>(N + 1);
		Queue<Long> rqueue = new PriorityQueue<Long>(N + 1, new MyComparator());
		for (int i = 0; i < N; i++) {
			left[i] = sc.nextLong();
			lqueue.add(left[i]);
			suml[0] += left[i];
		}
		for (int i = 0; i < N; i++) {
			center[i] = sc.nextLong();
		}
		for (int i = 0; i < N; i++) {
			right[i] = sc.nextLong();
			rqueue.add(right[i]);
			sumr[N] += right[i];
		}

		long s = Long.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			lqueue.add(center[i]);
			suml[i + 1] = suml[i] + center[i] - lqueue.poll();
		}
		for (int i = N-1; i >=0; i--) {
			rqueue.add(center[i]);
			sumr[i] = sumr[i+1] + center[i] - rqueue.poll();
		}
		for (int i = 0; i <= N; i++) {
			s = Math.max(s, suml[i] - sumr[i]);
		}
		System.out.println(s);
	}
}
