
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		new Main().solveA();
		new Main().solveB();
		// new Main().solveC();
		// new Main().solveD();
	}

	private void solveA() {
		Scanner scanner = null;
		int lineAB = 0;
		int lineBC = 0;

		try {
			scanner = new Scanner(System.in);
			lineAB = scanner.nextInt();
			lineBC = scanner.nextInt();

			if (lineBC % lineAB == 0) {
				System.out.println(lineAB + lineBC);
			} else {
				System.out.println(lineBC - lineAB);
			}

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int nNin = 0;
		int mSyurui = 0;

		try {
			scanner = new Scanner(System.in);
			String line1 = scanner.nextLine();
			String[] wkStr1 = line1.split(" ");
			nNin = Integer.parseInt(wkStr1[0]);
			mSyurui = Integer.parseInt(wkStr1[1]);

			List<List<Integer>> wkList = new ArrayList<List<Integer>>();

			for (int i = 0; i < nNin; i++) {
				String wk = scanner.nextLine();
				String[] wkStr = wk.split(" ");
				List<Integer> wkInnerList = new ArrayList<Integer>();
				for (int j = 1; j < wkStr.length; j++) {
					wkInnerList.add(Integer.parseInt(wkStr[j]));
				}
				wkList.add(wkInnerList);
			}

			int result = 0;
			List<Integer> alreadyFinishList = new ArrayList<Integer>();
			for (int i = 0; i < wkList.size(); i++) {
				List<Integer> wkInnerList = wkList.get(i);
				for (int i2 = 0; i2 < wkInnerList.size(); i2++) {
					int syokuNum = wkInnerList.get(i2);
					if (alreadyFinishList.contains(syokuNum)) {
						continue;
					}
					if (isContain(nNin, wkList, i, syokuNum)) {
						result++;
					}
					alreadyFinishList.add(syokuNum);
				}

			}
			System.out.println(result);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private boolean isContain(int nNin, List<List<Integer>> wkList, int i, int syokuNum) {
		int result = 0;
		for (int j = 0; j < nNin; j++) {
			if (i == j || j >= wkList.size()) {
				continue;
			}

			List<Integer> wkSarchList = wkList.get(j);
			if (wkSarchList.contains(syokuNum)) {
				result++;
			}

		}
		return result == nNin - 1;
	}

	private void solveC() {
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