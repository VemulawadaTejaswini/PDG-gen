import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
	long L;
	int N;
	List<Long> X;
	long result = 0;

	Main() {
		Scanner in = new Scanner(System.in);
		L = in.nextLong();
		N = in.nextInt();
		X = new ArrayList<>(N);
		for (int i = 0; i < N; ++i) {
			X.add(in.nextLong());
		}
		in.close();
	}

	void calc() {
		Deque<Long> queue = new LinkedBlockingDeque<>();
		queue.addAll(X);
		result = Math.max(result, calc(queue));
		queue = new LinkedBlockingDeque<>();
		queue.addAll(X);
		queue.pollFirst();
		result = Math.max(result, calc(queue));
		queue = new LinkedBlockingDeque<>();
		queue.addAll(X);
		queue.pollLast();
		result = Math.max(result, calc(queue));		
	}

	long calc(Deque<Long> X) {
		long result = 0;
		long position = 0L;
		while (!X.isEmpty()) {
			long rightDist = (X.getFirst() - position + L) % L;
			long leftDist = (position - X.getLast() + L) % L;
			if (rightDist >= leftDist) {
				result += rightDist;
				position = X.pollFirst();
			} else {
				result += leftDist;
				position = X.pollLast();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		System.out.println(ins.result);
	}
}