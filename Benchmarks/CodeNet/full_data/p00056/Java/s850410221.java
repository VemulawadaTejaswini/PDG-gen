import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	//private static final ArrayList<Integer> primeNumberList = getPrimeNumberList(50000);
	private static final Integer[] primeNumberArray = getPrimeNumberArray(50000);

	public static void main(String[] args) throws IOException {
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			// final long time1 = System.nanoTime();
			while (input.ready()) {
				final int dataset = Integer.valueOf(input.readLine());
				if (dataset == 0)
					break;
				System.out.println(getGoldbachsByArray(dataset));
			}

			// final long time2 = System.nanoTime();
			// System.out.println(String.format("%1$,3d ns", time2 - time1));
		}
	}

	private static int getGoldbachsByArray(int number) {
		//final long time1 = System.nanoTime();
		if (number % 2 != 0)
			return 0;
		int ret = 0;
		int tmp = 0;
		for (int i = 0; i < primeNumberArray.length; i++) {
			if (primeNumberArray[i] >= number)
				break;
			for (int j = i; j < primeNumberArray.length; j++) {
				tmp = primeNumberArray[i] + primeNumberArray[j];
				if (tmp > number) {
					break;
				}
				if (tmp == number) {
					ret++;
				}
			}
		}
		//final long time2 = System.nanoTime();
		//System.out.println(String.format("%1$,3d ns", time2 - time1));
		return ret;
	}
/*
	private static int getGoldbachsByList(int number) {
		// final long time1 = System.nanoTime();
		if (number % 2 != 0)
			return 0;
		int ret = 0;
		for (int i = 0; i < primeNumberList.size(); i++) {
			if (primeNumberList.get(i) >= number)
				break;
			for (int j = i; j < primeNumberList.size(); j++) {
				if (primeNumberList.get(i) + primeNumberList.get(j) > number) {
					break;
				}
				if (primeNumberList.get(i) + primeNumberList.get(j) == number) {
					ret++;
				}
			}
		}
		// final long time2 = System.nanoTime();
		// System.out.println(String.format("%1$,3d ns", time2 - time1));
		return ret;
	}
*/
	public static boolean isPrimeNumber(int number) {
		for (int each : primeNumberList) {
			if (number % each == 0)
				return false;
			if (each >= Math.sqrt(number))
				break;
		}
		return true;
	}

	public static ArrayList<Integer> getPrimeNumberList(int maxNumber) {
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
		return primeNumberList;
	}

	public static Integer[] getPrimeNumberArray(int maxNumber) {
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