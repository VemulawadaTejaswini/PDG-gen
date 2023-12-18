
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		int n = kb.nextInt();
		int[] a = new int[n * 2];
		for (int i = 0; i < n; i++) {
			int j = kb.nextInt();
			a[i] = j;
			a[i + n] = j + k;
		}
		int count = a[2] - a[0];
		for (int i = 0; i < n; i++) {
			int count2 = a[i + 2] - a[i];
			if (a[i + 1] + a[i + 2] - 2 * a[i] < count) {
				count2 = a[i + 1] + a[i + 2] - 2 * a[i];
			}
			if (2 * a[i + 2] - a[i + 1] - a[i] < count) {
				count2 = 2 * a[i + 2] - a[i + 1] - a[i];
			}
			if (count2 < count)
				count = count2;
		}
		System.out.println(count);
		kb.close();
	}

}
