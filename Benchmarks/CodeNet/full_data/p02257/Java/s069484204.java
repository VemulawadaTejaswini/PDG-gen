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

		// ?卒???属???????????????
		int count = 0;
		boolean isPrime = false;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] == 1) {
				continue;
			}
			if (numArray[i] == 2 || numArray[i] == 3 || numArray[i] == 5
					|| numArray[i] == 7) {
				count++;
				continue;
			}
			for (int j = 2; j * j <= numArray[i]; j++) {
				if ((numArray[i] % j) == 0) {
					isPrime = false;
					break;
				}
				isPrime = true;
			}
			if (isPrime) {
				count++;
			}
		}

		System.out.println(count);
	}
}