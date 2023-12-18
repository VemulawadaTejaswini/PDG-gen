import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		int M = Integer.parseInt(tokens[1]);
		Queue<Long> queue = new PriorityQueue<>();
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			queue.add(Long.parseLong(tokens[i]));
		}

		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int B = Integer.parseInt(tokens[0]);
			long C = Integer.parseInt(tokens[1]);
			step(queue, B, C);
		}
		long result = 0;
		while (!queue.isEmpty()) {
			result += queue.poll();
		}
		System.out.println(result);

		in.close();
	}

	static void step(Queue<Long> queue, int B, long C) {
		int count = 0;
		for (int i = 0; i < B; ++i) {
			long elem = queue.peek();
			if (elem > C) {
				break;
			}
			queue.poll();
			++count;
		}
		for (int i = 0; i < count; ++i) {
			queue.add(C);
		}
		return;
	}
}
