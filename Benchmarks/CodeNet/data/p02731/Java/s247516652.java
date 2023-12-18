import java.util.*;
import java.math.BigDecimal;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int L = sc.nextInt();
        sc.close();
        double syo = L / 3, amari = L % 3;
        double V;
        if(amari > 0)
            V = syo * syo * (syo + amari);
        else
            V = syo * syo * syo;

        System.out.println(BigDecimal.valueOf(V).toPlainString());
    }
}