import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}

			long count = 0;
			ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
			queue.offer(n - 1);
			queue.offer(n - 2);
			queue.offer(n - 3);

			while (queue.size() > 0) {
				Integer step = queue.poll();
				if (step == 0) {
					count++;
				} else if (step > 0) {
					queue.offer(step - 1);
					queue.offer(step - 2);
					queue.offer(step - 3);
				}
			}
			System.out.println(count % 3650 == 0 ? count / 3650 : count / 3650 + 1);
		}
	}
}