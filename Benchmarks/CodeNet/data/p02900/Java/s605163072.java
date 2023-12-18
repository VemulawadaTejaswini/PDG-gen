import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();

		String[] stringArray = str1.split(" ");

		long numberA = Long.parseLong(stringArray[0]);
		long numberB = Long.parseLong(stringArray[1]);

		Long[] commonDivisors = calculateCommonDivisor(numberA, numberB);

		Long[] results = likeSieveOfEratosthenes(commonDivisors);

		System.out.println(results.length);
	}

	public static Long[] calculateCommonDivisor(long numberA, long numberB) {

		long highNumber = Math.max(numberA, numberB);

		List<Long> divisorList = calculateDivisor(highNumber);

		long lowNumber = numberA == highNumber
				? numberB
				: numberA;

		List<Long> commonDivisorList = divisorList.stream()
				.filter(l -> lowNumber % l == 0)
				.collect(Collectors.toList());

		return commonDivisorList.toArray(new Long[commonDivisorList.size()]);
	}

	public static List<Long> calculateDivisor(long number) {

		List<Long> halfResultArray = new ArrayList<>();

		long[] targetArray = LongStream.range(1, (long) Math.sqrt(number) + 1)
				.toArray();

		for (long targetNumber : targetArray) {

			if (number % targetNumber == 0) {
				halfResultArray.add(targetNumber);
			}
		}

		List<Long> resultArray = new ArrayList<>();
		resultArray.addAll(halfResultArray);

		for (long targetNumber : halfResultArray) {

			resultArray.add(number / targetNumber);
		}

		return resultArray;
	}

	public static Long[] likeSieveOfEratosthenes(Long[] targetArray) {

		List<Long> resultArray = new ArrayList<>();

		while (targetArray.length > 0) {

			long firstNumber = targetArray[0];

			resultArray.add(targetArray[0]);

			if (firstNumber == 1) {

				// 1だけ除外する
				targetArray = Arrays.stream(targetArray)
						.filter(i -> i != 1)
						.toArray(l -> new Long[l]);
			} else {

				targetArray = Arrays.stream(targetArray)
						.filter(i -> i % firstNumber != 0)
						.toArray(l -> new Long[l]);
			}
		}

		return resultArray.toArray(new Long[resultArray.size()]);
	}
}