import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Absolute Minima
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int Q = sc.nextInt();

            StringBuilder ans = new StringBuilder();

            List<Long> A = new ArrayList<>();
            long A_SUM = 0, A_LOWER = 0;
            long B = 0;

            for (int i = 0; i < Q; i++) {
                int c = sc.nextInt();
                if (c == 1) {
                    long a = sc.nextLong();
                    long b = sc.nextLong();

                    int pos = Collections.binarySearch(A, a);
                    if (pos < 0) {
                        pos = -(pos + 1);
                    }
                    A.add(pos, a);

                    A_SUM += a;
                    if (A.size() % 2 == 0) {
                        if (pos < A.size() / 2) {
                            A_LOWER += a - A.get(A.size() / 2);
                        }
                    } else {
                        if (pos <= A.size() / 2) {
                            A_LOWER += a;
                        }
                    }

                    B += b;
                } else {
                    int d = (A.size() % 2 == 0) ? (A.size() / 2) : (A.size() / 2 + 1);

                    long x = A.get(d - 1);
                    long y = (x * d - A_LOWER) + (A_SUM - A_LOWER - x * (A.size() - d)) + B;

                    ans.append(x + " " + y).append("\n");
                }
            }

            System.out.print(ans.toString());
        }
    }

}
