import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Deque<String> q = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			String line = br.readLine();

			if (line.equals("deleteFirst")) {
				q.pollFirst();
			} else if (line.equals("deleteLast")) {
				q.pollLast();
			} else if (line.startsWith("insert")) {
				q.offerFirst(line.split(" ")[1]);
			} else {
				q.remove(line.split(" ")[1]);
			}

			if (i % 100000 == 0) {
				System.gc();
			}
		}

		System.out.print(q.poll());
		for (String s : q) {
			System.out.println(" ");
			System.out.print(s);
		}
		System.out.println();

		if (br != null) {
			br.close();
			br = null;
		}
	}
}