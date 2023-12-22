import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    static int cnt = 0;
    static ArrayList<String> op = new ArrayList<>();
    static final int A = 0;
    static final int B = 1;
    static final int C = 2;
    static final int Zero = 3;
    static final int One = 4;
    static final int X = 5;
    static final int Y = 6;
    static int ptr = 7;
    static final int[] B_Bits = malloc(ptr, ptr += 31);
    static final int[] C_Bits = malloc(ptr, ptr += 62);

    public static void main(String[] args) throws Exception {
        // Ignore the special case: A = B = 0, because (0 < 0) = 0 and (0 + 0) = 0.

        PrepareZeroAndOne: {
            ad(A, B, C);                      // tmp <= A + B
            lt(Zero, C, One);                 // 1   <= (0 < A + B)
        }

        BtoBits: { // y = 0 => 2^(b_0) => 2^(b_0) + 2^(b_1) => ... => B (b_0 > b_1 > ...).
            for (int i = 30; i >= 0; i--) {
                setOne(C);
                shiftLeft(C, i);
                ad(Y, C, C);                  // tmp  <= y + 2^i
                lt(B, C, C);                  // tmp  <= B < tmp  (i.e. B <  y + 2^i)
                lt(C, One, C);                // tmp  <= !tmp     (i.e. B >= y + 2^i)
                ad(B_Bits[i], C, B_Bits[i]);  // b[i] <= tmp
                shiftLeft(C, i);              // tmp  <= tmp << i (i.e. if B >= y + 2^i then 2^i else 0)
                ad(Y, C, Y);                  // y    <= y + tmp
            }
        }
        

        Multiply: {
            for (int i = 30; i >= 0; i--) {
                setOne(C);
                shiftLeft(C, i);
                ad(X, C, C);                             // tmp  <= x + 2^i
                lt(A, C, C);                             // tmp  <= A < tmp  (i.e. A <  x + 2^i)
                lt(C, One, C);                           // tmp  <= !tmp     (i.e. A >= x + 2^i)
                ad(Zero, C, Y);                          // y    <= tmp
                shiftLeft(C, i);                         // tmp  <= tmp << i (i.e. if A >= x + 2^i then 2^i else 0)
                ad(X, C, X);                             // x    <= x + tmp
                for (int j = 0; j < 31; j++) {
                    and(Y, B_Bits[j], C);                // tmp    <= A[i] * B[j]
                    ad(C_Bits[i + j], C, C_Bits[i + j]); // C[i+j] <= C[i+j] + tmp
                }
            }
            clear(C);
            for (int i = 0; i < 62; i++) {
                shiftLeft(C_Bits[i], i);        // C[i] <= C[i] << (i+j)
                ad(C, C_Bits[i], C);            // C    <= C + C[i]
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

    static void setOne(int i) {
        lt(Zero, One, i);
    }

    static void clear(int i) {
        lt(i, i, i);
    }

    static void shiftLeft(int i, int shamt) {
        for (int k = 0; k < shamt; k++) {
            ad(i, i, i);
        }
    }

    static void and(int i, int j, int dst) {
        ad(i, j, dst);
        lt(One, dst, dst);
    }
}
