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
			long[][][] s = new long[n][n][n];
			IntStream.range(0, n).forEach(i -> IntStream.range(0, n).forEach(j -> Arrays.fill(s[i][j], -1L)));
			System.out.println(getResult(datas, 0, n - 1, 0, s));
		}
	}

	private static long getResult(final Data[] datas, final int leftIndex, final int rightIndex, final int index,
			long[][][] s) {
		if (index >= datas.length) {
			return 0;
		}
		if (s[leftIndex][rightIndex][index] >= 0) {
			return s[leftIndex][rightIndex][index];
		}
		s[leftIndex][rightIndex][index] = Math.max(
				getResult(datas, leftIndex + 1, rightIndex, index + 1, s)
						+ datas[index].value * Math.abs(leftIndex - datas[index].index),
				getResult(datas, leftIndex, rightIndex - 1, index + 1, s)
						+ datas[index].value * Math.abs(rightIndex - datas[index].index));
		return s[leftIndex][rightIndex][index];
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
