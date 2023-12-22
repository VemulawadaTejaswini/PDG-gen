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
    static final int Reg = 7;
    static int ptr = 8;
    static final int[] Pows = malloc(ptr, ptr += 32);
    static final int[] A_Bits = malloc(ptr, ptr += 32);
    static final int[] B_Bits = malloc(ptr, ptr += 32);
    static final int[] C_Bits = malloc(ptr, ptr += 64);

    public static void main(String[] args) throws Exception {
        // Ignore the special case: A = B = 0, because (0 < 0) = 0 and (0 + 0) = 0.

        PrepareZeroAndOne: {
            ad(A, B, Reg);                      // tmp <= A + B
            lt(Zero, Reg, One);                 // 1   <= (0 < A + B)
        }

        PreparePowerOfTwo: { // calculates 2^i (i=0,...,31) and store to Pows[i].
            for (int i = 0; i < 32; i++) {
                setOne(Pows[i]);                // Pows[i] <= 1
                shiftLeft(Pows[i], i);          // Pows[i] <= Pows[i] << i
            }
        }

        AtoBits: { // x = 0 => 2^(a_0) => 2^(a_0) + 2^(a_1) => ... => A (a_0 > a_1 > ...).
            for (int i = 31; i >= 0; i--) {
                ad(X, Pows[i], Reg);            // tmp  <= x + 2^i
                lt(A, Reg, Reg);                // tmp  <= A < tmp  (i.e. A <  x + 2^i)
                lt(Reg, One, Reg);              // tmp  <= !tmp     (i.e. A >= x + 2^i)
                ad(A_Bits[i], Reg, A_Bits[i]);  // a[i] <= tmp
                shiftLeft(Reg, i);              // tmp  <= tmp << i (i.e. if A >= x + 2^i then 2^i else 0)
                ad(X, Reg, X);                  // x    <= x + tmp
            }
        }

        BtoBits: { // y = 0 => 2^(b_0) => 2^(b_0) + 2^(b_1) => ... => B (b_0 > b_1 > ...).
            for (int i = 31; i >= 0; i--) {
                ad(Y, Pows[i], Reg);            // tmp  <= y + 2^i
                lt(B, Reg, Reg);                // tmp  <= B < tmp  (i.e. B <  y + 2^i)
                lt(Reg, One, Reg);              // tmp  <= !tmp     (i.e. B >= y + 2^i)
                ad(B_Bits[i], Reg, B_Bits[i]);  // b[i] <= tmp
                shiftLeft(Reg, i);              // tmp  <= tmp << i (i.e. if B >= y + 2^i then 2^i else 0)
                ad(Y, Reg, Y);                  // y    <= y + tmp
            }
        }
        

        Multiply: {
            /**
             *     0111 = A[3:0]
             * ×   0111 = B[3:0]
             * --------
             *     0111 = (A[0] * [B[3], B[2], B[1], B[0]]) << 0
             *    0111  = (A[1] * [B[3], B[2], B[1], B[0]]) << 1
             *   0111   = (A[2] * [B[3], B[2], B[1], B[0]]) << 2
             *  0000    = (A[3] * [B[3], B[2], B[1], B[0]]) << 3
             * --------
             * 00012321 = C[7:0] (C[k] = Σ[i+j=k] A[i] * B[j])
             * 
             * 0111 * 0111 = 0*(2^7) + 0*(2^6) + 0*(2^5) + 1*(2^4) + 2*(2^3) + 3*(2^2) + 2*(2^1) + 1*(2^0)
             * 
             * Generally, A * B = Σ[k=0,63] (Σ[i+j=k] A[i] * B[j]) << k.
             */
            for (int i = 0; i < 32; i++) {
                for (int j = 0; j < 32; j++) {
                    and(A_Bits[i], B_Bits[j], Reg);        // tmp    <= A[i] * B[j]
                    ad(C_Bits[i + j], Reg, C_Bits[i + j]); // C[i+j] <= C[i+j] + tmp
                }
            }
            for (int i = 0; i < 64; i++) {
                shiftLeft(C_Bits[i], i);        // C[i+j] <= C[i+j] << (i+j)
                ad(C, C_Bits[i], C);            // C      <= C + C[i+j]
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
