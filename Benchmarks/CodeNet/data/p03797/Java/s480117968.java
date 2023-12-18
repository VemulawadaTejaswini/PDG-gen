import java.math.BigDecimal;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long N = sc.nextLong(); // s
        long M = sc.nextLong(); // c

        long sccCount = M / 2; // scc max

        while (N < sccCount) {
            M = M - 2;
            N++;
            sccCount = M / 2;
        }

        System.out.println(sccCount);
    }
}