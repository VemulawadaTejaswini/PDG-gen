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

                    B += b;
                } else {
                    long x = (A.size() % 2 == 0) ? A.get(A.size() / 2 - 1) : A.get(A.size() / 2);

                    long y = B;
                    for (long a : A) {
                        y += Math.abs(x - a);
                    }

                    ans.append(x + " " + y).append("\n");
                }
            }

            System.out.print(ans.toString());
        }
    }

}
