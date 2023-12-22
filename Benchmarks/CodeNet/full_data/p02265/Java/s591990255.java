import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Deque<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			String line = br.readLine();

			if (line.startsWith("insert")) {
				q.offerFirst(Integer.parseInt(line.substring(line.indexOf(" ") + 1)));
			} else if (line.equals("deleteFirst")) {
				q.pollFirst();
			} else if (line.equals("deleteLast")) {
				q.pollLast();
			} else {
				q.remove(Integer.parseInt(line.substring(line.indexOf(" ") + 1)));
			}
		}

		System.out.print(q.poll());
		for (Integer s : q) {
			System.out.print(" ");
			System.out.print(s);
		}
		System.out.println();

		if (br != null) {
			br.close();
			br = null;
		}
	}
}