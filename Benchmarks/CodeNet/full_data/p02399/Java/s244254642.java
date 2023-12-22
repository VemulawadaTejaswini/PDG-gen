import java.io.*;
import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] str = br.readLine().split("\\s+");
		
		BigDecimal a = new BigDecimal(str[0]);
		BigDecimal b = new BigDecimal(str[1]);
		
		int d	= a.divideToIntegralValue(b).intValue();
		int r	= a.remainder(b).intValue();
		float f	= a.divide(b, 6, BigDecimal.ROUND_HALF_UP).floatValue();
		
		sb.append(d).append(" ").append(r).append(" ").append(f);
		
		System.out.println(sb);
		
	}
}