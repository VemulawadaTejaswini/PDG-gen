import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		Queue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -1 * Integer.compare(o1, o2);
			}
		});
		for (int i = 0; i < N; ++i) {
			que.add(Integer.parseInt(tokens[i]));
		}

		int alice = 0;
		int bob = 0;
		boolean isAlice = true;
		while (!que.isEmpty()) {
			if (isAlice) {
				alice += que.poll();
			} else {
				bob += que.poll();
			}
			isAlice = !isAlice;
		}
		System.out.println((alice - bob));
	}

	void calc() {
	}

	void showResult() {
	}
}