import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	private static final int MAX = 1000000;

	/**
	 * AOJ 0009 Prime Number
	 */
	public static void main(String[] args) throws IOException {

		int[] primeNums = new int[MAX];
		primeNums[2] = 1;

		ArrayList<Integer> inputList = getInputs();
		boolean isPrime = true;

		for (int i = 3; i < MAX; i++) {
			primeNums[i] = primeNums[i - 1];
			if (i % 2 == 0) {
				isPrime = false;
			}
			for (int j = 3; j <= Math.sqrt(i); j += 2) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeNums[i]++;
			}
			isPrime = true;
		}
		for (int index : inputList) {
			System.out.println(primeNums[index]);
		}
	}

	public static ArrayList<Integer> getInputs() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		try {
			String input = null;
			while ((input = bufferedReader.readLine())!=null) {
				list.add(Integer.parseInt(input));
			}
		} finally {
			bufferedReader.close();
		}
		return list;
	}
}