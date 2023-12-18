import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();

		String[] stringArray = str1.split(" ");

		long numberA = Long.parseLong(stringArray[0]);
		long numberB = Long.parseLong(stringArray[1]);

		Long[] commonDivisors = calculateCommonDivisor(numberA, numberB);
		
		System.out.println(Arrays.toString(commonDivisors));

//		Long[] primeNumbers = sieveOfEratosthenes(commonDivisors);
//
//		long resultCount = 1; // 1は絶対含まれる
//
//		for (long primeNumber : primeNumbers) {
//
//			if (numberA % primeNumber == 0 && numberB % primeNumber == 0) {
//				resultCount++;
//			}
//		}
//		
//		if (numberA == numberB && resultCount == 1) {
//			resultCount++; // 対象の数字自体が素数で公約数の場合
//		}
		
		Long[] results = sieveOfEratosthenes(commonDivisors);
		
		System.out.println("result:" + Arrays.toString(results));

		System.out.println(results.length + 1);
	}

	public static Long[] calculateCommonDivisor(long numberA, long numberB) {
		
		boolean isSameNumber = numberA == numberB;
		
		long highNumber = Math.max(numberA, numberB);
		
		List<Long> halfResultArray = new ArrayList<>();

		long[] targetArray = LongStream.range(2, (long)Math.sqrt(highNumber))
				.toArray();
		
		System.out.println("divisor:" + Arrays.toString(targetArray));

		for (long targetNumber : targetArray) {

			if (numberA % targetNumber == 0 && numberB % targetNumber == 0) {
				halfResultArray.add(targetNumber);
			}
		}
		
		List<Long> resultArray = new ArrayList<>();
		resultArray.addAll(halfResultArray);
		
		for (long targetNumber : halfResultArray) {
			
			resultArray.add(highNumber / targetNumber);
		}
		
		if(isSameNumber) {
			resultArray.add(numberA);
		}
		
		
		
		
//		List<Long> numberADivisorList = calculateDivisor(numberA);
//		List<Long> numberBDivisorList = calculateDivisor(numberB);
//		
//		System.out.println(numberADivisorList.toString());
//		System.out.println(numberBDivisorList.toString());
//		
//		List<Long> resultList = numberADivisorList.stream()
//				.filter(l -> numberBDivisorList.contains(l))
//				.collect(Collectors.toList());

//		List<Long> resultArray = new ArrayList<>();
//
//		long[] targetArray = LongStream.range(2, Math.min(numberA, numberB))
//				.toArray();
//
//		for (long targetNumber : targetArray) {
//
//			if (numberA % targetNumber == 0 && numberB % targetNumber == 0) {
//				resultArray.add(targetNumber);
//			}
//		}

		return resultArray.toArray(new Long[resultArray.size()]);
	}
	
//	public static List<Long> calculateDivisor(long number) {
//		
//		List<Long> halfResultArray = new ArrayList<>();
//
//		long[] targetArray = LongStream.range(2, (long)Math.sqrt(number))
//				.toArray();
//		
//		System.out.println("divisor:" + Arrays.toString(targetArray));
//
//		for (long targetNumber : targetArray) {
//
//			if (number % targetNumber == 0) {
//				halfResultArray.add(targetNumber);
//			}
//		}
//		
//		List<Long> resultArray = new ArrayList<>();
//		resultArray.addAll(halfResultArray);
//		
//		for (long targetNumber : halfResultArray) {
//			
//			resultArray.add(number / targetNumber);
//		}
//
//		return resultArray;
//	}

	public static Long[] sieveOfEratosthenes(Long[] targetArray) {

		List<Long> resultArray = new ArrayList<>();

//		long[] targetArray = LongStream.range(2, maxNumber)
//				.toArray();

		while (targetArray.length > 0) {

			long firstNumber = targetArray[0];

			resultArray.add(targetArray[0]);

			targetArray = Arrays.stream(targetArray)
					.filter(i -> i % firstNumber != 0)
					.toArray(l -> new Long[l]);
		}

		return resultArray.toArray(new Long[resultArray.size()]);
	}
}