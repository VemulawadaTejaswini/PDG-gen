import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long    a  = Long.parseLong(sc.next());
        double  b  = Double.parseDouble(sc.next());

        System.out.println((a * (int) (b * 100)) / 100);
    }
}
