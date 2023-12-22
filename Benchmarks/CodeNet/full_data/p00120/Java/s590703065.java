
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
			int n = Integer.parseInt(tokenizer.nextToken());
			int s = tokenizer.countTokens();
			int[] num = new int[s];
			for (int i = 0; i < s; i++) {
				num[i] = Integer.parseInt(tokenizer.nextToken());
			}
			Arrays.sort(num);
			Deque<Integer> que = new ArrayDeque<Integer>();
			for (int t : num) {
				que.offer(t);
			}
			Deque<Integer> deque = new ArrayDeque<Integer>();
			int count = 0;
			while (!que.isEmpty()) {
				if (count % 4 == 0)
					deque.offer(que.pop());
				else if (count % 4 == 1)
					deque.offer(que.pollLast());
				else if (count % 4 == 2)
					deque.push(que.pollLast());
				else
					deque.push(que.pop());
				count++;

			}
			double sum = 0;
			sum += deque.getFirst();
			sum += deque.getLast();
			int a = deque.pop();
			while (!deque.isEmpty()) {
				int b = deque.pop();
				sum += Math.sqrt(a * b) * 2;
				a = b;
			}
			System.out.println(sum <= n ? "OK" : "NA");
		}
	}
}