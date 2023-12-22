import java.util.Scanner;

public class Main {
	public static void main(String[] a) {

		int array[] = new int[10];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < array.length; i += 1) {
			System.out.println("整数を入力(0<=整数<=10000)");
			array[i] = scan.nextInt();
			if (array[i] <= 0 || 10000 <= array[i]) {
				System.out.println("0以上10000以下の整数を入力してください");
				return;
			}
		}
		sortHighet(array);
		topThreeMountains(array);
	}

	public static void topThreeMountains(int[] array) {
		for (int x = 0; x < 3; x += 1) {
			System.out.println(array[x]);
		}
	}

	public static void sortHighet(int[] array) {
		for (int j = 0; j < array.length; j += 1) {
			for (int q = j + 1; q < array.length; q += 1) {
				compareNumbers(array, j, q);
			}
		}
	}

	public static void compareNumbers(int[] array, int j, int q) {
		if (array[j] < array[q]) {
			int temporary = array[j];
			array[j] = array[q];
			array[q] = temporary;
		}
	}
}