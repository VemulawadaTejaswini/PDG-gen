import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] ln = line.split(" ");
        BigDecimal a = new BigDecimal(new Integer(ln[0]));
        BigDecimal b = new BigDecimal(new Integer(ln[1]));
        System.out.println((a.divideToIntegralValue(b)).toString() + " " + (a.remainder(b)).toString() +" " + a.divide(b).toString());

    }
}