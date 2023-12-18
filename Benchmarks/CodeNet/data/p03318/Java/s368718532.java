import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        long k;
        try (Scanner cin = new Scanner(System.in)) {
            k = cin.nextLong();
        }

        long count = 0L;
        BigDecimal cur = BigDecimal.ONE;
        for (long l = 1; count < k; l++) {
            long denomi = Long.toString(l + 1).chars().map(x -> x - '0').sum();
            BigDecimal next = BigDecimal.valueOf(l + 1).divide(BigDecimal.valueOf(denomi));
            if (cur.compareTo(next) <= 0) {
                System.out.println(l);
                count++;
            }
            cur = next;
        }
    }
}