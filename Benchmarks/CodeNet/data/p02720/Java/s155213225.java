import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());

		Queue<Long> que = new ArrayDeque<>();
		for (int i = 1; i < 10; i++) {
			que.add((long) i);
		}
		int i = 0;
		long val = 1;

		while (k-- > 0) {
			val = que.poll();
			if (val % 10 != 0)
				que.add(10 * val + val % 10 - 1);
			que.add(10 * val + val % 10);
			if (val % 10 != 9)
				que.add(10 * val + val % 10 + 1);
			i++;
		}
		System.out.println(val);
	}
}
