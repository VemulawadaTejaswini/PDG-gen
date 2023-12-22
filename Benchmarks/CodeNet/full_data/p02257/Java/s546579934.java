import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numberOfTimes, count = 0;
		int[] numbers;
		numberOfTimes = Integer.parseInt(in.readLine());
		numbers = new int[numberOfTimes];
		for (int i = 0; i < numberOfTimes; i++) {
			numbers[i] = Integer.parseInt(in.readLine());
			if (numbers[i] == 1) {
				break;
			} else {
				for (int x = 2; x <= numbers[i]; x++) {
					if (numbers[i] % x == 0) {
						if (numbers[i] != x) {
							break;
						} else if (numbers[i] == x) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}