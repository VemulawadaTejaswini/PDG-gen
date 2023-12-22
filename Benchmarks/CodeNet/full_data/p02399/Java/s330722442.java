import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
	public static void main(String[] a) throws IOException {
		print();
	}

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.toString();
		String[] nums = line.split(",", 0);
		BigDecimal a = new BigDecimal(new Integer(nums[0]));
        BigDecimal b = new BigDecimal(new Integer(nums[1]));
        System.out.println(a.divideToIntegralValue(b).toPlainString() + " " + a.remainder(b).toPlainString() + " " + a.divide(b,10,RoundingMode.HALF_UP).toPlainString());

	}

}