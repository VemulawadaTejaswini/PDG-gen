import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = K;
        }
        int Q = Integer.parseInt(sc.next());
        int[] A = new int[Q];
        for (int i = 0; i < Q; i++ ) {
            A[i] = Integer.parseInt(sc.next());
            for (int j = 0; j < N; j++) {
                if (j+1 != A[i]) {
                    scores[j]--;
                }
            }
        }
        sc.close();

        for (int i = 0; i < N; i++) {
            if (scores[i] > 0) {
                out.printf("Yes\n");
            } else {
                out.printf("No\n");
            }
        }
        out.flush();
    }
}
