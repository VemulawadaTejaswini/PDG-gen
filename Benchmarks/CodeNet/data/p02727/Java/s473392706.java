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
		Arrays.sort(invDelicious);

		Integer[] ateRed = new Integer[eatRed];
		for (int i = 0; i < eatRed; i++) {
			ateRed[i] = redDelicious[i];
		}

		Integer[] ateGreen = new Integer[eatGreen];
		for (int i = 0; i < eatGreen; i++) {
			ateGreen[i] = greenDelicious[i];
		}

		int result = 0;
		for (Integer i : ateRed) {
			int ate = i;
			for (int j = 0; j < invDelicious.length; j++) {
				if (invDelicious[j] > i) {
					ate = invDelicious[j];
					invDelicious[j] = 0;
					break;
				}
			}
			result += ate;
		}
		for (Integer i : ateGreen) {
			int ate = i;
			for (int j = 0; j < invDelicious.length; j++) {
				if (invDelicious[j] > i) {
					ate = invDelicious[j];
					invDelicious[j] = 0;
					break;
				}
			}
			result += ate;
		}

		System.out.print(result);
	}

}