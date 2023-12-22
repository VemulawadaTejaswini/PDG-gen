import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
	}

	int[] genSeed() {
		int odds = 0;
		int evens = 1;
		int count = 0;
		boolean isOddTurn = true;
		while (count < M) {
			if (isOddTurn) {
				odds += 2;
				isOddTurn= false;
			} else {
				evens += 2;
				isOddTurn = true;
			}
			count++;
		}
		int[] results = new int[2];
		results[0] = odds;
		results[1] = evens;
		return results;
	}

	void calc() {
		int[] seeds = genSeed();
		Deque<Integer> odds = new ArrayDeque<>();
		for (int i = 1; i <= seeds[0]; ++i) {
			odds.addLast(i);
		}
		Deque<Integer> evens = new ArrayDeque<>();
		for (int i = seeds[0] + 1; i <= seeds[0] + seeds[1]; ++i) {
			evens.addLast(i);
		}
		while (!odds.isEmpty()) {
			System.out.println(odds.pollFirst() + " " + odds.pollLast());
		}
		while (evens.size() >= 2) {
			System.out.println(evens.pollFirst() + " " + evens.pollLast());
		}
	}

	void showResult() {
	}

}