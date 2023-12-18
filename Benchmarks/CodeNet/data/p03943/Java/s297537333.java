import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main {

	public static void main(final String[] args) throws Exception {

		try {

			final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			final String[] inputString = br.readLine().split(" ");

			final List<Integer> candyPackCountList = Arrays.asList(inputString).stream().map(s -> Integer.parseInt(s))
					.sorted((i1, i2) -> i2 - i1).collect(Collectors.toList());

			final boolean isPossible = getPossible(candyPackCountList);

			String result;

			if (isPossible) {
				result = "Yes";
			} else {
				result = "No";
			}

			System.out.println(result);

		} catch (IOException | NumberFormatException e) {
			e.printStackTrace();
			System.exit(0);
		} catch (final Exception e) {
			e.printStackTrace();
			System.exit(0);
		}

	}

	public static boolean getPossible(final List<Integer> candyPackCountList) {
		return candyPackCountList.get(0) == candyPackCountList.get(1) + candyPackCountList.get(2);
	}
}