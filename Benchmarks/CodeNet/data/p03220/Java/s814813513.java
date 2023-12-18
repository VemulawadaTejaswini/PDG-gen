import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 平均気温の係数 */
	private static final double D = 0.006d;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), t = scanner.nextInt(), a = scanner.nextInt();
			Queue<Data> queue = new PriorityQueue<>();
			IntStream.range(0, n).forEach(i -> {
				int h = scanner.nextInt();
				queue.add(new Data(i + 1, Math.abs(t - h * D - a)));
			});
			System.out.println(queue.peek().index);
		}
	}

	private static class Data implements Comparable<Data> {
		int index;
		double h;

		Data(int index, double h) {
			super();
			this.index = index;
			this.h = h;
		}

		@Override
		public int compareTo(Data data) {
			return Double.compare(h, data.h);
		}
	}
}
