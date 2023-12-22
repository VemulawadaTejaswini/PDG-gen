import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		try (Scanner scanner = new Scanner(System.in)) {

			int size = scanner.nextInt();
			Integer[] array = new Integer[size];

			for(int i = 0; i < size; i++) {
				array[i] = scanner.nextInt();
			}

			Arrays.sort(array, Collections.reverseOrder());

			int sum = 0;
			for(int i = 1; i < size; i++) {
				sum += array[i - 1];
			}

			System.out.println(sum);
		}
	}
}