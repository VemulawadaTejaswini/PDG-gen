import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		long[] arrays = new long[(int) input()];
		long sumArrays = 0;

		for (int i = 0; i < arrays.length; i++) {

			arrays[i] = input();
			sumArrays += arrays[i];

		}

		Arrays.sort(arrays);

		System.out.print(arrays[0]);
		System.out.print(" ");
		System.out.print(arrays[arrays.length - 1]);
		System.out.print(" ");
		System.out.print(sumArrays);

		close();

	}

	public static long input() {

		return scanner.nextLong();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}