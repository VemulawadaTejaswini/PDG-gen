import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int K;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		K = Integer.parseInt(tokens[0]);

	}

	long getNext(Queue<String> que) {
		String str = que.poll();
		long result = Long.parseLong(str);
		int last = Integer.parseInt(str.substring(str.length() - 1, str.length()));
		for (int i = last - 1; i <= last + 1; ++i) {
			if (i < 0 || i >= 10) {
				continue;
			}
			que.add(str + Integer.toString(i));
		}
		return result;
	}

	void calc() {
		Queue<String> que = new ArrayDeque<>();
		for (int i = 1; i < 10; ++i) {
			que.add(Integer.toString(i));
		}
		int count = 0;
		while (count < K) {
			result = getNext(que);
			++count;
		}
	}

	void showResult() {
		System.out.println(result);
	}

}
