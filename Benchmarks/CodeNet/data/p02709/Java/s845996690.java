import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 一時的な汚いコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long[] a = new long[n];
			Data[] datas = new Data[n];
			IntStream.range(0, n).forEach(i -> {
				a[i] = scanner.nextInt();
				datas[i] = new Data(a[i], i);
			});
			Arrays.sort(datas);
			System.out.println(getResult(datas, 0, n - 1, 0));
		}
	}

	private static long getResult(final Data[] datas, final int leftIndex, final int rightIndex, final int index) {
		if (index >= datas.length) {
			return 0;
		}
		return Math.max(
				getResult(datas, leftIndex + 1, rightIndex, index + 1)
						+ datas[index].value * Math.abs(leftIndex - datas[index].index),
				getResult(datas, leftIndex, rightIndex - 1, index + 1)
						+ datas[index].value * Math.abs(rightIndex - datas[index].index));
	}

	private static class Data implements Comparable<Data> {
		final long value;
		final int index;

		Data(long value, int index) {
			super();
			this.value = value;
			this.index = index;
		}

		@Override
		public int compareTo(Data o) {
			if (this.value == o.value) {
				return this.index - o.index;
			}
			if (this.value > o.value) {
				return -1;
			} else {
				return 1;
			}
		}
	}
}
