import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		float array[] = new float[2 * n - 1];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			Arrays.sort(array);
			array[i] = (array[n + i - 1] + array[n + i]) / 2;
			array[n+i - 1] = 0;
			array[n+i] = 0;
		}
		Arrays.sort(array);
		System.out.println(array[2 * n - 2]);
	}

}