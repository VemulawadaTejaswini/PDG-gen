package ABC150;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int count = 0;
	static int firstCount = 0;
	static int finalCount = 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String firstNumbers = "";
		String finalNumbers = "";
		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			firstNumbers = firstNumbers + y;
		}
		for (int i = 0; i < x; i++) {
			int y = sc.nextInt();
			finalNumbers = finalNumbers + y;
		}
		sc.close();
		sortAllNumbers("", x, new ArrayList<>(), firstNumbers, finalNumbers);
		System.out.println(Math.abs(finalCount - firstCount));
	}

	static String sortAllNumbers(String number, int size, List numberList, String firstNumbers, String finalNumbers) {
		for (int i = 1; i <= size; i++) {
			if (numberList.contains(i))
				continue;
			String numbers = number + i;
			if (numbers.length() == size) {
				numberList.remove(numberList.size() - 1);
				count++;
				if (numbers.equals(firstNumbers)) {
					firstCount = count;
				}
				if (numbers.equals(finalNumbers)) {
					finalCount = count;
				}
				return numbers;
			}
			numberList.add(i);
			numbers = sortAllNumbers(numbers, size, numberList, firstNumbers, finalNumbers);
		}
		if (!numberList.isEmpty())
			numberList.remove(numberList.size() - 1);
		return number;
	}

}
