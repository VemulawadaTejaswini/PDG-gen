import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> inputList = new ArrayList<>(30);

		try {
			while (input.ready()) {
				inputList.add(Integer.valueOf(input.readLine()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		int maxNum = 0;
		for (int num : inputList) {
			if (maxNum < num)
				maxNum = num;
		}

		ArrayList<Integer> primeNumberList = getPrimeNumberList(maxNum);

		for (int num : inputList) {
			int primeNumberCount = 0;
			for (int i = 0; i < primeNumberList.size(); i++) {
				if (num >= primeNumberList.get(i)) {
					primeNumberCount++;
				} else {
					break;
				}
			}
			System.out.println(primeNumberCount);
		}
	}

	public static ArrayList<Integer> getPrimeNumberList(int maxNumber) {
		ArrayList<Integer> primeNumberList = new ArrayList<>(9600);
		primeNumberList.add(2);
		primeNumberList.add(3);
		primeNumberList.add(5);
		primeNumberList.add(7);

		ArrayList<Integer> oneDigitList = new ArrayList<>();
		oneDigitList.add(1);
		oneDigitList.add(3);
		oneDigitList.add(7);
		oneDigitList.add(9);

		int tmp;
		for (int i = 10; i <= maxNumber; i += 10) {
			for (int oneDigit : oneDigitList) {
				boolean addFlag = true;
				tmp = i + oneDigit;
				for (int primeNumber : primeNumberList) {
					if (Math.sqrt(primeNumber) > tmp) {
						break;
					}
					if (tmp % primeNumber == 0) {
						addFlag = false;
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
}