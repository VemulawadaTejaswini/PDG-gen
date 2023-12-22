import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    static int cnt = 0;
    static ArrayList<String> op = new ArrayList<>();
    static final int A = 0;
    static final int B = 1;
    static final int C = 2;
    static final int X = 3;
    static final int Y = 4;
    static final int[] B_Bits = malloc(5, 35);

    public static void main(String[] args) throws Exception {
        // System.setOut(new PrintStream(new File("out")));

        // Ignore the special case: A = B = 0, because (0 < 0) = 0, (0 + 0) = 0.

        lt(X, A, X);

        BtoBits: { // y = 0 => 2^(b_0) => 2^(b_0) + 2^(b_1) => ... => B (b_0 > b_1 > ...).
            for (int i = 29; i >= 0; i--) {
                clear(C);
                lt(C, A, C);
                shiftLeft(C, i);
                ad(Y, C, C);                  // tmp  <= y + 2^i
                lt(B, C, C);                  // tmp  <= B < tmp  (i.e. B <  y + 2^i)
                lt(C, X, C);                  // tmp  <= !tmp     (i.e. B >= y + 2^i)
                ad(B_Bits[i], C, B_Bits[i]);  // b[i] <= tmp
                shiftLeft(C, i);              // tmp  <= tmp << i (i.e. if B >= y + 2^i then 2^i else 0)
                ad(Y, C, Y);                  // y    <= y + tmp
            }
        }
        
        clear(C);
        clear(X);

        Multiply: {
            for (int i = 29; i >= 0; i--) {
                clear(B);
                lt(B, A, B);
                shiftLeft(B, i);
                ad(X, B, B);                             // tmp  <= x + 2^i
                lt(A, B, B);                             // tmp  <= A < tmp  (i.e. A <  x + 2^i)
                clear(Y);
                lt(Y, A, Y);
                lt(B, Y, B);                             // tmp  <= !tmp     (i.e. A >= x + 2^i)
                clear(Y);                                // A[i] <= 0
                ad(Y, B, Y);                             // A[i] <= tmp
                shiftLeft(B, i);                         // tmp  <= tmp << i (i.e. if A >= x + 2^i then 2^i else 0)
                ad(X, B, X);                             // x    <= x + tmp
                for (int j = 0; j < 30; j++) {
                    and(Y, B_Bits[j], B);                // tmp    <= A[i] * B[j]
                    shiftLeft(B, i + j);                 // S[i+j] <= S[i+j] + tmp
                    ad(C, B, C);
                }
            }
        }

        System.out.println(cnt);
        op.forEach(System.out::println);
    }

    static int[] malloc(int from, int to) {
        int[] mem = new int[to - from];
        Arrays.setAll(mem, i -> from + i);
        return mem;
    }

    static void lt(int i, int j, int dst) {
        cnt++;
        op.add(String.format("< %d %d %d", i, j, dst));
    }

    static void ad(int i, int j, int dst) {
        cnt++;
        op.add(String.format("+ %d %d %d", i, j, dst));
    }

    static void clear(int i) {
        lt(i, i, i);
    }

    static void shiftLeft(int i, int shamt) {
        for (int k = 0; k < shamt; k++) ad(i, i, i);
    }

    static void and(int i, int j, int dst) {
        lt(i, j, dst);
        lt(dst, j, dst);
    }
}
