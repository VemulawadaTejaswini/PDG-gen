import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		sc.nextLine();

		PriorityQueue<Long> smallest = new PriorityQueue<>();
		PriorityQueue<Long> biggest = new PriorityQueue<>(Comparator.reverseOrder());
		long answer = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			String[] query = sc.nextLine().split(" ");
			if (query[0].charAt(0) == '1') {
				answer += Long.parseLong(query[2]);
				smallest.offer(Long.parseLong(query[1]));
				biggest.offer(Long.parseLong(query[1]));
				long s = smallest.peek();
				long b = biggest.peek();
				if (b > s) {
					smallest.poll();
					biggest.poll();
					smallest.offer(b);
					biggest.offer(s);
					answer += Math.abs(b - s);
				}
			} else {
				sb.append(biggest.peek()).append(" ")
						.append(answer).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}
