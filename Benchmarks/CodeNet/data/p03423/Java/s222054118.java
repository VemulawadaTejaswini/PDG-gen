import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main{
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in))) {

			String in = br.readLine();
			BigDecimal n = new BigDecimal(in);
			BigDecimal di = new BigDecimal("3");
			@SuppressWarnings("deprecation")
			BigDecimal ans = n.divide(di,4, BigDecimal.ROUND_HALF_UP);
			System.out.println(ans.setScale(0,RoundingMode.DOWN));

		}
	}
}