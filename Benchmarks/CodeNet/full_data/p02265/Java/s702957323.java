import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] commands;
		int num;
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			commands = br.readLine().split(" ");
			if (commands[0].endsWith("First")) {
				deque.removeFirst();
				continue;
			} else if (commands[0].endsWith("Last")) {
				deque.removeLast();
				continue;
			}
			num = Integer.parseInt(commands[1]);
			if (commands[0].startsWith("d")) {
				deque.remove(new Integer(num));
			} else {
				deque.addFirst(num);
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(deque.poll());
		while (deque.size() > 0) {
			sb.append(" ");
			sb.append(deque.poll());
		}
		System.out.println(sb);
	}
}