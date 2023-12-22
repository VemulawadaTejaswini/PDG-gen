import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            int N = Integer.parseInt(sc.next());
            long[] a = new long[N];
            for (int i = 0; i < N; i++) {
                a[i] = Long.parseLong(sc.next());
                if (a[i] == 0) {
                    System.out.println(0);
                    return;
                }
            }

            // Calc
            long total = 1L;
            long LIMIT = 1000000000000000000L;
            for (int i = 0; i < N; i++) {
                long mul = total * a[i];
                if (mul / a[i] != total || mul > LIMIT)  {
                    total = -1;
                    break;
                }
                total = mul;
            }
            System.out.println(total);
        }
    }
}
