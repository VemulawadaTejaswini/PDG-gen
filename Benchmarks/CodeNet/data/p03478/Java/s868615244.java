import java.util.*;

public class Main {

	public static void main(String[] args) {
		final int MAX = 10000;

		Scanner stdin = new Scanner(System.in);

		int inN = stdin.nextInt();
		int[] sumArray = new int[inN + 1];
		int index = 0;
		loop:
		for (int num3 = 0; num3 <= 9; num3++) {
			for (int num2 = 0; num2 <= 9; num2++) {
				for (int num1 = 0; num1 <= 9; num1++) {
					for (int num0 = 0; num0 <= 9; num0++) {
						sumArray[index] = num3 + num2 + num1 + num0;
						index++;

						if (index > inN) {
							break loop;
						}
					}
				}
			}
		}
		if (inN == MAX) {
			sumArray[MAX] = 1;
		}

		int inA = stdin.nextInt();
		int inB = stdin.nextInt();
		int sum = 0;
		for (int i = 1; i <= inN; i++) {
			if ((inA <= sumArray[i]) && (sumArray[i] <= inB)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}
}
