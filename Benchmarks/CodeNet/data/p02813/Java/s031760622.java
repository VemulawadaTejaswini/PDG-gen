import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] c = new int[N];
		for (int i = 0; i < N; i++) {
			c[i] = i + 1;
		}
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			b[i] = in.nextInt();
		}

		int P = 0;
		int Q = 0;
		int count = 1;
		do {
			if (Arrays.equals(c, a)) {
				P = count;
			}
			if (Arrays.equals(c, b)) {
				Q = count;
			}
			count++;
		} while (nextPermutation(c));
		System.out.println(Math.abs(P - Q));
		in.close();
	}

	static boolean nextPermutation(int[] array) {
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;

		if (i <= 0)
			return false;

		int j = array.length - 1;
		while (array[j] <= array[i - 1])
			j--;

		int temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;

		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}

		return true;
	}
}