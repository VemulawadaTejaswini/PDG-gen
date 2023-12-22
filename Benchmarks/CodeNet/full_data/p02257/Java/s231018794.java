import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] numArray = new int[Integer.parseInt(br.readLine())];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = Integer.parseInt(br.readLine());
		}

		int count = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (isPrime(numArray[i])) {
				count++;
			}
		}

		System.out.println(count);
	}

	private static boolean isPrime(int num) {
		while (num > 2) {
			if ((num = num % 2) == 0) {
				return false;
			}
		}
		return true;
	}
}