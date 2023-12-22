import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Dice {

	public static void main(String[] args)
			throws Exception, IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int cycle = Integer.parseInt(br
				.readLine());
		int currentNumber = 1;
		int frontNumber = 2;
		int[] currentFront = new int[2];
		currentFront[0] = currentNumber;
		currentFront[1] = frontNumber;
		int total = 1;
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < cycle; i++) {
			judge(br.readLine(), currentFront);
			total += currentFront[0];
		}
		System.out.println(total);
	}

	private static void judge(String string,
			int[] currentFront) {

		if (Dicer.North.name().equals(string)) {
			int current = currentFront[0];
			currentFront[0] = currentFront[1];
			currentFront[1] = 7 - current;
			return;
		}

		if (Dicer.South.name().equals(string)) {
			int current = currentFront[0];
			currentFront[0] = 7 - currentFront[1];
			currentFront[1] = current;
			return;
		}

		if (Dicer.West.name().equals(string)) {
			currentFront[0] = rightSideNumberIs(
					currentFront[0],
					currentFront[1]);
			return;
		}

		if (Dicer.East.name().equals(string)) {
			currentFront[0] = 7
					- rightSideNumberIs(
							currentFront[0],
							currentFront[1]);

		}

		if (Dicer.Left.name().equals(string)) {
			currentFront[1] = 7
					- rightSideNumberIs(
							currentFront[0],
							currentFront[1]);
		}

		if (Dicer.Right.name().equals(string)) {
			currentFront[1] = rightSideNumberIs(
					currentFront[0],
					currentFront[1]);
		}

	}

	private static int rightSideNumberIs(
			int currentNumber, int frontNumber) {
		int returnNumber = 0;
		if (currentNumber == 1) {
			switch (frontNumber) {
			case 2:
				returnNumber = 3;
				break;
			case 3:
				returnNumber = 5;
				break;
			case 4:
				returnNumber = 2;
				break;
			case 5:
				returnNumber = 4;
				break;
			}
		}

		if (currentNumber == 2) {
			switch (frontNumber) {
			case 1:
				returnNumber = 4;
				break;
			case 3:
				returnNumber = 1;
				break;
			case 6:
				returnNumber = 3;
				break;
			case 4:
				returnNumber = 6;
				break;
			}
		}

		if (currentNumber == 3) {
			switch (frontNumber) {
			case 2:
				returnNumber = 6;
				break;

			case 1:
				returnNumber = 2;
				break;
			case 5:
				returnNumber = 1;
				break;
			case 6:
				returnNumber = 5;
				break;
			}
		}

		if (currentNumber == 4) {
			switch (frontNumber) {
			case 1:
				returnNumber = 5;
				break;

			case 5:
				returnNumber = 6;
				break;

			case 6:
				returnNumber = 2;
				break;
			case 2:
				returnNumber = 1;
				break;
			}
		}

		if (currentNumber == 5) {
			switch (frontNumber) {
			case 1:
				returnNumber = 3;
				break;
			case 3:
				returnNumber = 6;
				break;
			case 6:
				returnNumber = 4;
				break;
			case 4:
				returnNumber = 1;
				break;
			}
		}

		if (currentNumber == 6) {
			switch (frontNumber) {
			case 2:
				returnNumber = 4;
				break;

			case 4:
				returnNumber = 5;
				break;
			case 5:
				returnNumber = 3;
				break;
			case 3:
				returnNumber = 2;
				break;
			}
		}
		return returnNumber;
	}

	enum Dicer {
		North, South, West, East, Left, Right
	}
}