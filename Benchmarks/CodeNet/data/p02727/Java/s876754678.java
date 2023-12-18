import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int eatRed = sc.nextInt();
		int eatGreen = sc.nextInt();

		int haveRed = sc.nextInt();
		int haveGreen = sc.nextInt();
		int haveInv = sc.nextInt();

		Integer[] redDelicious = new Integer[haveRed];
		for (int i = 0; i < haveRed; i++) {
			redDelicious[i] = sc.nextInt();
		}

		Integer[] greenDelicious = new Integer[haveGreen];
		for (int i = 0; i < haveGreen; i++) {
			greenDelicious[i] = sc.nextInt();
		}

		Integer[] invDelicious = new Integer[haveInv];
		for (int i = 0; i < haveInv; i++) {
			invDelicious[i] = sc.nextInt();
		}

		sc.close();

		Arrays.sort(redDelicious, Collections.reverseOrder());
		Arrays.sort(greenDelicious, Collections.reverseOrder());
		Arrays.sort(invDelicious, Collections.reverseOrder());

		Integer[] ateRed = new Integer[eatRed];
		for (int i = 0; i < eatRed; i++) {
			ateRed[i] = redDelicious[i];
		}

		Integer[] ateGreen = new Integer[eatGreen];
		for (int i = 0; i < eatGreen; i++) {
			ateGreen[i] = greenDelicious[i];
		}

		for (int i = 0; i < invDelicious.length; i++) {
			boolean eat = false;
			for (int j = 0; j < eatRed; j++) {
				if (invDelicious[i] > ateRed[j]) {
					ateRed[j] = invDelicious[i];
					eat = true;
					break;
				}
			}
			if (eat) {
				continue;
			}
			for (int j = 0; j < eatGreen; j++) {
				if (invDelicious[i] > ateGreen[j]) {
					ateGreen[j] = invDelicious[i];
					break;
				}
			}
		}

		int result = 0;
		for (Integer i : ateRed) {
			result += i;
		}
		for (Integer i : ateGreen) {
			result += i;
		}

		System.out.print(result);
	}

}