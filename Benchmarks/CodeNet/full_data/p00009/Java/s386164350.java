import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> primeNumberList = getPrimeNumberList(1000000);

		try {
			while (input.ready()) {
				int num = Integer.valueOf(input.readLine());
				int primeNumberCount = 0;
				for (int j = 0; j < primeNumberList.size(); j++) {
					if (num >= primeNumberList.get(j)) {
						primeNumberCount++;
					} else {
						break;
					}
				}
				System.out.println(primeNumberCount);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ArrayList<Integer> getPrimeNumberList(int maxNumber) {
		ArrayList<Integer> primeNumberList = new ArrayList<>();
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