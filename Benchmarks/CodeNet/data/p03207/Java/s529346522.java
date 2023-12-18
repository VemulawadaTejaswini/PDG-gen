import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] priceArr = new int[num];

		for (int i = 0; i < num; i++) {
			priceArr[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(priceArr);

		int total = 0;

		for (int i = 0; i < priceArr.length; i++) {

			if (i == priceArr.length - 1) {
				total += priceArr[i] / 2;
			} else {
				total += priceArr[i];
			}
		}

		System.out.println(total);
	}

}
