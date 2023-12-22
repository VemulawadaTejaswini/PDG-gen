import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {
	public static void main(String[] args) {
		long systemTime = System.currentTimeMillis();
		System.out.println("- start -");
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			List<String> lines = br.lines().collect(Collectors.toList());
			String[] array = lines.get(1).split("\\s");

			int[] numberArray = Stream.of(array).mapToInt(Integer::parseInt).toArray();

			int resultCnt = countSortTimes(numberArray);

			System.out.println(resultCnt);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("- end - " + String.valueOf(System.currentTimeMillis() - systemTime) + "ms");
	}

	private static int countSortTimes(int[] numberArray) {
		boolean isSorted;
		int size = numberArray.length;
		int cnt = 0;

		do {
			isSorted = false;
			for (int i = 1; i < size; i++) {
				if (numberArray[i] < numberArray[i - 1]) {
					int tmp = numberArray[i - 1];
					System.arraycopy(numberArray, i, numberArray, i - 1, size - i);
					numberArray[size - 1] = tmp;
					isSorted = true;
					cnt++;
					break;
				}
			}
		} while (isSorted);

		return cnt;
	}
}