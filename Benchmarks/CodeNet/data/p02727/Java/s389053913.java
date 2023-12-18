import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] p = new int[A];
        int[] q = new int[B];
        int[] r = new int[C];
        for (int i=0; i<A; i++) {
            p[i] = sc.nextInt();
        }
        for (int i=0; i<B; i++) {
            q[i] = sc.nextInt();
        }
        for (int i=0; i<C; i++) {
            r[i] = sc.nextInt();
        }

        System.out.println(solve(X, Y, A, B, C, p, q, r));
    }

    private static long solve(int X, int Y, int A, int B, int C, int[] p, int[] q, int[] r) {
        long count = 0;

        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);

        for (int i=0; i<X; i++) {
            count += p[A-i-1];
        }
        for (int i=0; i<Y; i++) {
            count += q[B-i-1];
        }

        int idxP = A-X;
        int idxQ = B-Y;

        for (int i=C-1; i>=0; i--) {
            // System.err.println("i=" + i + ", idxP=" + idxP + ", idxQ=" + idxQ);
            if (idxP == A && idxQ == B) break;
            if (idxP == A) {
                if (q[idxQ] > r[i]) {
                    break;
                }
                // System.err.println("replace q[" + idxQ + "] = "  + q[idxQ] + " with r[" + i + "] = " + r[i]);
                count += r[i] - q[idxQ++];
            } else if (idxQ == B) {
                if (p[idxP] > r[i]) {
                    break;
                }
                // System.err.println("replace p[" + idxP + "] = "  + p[idxP] + " with r[" + i + "] = " + r[i]);
                count += r[i] - p[idxP++];
            } else {
                if (p[idxP] <= q[idxQ] && p[idxP] < r[i]) {
                    // System.err.println("replace p[" + idxP + "] = "  + p[idxP] + " with r[" + i + "] = " + r[i]);
                    count += r[i] - p[idxP++];
                } else if (p[idxP] > q[idxQ] && q[idxQ] < r[i]) {
                    // System.err.println("replace q[" + idxQ + "] = "  + q[idxQ] + " with r[" + i + "] = " + r[i]);
                    count += r[i] - q[idxQ++];
                }
            }
        }

        return count;
    }
}