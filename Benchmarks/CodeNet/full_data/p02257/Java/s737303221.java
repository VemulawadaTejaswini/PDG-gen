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
		int key = 2;
		while (num > key) {
			if ((num % key) == 0) {
				return false;
			}
			key++;
		}
		return true;
	}
}