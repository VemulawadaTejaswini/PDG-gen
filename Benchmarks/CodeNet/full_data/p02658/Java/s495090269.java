import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal base = new BigDecimal("1");
        BigDecimal mm = new BigDecimal(Math.pow(10,18));

        for (int i = 0;i<n;++i)
        {
            BigDecimal a = sc.nextBigDecimal();
            base = a.multiply(a);
            if (base.compareTo(mm) > 0)
            {
                base = new BigDecimal(-1);
                break;
            }
        }

        System.out.println(base);
        sc.close();
    }
}