import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String buffer;
		try {
			while ((buffer = reader.readLine())  != null) {
				double r = Double.valueOf(buffer.substring(0, buffer.indexOf(" ") == -1 ? buffer.length() : buffer.indexOf(" ")));
				System.out.println(BigDecimal.valueOf(r * r * Math.PI).toPlainString() + " " + BigDecimal.valueOf(2 * r * Math.PI).toPlainString());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}