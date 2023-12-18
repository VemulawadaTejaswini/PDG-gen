import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BigDecimal M = new BigDecimal(1_000_000_000 + 7);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = Integer.parseInt(reader.readLine());

        BigDecimal result = BigDecimal.ONE;

        for (int index = 1; index <= i; index++) {
            result = result.multiply(new BigDecimal(index));
            if (result.compareTo(M) >= 0) {
                result = result.divideAndRemainder(M)[1];
            }
        }

        System.out.println(result.longValue());


//        PrintWriter writer = new PrintWriter(System.out);
//
//        writer.close();


    }
}
