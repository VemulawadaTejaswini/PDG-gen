
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ABC117_A();
		// ABC117_B();
		// ABC117_C();
		ABC117_C2();
		// ABC117_D();
	}

	private static void ABC117_A() {
		Scanner scanner = null;
		String numT = "";
		String numX = "";

		try {
			scanner = new Scanner(System.in);
			numT = scanner.next();
			numX = scanner.next();

			BigDecimal result = new BigDecimal(numT).divide(
					new BigDecimal(numX), 6, RoundingMode.HALF_UP);
			System.out.println(result.floatValue());

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC117_B() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			int[] wkArray = new int[numN];
			for (int i = 0; i < numN; i++) {
				wkArray[i] = scanner.nextInt();
			}

			Arrays.sort(wkArray);

			int max = 0;
			int others = 0;
			for (int i = numN - 1; i >= 0; i--) {
				if (i == numN - 1) {
					max = wkArray[i];
				} else {
					others += wkArray[i];
				}

			}
			System.out.println(max < others ? "Yes" : "No");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC117_C() {
		Scanner scanner = null;
		int numN = 0;
		int numM = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();
			if (numM == 1 && numN >= numM) {
				System.out.println(0);
				return;
			}
			int[] distArray = new int[numM];
			for (int i = 0; i < numM; i++) {
				distArray[i] = scanner.nextInt();
			}

			Arrays.sort(distArray);

			int moveDist = Math
					.abs((distArray[distArray.length - 1] - distArray[0])
							/ numN);

			int[] komaArray = new int[numN];

			int distTime = 0;
			int prevKomaNo = 0;
			for (int i = 0; i < distArray.length; i++) {
				if (i == 0) {
					komaArray[distTime] = distArray[i];
					prevKomaNo = distTime;
					distTime++;
					continue;
				}
				int distance = moveDist * distTime;
				if (distArray[komaArray[prevKomaNo]] + distance > distArray[i]) {
					komaArray[distTime] = distArray[i];
					prevKomaNo = distTime;
					distTime++;
					continue;
				}
				if (i == distArray.length - 1) {
					komaArray[komaArray.length - 1] = distArray[i];
				}
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC117_C2() {
		Scanner scanner = null;
		int numN = 0;
		int numM = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			numM = scanner.nextInt();
			if (numM == 1 && numN >= numM) {
				System.out.println(0);
				return;
			}
			int[] distArray = new int[numM];
			for (int i = 0; i < numM; i++) {
				distArray[i] = scanner.nextInt();
			}

			Arrays.sort(distArray);
			int[] sabunArray = new int[distArray.length - 1];

			for (int i = 0; i < sabunArray.length; i++) {
				sabunArray[i] = distArray[i + 1] - distArray[i];
			}

			Arrays.sort(sabunArray);

			int result = 0;
			for (int i = 0; i < numM - numN; i++) {
				result += sabunArray[i];
			}

			System.out.println(result);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void ABC117_D() {

	}
}