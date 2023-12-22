import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value_num = sc.nextInt();
		int[] values = new int[value_num];
		for (int i = 0; i < value_num; i++) {
			values[i] = sc.nextInt();
		}
		printArray(values);

		for (int out_i = 1; out_i < value_num; out_i++) {
			int in_i = out_i - 1;
			int subjectOfSort = values[out_i];
			while (in_i >= 0 && values[in_i] > subjectOfSort) {
				values[in_i + 1] = values[in_i];
				in_i--;
			}
			values[in_i + 1] = subjectOfSort;
			printArray(values);
		}
	}
	public static void printArray(int[] array) {
		for (int print_i = 0; print_i < array.length; print_i++) {
			if (print_i != 0) {
				System.out.print(" ");
			}
			System.out.print(array[print_i]);
		}
		System.out.print("\n");
	}
}
