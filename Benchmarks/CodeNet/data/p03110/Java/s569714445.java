import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();

		int yen = 0;
		double btc = 0;

		for(int i=0;i<n;i++) {
			String x = sc.next();
			String u = sc.next();

			switch(u) {
			case "JPY":
				yen += Integer.parseInt(x);
				break;
			case "BTC":
				btc += Double.parseDouble(x);
			break;
			}
		}

		out.println(BigDecimal.valueOf(yen + (btc*380000)).toPlainString());

		sc.close();
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
