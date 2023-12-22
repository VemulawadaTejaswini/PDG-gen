import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		//
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = null;
		int[] inputInt = null;
		try {
			inputStr = (input.readLine()).split(" ");
			inputInt = new int[inputStr.length];
			for (int i = 0; i < inputInt.length; i++) {
				inputInt[i] = Integer.parseInt(inputStr[i]);
			}
			System.out.println(countDivisors(inputInt));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static int countDivisors(int[] divisors) {
		int countDivisors = 0;
		for (int i = divisors[0]; i <= divisors[1]; i++) {
			if (divisors[2] % i == 0) {
				countDivisors++;
			}
		}
		return countDivisors;
	}

}

