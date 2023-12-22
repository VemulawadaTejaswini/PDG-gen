import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Deque<Integer> q = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			String[] op = br.readLine().split(" ");

			if ("insert".equals(op[0])) {
				q.offerFirst(Integer.parseInt(op[1]));
			} else if ("delete".equals(op[0])) {
				q.remove(Integer.parseInt(op[1]));
			} else if ("deleteFirst".equals(op[0])) {
				q.pollFirst();
			} else {
				q.pollLast();
			}
			if (i % 500000 == 0) {
				System.gc();
			}
		}

		System.out.print(q.poll());
		for (Integer s : q) {
			System.out.print(" " + s);
		}
		System.out.println();

		if (br != null) {
			br.close();
			br = null;
		}
	}
}