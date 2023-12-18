import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer[] a = new Integer[N];
        int pA = 0;
        int pB = 0;
        int result = 0;
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(a, Collections.reverseOrder());

        // Aliceの点数
        for (int i = 0; i < N; i += 2) {
            pA += a[i];
            if (N > i + 1) {
                pB += a[i + 1];
            }
        }

        result = pA - pB;

        PrintWriter out = new PrintWriter(System.out);
        out.println(result);

        sc.close();
        out.flush();
    }
}