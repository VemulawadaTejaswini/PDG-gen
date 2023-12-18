import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long[] array = new long[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLong();
		}

		long[] city = new long[6];
		city[0] = n;
		long sum = 0;

		while (city[5] != n) {
			for (int j = 4; j >= 0; j--) {
				if (city[j] != 0) {
					if (city[j] > array[j]) {
						city[j+1] += array[j];
						city[j] -= array[j];

					} else {
						city[j+1] += city[j];
						city[j] = 0;
					}
				}
			}
			sum++;
		}
		System.out.println(sum);
	}
}
