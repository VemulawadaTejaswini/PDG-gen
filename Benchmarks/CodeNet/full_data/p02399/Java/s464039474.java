import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String[] arrStr;
		try {
			str = br.readLine();
			arrStr = str.split(" ");

			long a = Integer.parseInt(arrStr[0]);
			long b = Integer.parseInt(arrStr[1]);

			long d = a/b;
			long r = a%b;
			double f = (double)a/b;

			DecimalFormat df = new DecimalFormat("0.00000000");
			System.out.println(d+" "+r+" "+df.format(f));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}