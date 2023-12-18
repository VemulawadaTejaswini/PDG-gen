
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		String date = "";

		try {
			scanner = new Scanner(System.in);
			date = scanner.next();
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date uDate = sdFormat.parse(date);
			Date tDate = sdFormat.parse("2019/04/30");

			int diff = tDate.compareTo(uDate);
			if (diff == 0) {
				System.out.println("Heisei");
			} else if (diff > 0) {
				System.out.println("Heisei");
			} else {
				System.out.println("TBD");
			}

		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveB() {
		Scanner scanner = null;
		int numN = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();
			BigDecimal[] wkKane = new BigDecimal[numN];
			String[] wkNaiyo = new String[numN];

			BigDecimal[] wkRes = new BigDecimal[numN];
			BigDecimal rate = new BigDecimal("380000.0");
			for (int i = 0; i < numN; i++) {
				wkKane[i] = new BigDecimal(scanner.next());
				wkNaiyo[i] = scanner.next();
				if (wkNaiyo[i].equals("BTC")) {
					wkRes[i] = wkKane[i].multiply(rate);
				} else {
					wkRes[i] = wkKane[i];
				}

			}

			BigDecimal res = BigDecimal.ZERO;
			for (int i = 0; i < wkRes.length; i++) {
				res = res.add(wkRes[i]);
			}

			System.out.println(res.setScale(0, RoundingMode.HALF_UP).doubleValue());

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveC() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;
		int numS = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private void solveD() {
		Scanner scanner = null;
		int numN = 0;
		int numK = 0;
		int numS = 0;

		try {
			scanner = new Scanner(System.in);
			numN = scanner.nextInt();

			System.out.println("");

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
}