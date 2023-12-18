import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {
    public static void main(String... args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigDecimal N = new BigDecimal(br.readLine());
        int n = N.intValue();
        BigDecimal result = new BigDecimal(n % 2 == 0 ? n/2 : (n/2) + 1).divide(new BigDecimal(n), 7, BigDecimal.ROUND_CEILING);
        System.out.println(result);
    }
}
