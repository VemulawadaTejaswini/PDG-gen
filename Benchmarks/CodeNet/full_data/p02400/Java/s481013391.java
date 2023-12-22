import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        BigDecimal bm = new BigDecimal(line);
        BigDecimal circum = new BigDecimal(bm.toPlainString());
        circum = circum.multiply(new BigDecimal(2),MathContext.DECIMAL64).multiply(new BigDecimal(Math.PI),MathContext.DECIMAL64);
        BigDecimal area = bm.multiply(bm,MathContext.DECIMAL64).multiply(new BigDecimal(Math.PI),MathContext.DECIMAL64);

        circum = circum.setScale(6,BigDecimal.ROUND_HALF_UP);
        area = area.setScale(6,BigDecimal.ROUND_HALF_UP);
        System.out.println( area.toPlainString() + " " + circum.toPlainString());
    }
}