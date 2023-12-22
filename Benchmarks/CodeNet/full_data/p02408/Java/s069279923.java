import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		List<Integer> S = new ArrayList<>(Arrays.asList(14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14));
		List<Integer> H = new ArrayList<>(Arrays.asList(14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14));
		List<Integer> C = new ArrayList<>(Arrays.asList(14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14));
		List<Integer> D = new ArrayList<>(Arrays.asList(14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14));

		int n = scane.nextInt();

		String M = "";
		int num = 0;

		for (int i = 0; i < n; i++) {
			M = scane.next();
			num = scane.nextInt();

			switch (M) {
			case "S":
				S.set(num - 1, num);
				break;
			case "H":
				H.set(num - 1, num);
				break;
			case "C":
				C.set(num - 1, num);
				break;
			case "D":
				D.set(num - 1, num);
				break;

			default:
				break;
			}
		}
		for (int i = 0; i < 13; i++) {
			if ((i+1) == S.get(i)) {

			} else {
				System.out.println("S" + " " + (i+1));
			}

		}
		for (int i = 0; i < 13; i++) {
			if (i+1 == H.get(i)) {

			} else {
				System.out.println("H" + " " + (i+1));
			}

		}
		for (int i = 0; i < 13; i++) {
			if (i+1 == C.get(i)) {

			} else {
				System.out.println("C" + " " + (i+1));
			}

		}
		for (int i = 0; i < 13; i++) {
			if ((i+1) == D.get(i)) {

			} else {
				System.out.println("D" + " " + (i+1));
			}

		}


	}
}