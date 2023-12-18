import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();

		PriorityQueue<Integer> qL = new PriorityQueue<Integer>(Comparator.reverseOrder());
		PriorityQueue<Integer> qR = new PriorityQueue<Integer>();
		long sumA = 0;
		long sumB = 0;

		for (int i = 0; i < Q; i++) {
			int x = sc.nextInt();
			if (x == 1) {
				Integer a = sc.nextInt();
				sumB += sc.nextInt();
				qL.add(a);
				qR.add(a);
				if (qL.peek() > qR.peek()) {
					Integer tmpL = qL.poll();
					Integer tmpR = qR.poll();
					qL.add(tmpR);
					qR.add(tmpL);
					sumA += (tmpL - tmpR);
				}

				// for (int num : qL) {
				// 	System.out.print(num + ", ");
				// }
				// System.out.println();
				// for (int num : qR) {
				// 	System.out.print(num + ", ");
				// }
				// System.out.println();
			} else {
				if (qL.size() == 0) {
					System.out.println("0 0");
					continue;
				}
				Integer min = qL.peek();
				long sum = sumA + sumB;
				System.out.println(min + " " + sum);
			}
		}
	}
}
