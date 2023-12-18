import java.util.Scanner;

public class Main {

	public static final int NUM_INPUT = 3;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] str = new String[3];

		for (int i = 0; i < NUM_INPUT; i++) {
			str[i] = scanner.next();
		}

		int max = 0;
		for (int i = 0; i < NUM_INPUT; i++) {
			for (int j = 0; j < NUM_INPUT; j++) {
				if (i == j) {
					continue;
				}
				int index = 0;
				for (int k = 0; k < NUM_INPUT; k++) {
					if (i == k || j == k) {
						continue;
					}
					index = k;
				}
				int num = Integer.parseInt(str[i] + str[j]) + Integer.parseInt(str[index]);
				if (num > max) {
					max = num;
				}
			}
		}

		System.out.println(max);

	}

}
