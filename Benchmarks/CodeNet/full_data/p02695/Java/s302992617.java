import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int q = stdIn.nextInt();

		List<Numbers> scoreConditionList = new ArrayList<>();
		IntStream.range(0, q).forEach(i -> scoreConditionList
				.add(new Numbers(stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt(), stdIn.nextInt())));

		SequenceFactory factory = new SequenceFactory(n, m);

		List<Integer[]> sequences = factory.createArrays();

		System.out.println(calcMax(scoreConditionList, sequences));

		stdIn.close();
	}

	private static int calcMax(List<Numbers> scoreConditionList, List<Integer[]> sequences) {
		int max = 0;

		for (Integer[] sequence : sequences) {

			int score = 0;
			for (Numbers sCond : scoreConditionList) {
				score += sCond.getScore(sequence);
			}

			max = Integer.max(max, score);
		}

		return max;
	}
}

class SequenceFactory {
	int m;
	int n;

	public SequenceFactory(int n, int m) {
		this.n = n;
		this.m = m;
	}

	public List<Integer[]> createArrays() {
		List<Integer[]> arrays = new ArrayList<Integer[]>();

		//init
		int[] current = new int[n];
		for (int i = 0; i < n; i++) {
			current[i] = 1;

		}
		arrays.add(copy(current));

		while (true) {
			update(current);
			arrays.add(copy(current));

			if (isEnd(current)) {
				break;
			}
		}

		return arrays;
	}

	private Integer[] copy(int[] current) {
		Integer[] array = new Integer[current.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = current[i];
		}
		return array;
	}

	private boolean isEnd(int[] current) {
		return current[0] == m && current[n - 1] == m;
	}

	private int[] update(int[] current) {
		int len = current.length;

		if (current[len - 1] != m) {
			current[len - 1] = current[len - 1] + 1;
			return current;
		}

		for (int i = len - 2; i >= 0; i--) {
			if (current[i] != m) {

				current[i] = current[i] + 1;

				for (int j = i; j < len; j++) {
					current[j] = current[i];
				}

				return current;

			}

		}

		return current;

	}

}

class Numbers {
	int a;
	int b;
	int c;
	int d;

	public Numbers(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getScore(Integer[] seq) {
		if (seq[b - 1] - seq[a - 1] == c) {
			return d;
		}
		return 0;
	}

}