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

			if (line.startsWith("insert")) {
				q.offerFirst(line.substring(line.indexOf(" ") + 1));
			} else if (line.equals("deleteFirst")) {
				q.pollFirst();
			} else if (line.equals("deleteLast")) {
				q.pollLast();
			} else {
				q.remove(line.substring(line.indexOf(" ") + 1));
			}
		}

		System.out.print(q.poll());
		for (String s : q) {
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