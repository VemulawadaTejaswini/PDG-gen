import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.*;

public class Main{
	public static void main(String[] args)throws Exception{
		Bufferdreader br = new Bufferdreade(new InputStreamReader(Sydtem.in));
		String line = br.readLine();
		String[] in = line.split(" ");
		BigDecimal a = new BigDecimal(new Integer(ln[0]));
		BigDecimal b = new BigDecimal(new Integer(ln[1]));
		System.out.println(a.divideToIntegralValue(b).toPlainString() + " " + a.remainder(b).toPlainString() + " " a.divide(b,10,RoundingMode.HALF_UP).toPlainString());
	}
}