import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] arrays = new int[Integer.parseInt(input())];
		long sumArrays = 0;

		for (int i = 0; i < arrays.length; i++) {

			arrays[i] = Integer.parseInt(input());
			sumArrays += (long) arrays[i];

		}

		Arrays.sort(arrays);

		System.out.print(arrays[0]);
		System.out.print(" ");
		System.out.print(arrays[arrays.length - 1]);
		System.out.print(" ");
		System.out.println(sumArrays);

		close();

	}

	public static String input() {

		return scanner.next();

	}

	public static void close() {

		if (scanner != null) {

			scanner.close();

		}
	}
}