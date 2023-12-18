import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int array[] = new int[M];
		Integer arrayAbs[] = new Integer[M - 1];

		for (int i = 0; i < M; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);

		for (int i = 0; i < M-1; i++) {

				arrayAbs[i] = Math.abs(array[i] - array[i+1]);

		}
		Arrays.sort(arrayAbs);
		
		int min = 0;
		for (int i = 0; i < arrayAbs.length - N + 1; i++) {
			min += arrayAbs[i];
		}

		System.out.println(min);
	}

}
