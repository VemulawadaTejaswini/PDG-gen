import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			final String[] datasize = input.readLine().split(" ");
			final int personCount = Integer.parseInt(datasize[0]);
			final int eventCount = Integer.parseInt(datasize[1]);

			int[] sumArray = new int[personCount + 1];
			Arrays.fill(sumArray, 0);

			while (input.ready()) {
				final String[] event = input.readLine().split(" ");
				final int personNum = Integer.parseInt(event[0]);
				final int eventNum = Integer.parseInt(event[1]);
				sumArray[personNum] += eventNum;
				final long start = System.nanoTime();
				final int[] ans = getMaxPersonData(sumArray);
				final long end = System.nanoTime();
				System.out.println(ans[0] + " " + ans[1]);
				System.out.println(end - start);
			}
		}
	}

	public static int[] getMaxPersonData(int[] array) {
		int max = Integer.MIN_VALUE;
		int maxPersonNum = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				maxPersonNum = i;
			}
		}
		int[] ret = { maxPersonNum, max };
		return ret;
	}
}