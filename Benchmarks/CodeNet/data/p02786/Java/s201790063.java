import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	long H;
	long result = 0;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		H = Long.parseLong(in.readLine());
	}

	Deque<Long> sub(long val) {
		if (val == 1) {
			Deque<Long> deque = new ArrayDeque<>();
			deque.addFirst(val);
			return deque;
		} else {
			long next = val / 2;
			Deque<Long> deque = sub(next);
			deque.addFirst(val);
			return deque;
		}
	}

	void calc() {
		Deque<Long> deque = sub(H);
		long addVal = 1;
		while (!deque.isEmpty()) {
			Long val = deque.pollFirst();
			result += addVal;
			addVal *= 2;
		}

	}

	void showResult() {
		System.out.println(result);
	}
}
