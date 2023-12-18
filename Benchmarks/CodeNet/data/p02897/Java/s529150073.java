import java.math.BigDecimal;

public class Main {
    public static void main(String... args){
        int n = 5;
        int m;
        if(n % 2 == 0){
            m = n/2;
        } else {
            m = (n/2) + 1;
        }
        BigDecimal devided = new BigDecimal(m);
        BigDecimal devider = new BigDecimal(n);
        BigDecimal result = devided.divide(devider, 7, BigDecimal.ROUND_CEILING);

        System.out.println(result);
    }
}
