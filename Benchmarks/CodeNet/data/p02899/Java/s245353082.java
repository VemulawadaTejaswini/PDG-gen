import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        for (int i = 0; i < N; i++ ) {
            A[i] = Integer.parseInt(sc.next());
        }

        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[A[i]-1] = i + 1;
        }
        for (int i = 0; i < N; i++) {
            if (i != 0) {
                out.print(" ");
            }
            out.printf("%d", B[i]);
        }
        out.printf("\n");
        out.flush();
    }
}
