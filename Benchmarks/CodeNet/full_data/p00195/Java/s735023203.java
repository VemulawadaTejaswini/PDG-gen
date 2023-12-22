import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * What is the Most Popular Shop in Tokaichi?
 */
public class Main {

	static char[] names = { 'A', 'B', 'C', 'D', 'E' };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		short[] sales = null;
		short sale, idx, max;
		while (!(line = br.readLine()).equals("0 0")) {
			sales = new short[5];
			
			sale = Short.parseShort(line.substring(0, line.indexOf(' ')));
			sale += Short.parseShort(line.substring(line.indexOf(' ') + 1));
			sales[0] = sale;
			idx = 0;
			max = sales[0];

			for (short i = 1; i < 5; i++) {
				line = br.readLine();
				sale = Short.parseShort(line.substring(0, line.indexOf(' ')));
				sale += Short.parseShort(line.substring(line.indexOf(' ') + 1));
				sales[i] = sale;
				if (sale > max) {
					max = sale;
					idx = i;
				}
			}
			System.out.println(names[idx] + " " + sales[idx]);
		}

	}

}