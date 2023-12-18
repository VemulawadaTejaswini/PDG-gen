import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] A;
	Queue<Integer> queue;
	List<String> logs;

	Main(int N, int[] A) {
		this.N = N;
		this.A = A;
		this.queue = new PriorityQueue<>();
		for (int i = 0; i < N; ++i) {
			queue.add(A[i]);
		}
		this.logs = new ArrayList<>();

		calc();
		show();
	}

	void calc() {
		while (queue.size() > 2) {
			int first = queue.poll();
			int second = queue.poll();
			queue.add(first - second);
			this.logs.add(first + " " + second);
		}
		int s = queue.poll();
		int f = queue.poll();
		queue.add(f - s);
		this.logs.add(f + " " + s);

	}

	void show() {
		System.out.println(queue.poll());
		for (int i = 0; i < this.logs.size(); ++i) {
			System.out.println(this.logs.get(i));
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		int[] A = new int[N];
		String[] tokens = in.readLine().split(" ");

		in.close();
		for (int i = 0; i < N; ++i) {
			A[i] = Integer.parseInt(tokens[i]);
		}

		Main ins = new Main(N, A);

	}

}