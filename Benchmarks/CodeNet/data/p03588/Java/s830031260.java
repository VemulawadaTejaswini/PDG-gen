import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Integer[] A = new Integer[N];
        Integer[] B = new Integer[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
            B[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());

        for (int i = B[N - 1]; i > 0; i--) {
            A[N - 1]++;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(A[N - 1]);
        sc.close();
        out.flush();
    }
}