
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		//		new Main().solveB();
		new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		String line = "";

		try {
			scanner = new Scanner(System.in);
			line = scanner.nextLine();

			char[] wkArray = line.toCharArray();
			StringBuffer buf = new StringBuffer();
			for (int i = 0; i < wkArray.length; i++) {
				switch (wkArray[i]) {
				case '1':
					buf.append(9);
					break;
				case '9':
					buf.append(1);
					break;
				default:
					buf.append(wkArray[i]);
					break;
				}

			}

			System.out.println(buf.toString());

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		String line = "";

		try {
			scanner = new Scanner(System.in);
			line = scanner.nextLine();
			int start = Integer.parseInt(line);

			for (int outer = start; outer <= 999; outer++) {
				char[] wkArray = Integer.toString(outer).toCharArray();

				if (wkArray[0] == wkArray[1] && wkArray[1] == wkArray[2]) {
					System.out.println(outer);
					return;
				}
			}

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			int[] wkArray = new int[numN];
			Set<Integer> wkSet = new HashSet<Integer>();

			for (int i = 0; i < numN; i++) {
				wkArray[i] = scanner.nextInt();
				wkSet.add(wkArray[i]);
			}

			if (wkSet.size() <= 1) {
				System.out.println(numN / 2);
				return;
			}

			Set<Integer> wkSet1 = new HashSet<Integer>();
			for (int outer = 0; outer < numN; outer = outer + 2) {
				wkSet1.add(wkArray[outer]);
			}
			int result1 = wkSet1.size() == 1 ? 0 : wkSet1.size() - 1;
			Set<Integer> wkSet2 = new HashSet<Integer>();
			for (int outer = 1; outer < numN; outer = outer + 2) {
				wkSet2.add(wkArray[outer]);
			}
			int result2 = wkSet2.size() == 1 ? 0 : wkSet2.size() - 1;
			System.out.println(result1 + result2);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;
		int lineCA = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}