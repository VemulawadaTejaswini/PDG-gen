import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        int[] revA = new int[N];
        long dist = 0;
        long revDist = 0;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < N - 1; i++) {
            dist += Math.abs(A[i + 1] - A[i]);
        }

        revA[0] = A[N - 1];
        for (int i = 1; i < N; i++) {
            revA[i] = A[i - 1] + K;
        }

        for (int i = 0; i < N - 1; i++) {
            revDist += Math.abs(revA[i + 1] - revA[i]);
        }

        PrintWriter out = new PrintWriter(System.out);
        if (dist < revDist) {
            out.println(dist);
        } else {
            out.println(revDist);
        }

        out.flush();
        sc.close();
    }
}