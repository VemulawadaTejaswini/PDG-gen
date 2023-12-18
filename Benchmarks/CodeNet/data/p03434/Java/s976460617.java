import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer[] data = new Integer[N];
		for (int i = 0; i < N; i++) {
			data[i] = sc.nextInt();
		}

		Arrays.sort(data, Comparator.reverseOrder());

		int Alice = 0;
		int Bob = 0;

		for (int i = 0; i < data.length; i++) {
			if (i % 2 == 0) {
				Alice += data[i];
			} else {
				Bob += data[i];
			}
		}
		
		System.out.println(Alice - Bob);

		sc.close();
	}

}