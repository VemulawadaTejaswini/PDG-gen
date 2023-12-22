import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static final Integer[] primeNumberArray = getPrimeNumberArray(100000);

	public static void main(String[] args) throws IOException {
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			while (input.ready()) {
				final int dataset = Integer.valueOf(input.readLine());
				if (dataset == 0)
					break;
				System.out.println(getGoldbachsByArray(dataset));
			}
		}
	}

	private static int getGoldbachsByArray(final int number) {
		if (number % 2 != 0)
			return 0;
		int ret = 0;
		int tmp = 0;
		for (int i = 0; i < primeNumberArray.length; i++) {
			if (primeNumberArray[i] > number / 2)
				break;
			for (int j = primeNumberArray.length - 1; j > 0; j--) {
				if (primeNumberArray[j] < number / 2) {
					break;
				}
				tmp = primeNumberArray[i] + primeNumberArray[j];
				if (tmp == number) {
					System.out.println(number + " " + primeNumberArray[i] + " " + primeNumberArray[j]);
					ret++;
				}
			}
		}
		return ret;
	}

	public static Integer[] getPrimeNumberArray(final int maxNumber) {
		ArrayList<Integer> primeNumberList = new ArrayList<>();
		primeNumberList.add(2);
		primeNumberList.add(3);
		primeNumberList.add(5);
		primeNumberList.add(7);

		final int[] oneDigitList = { 1, 3, 7, 9 };

		int tmp;
		int sqrtTmp;
		boolean addFlag;
		for (int i = 10; i <= maxNumber; i += 10) {
			for (int oneDigit : oneDigitList) {
				addFlag = true;
				tmp = i + oneDigit;
				sqrtTmp = (int) Math.sqrt(tmp);
				for (int primeNumber : primeNumberList) {
					if (tmp % primeNumber == 0) {
						addFlag = false;
						break;
					}
					if (sqrtTmp < primeNumber) {
						break;
					}
				}
				if (addFlag) {
					primeNumberList.add(tmp);
				}
			}
		}

		return primeNumberList.toArray(new Integer[0]);
	}
}