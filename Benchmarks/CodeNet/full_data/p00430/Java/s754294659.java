import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) != 0) {
			int[] array = new int[n + 1];
			array[0] = n;
			printArray(array, n);
			while (array[n - 1] == 0) {
				int a = 0;
				while (array[a + 1] > 1) {
					a++;
				}
				array[a]--;
				a++;
				while (array[a] + 1 > array[a - 1]) {
					a++;
				}
				array[a]++;
				printArray(array, n);
			}
		}
		in.close();
	}

	static StringBuilder sb = new StringBuilder();

	static void printArray(int[] array, int n) {
		// System.out.println(Arrays.toString(array));
		sb.setLength(0);
		int i = 0;
		while (array[i] >= 1) {
			sb.append(array[i]);
			i++;
			if (array[i] != 0) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}
}