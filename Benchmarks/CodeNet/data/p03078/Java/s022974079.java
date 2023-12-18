import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();


        long[] A = new long[X];
        long[] B = new long[Y];
        long[] C = new long[Z];
        for (int i = 0; i < X; i++) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < Y; i++) {
            B[i] = sc.nextLong();
        }
        for (int i = 0; i < Z; i++) {
            C[i] = sc.nextLong();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        // ABの組み合わせの上位Kを取り出し
        // それとCの組み合わせを考える
        // O(XY) -> O(KZ)
        long[] AB = new long[X * Y];
        int index = 0;
        for (int x = 0; x < X; x++) {
            for (int y = 0; y < Y; y++) {
                AB[index++] = A[x] + B[y];
            }
        }

        Arrays.sort(AB);
        long[] ABC = new long[Math.min(3000, X * Y * Z)];
        index = 0;

        loop:
        for (int ab = AB.length - 1; ab >= Math.max(0, AB.length - K); ab--) {
            for (int z = 0; z < Z; z++) {
                ABC[index++] = AB[ab] + C[z];
                if (index == Math.min(3000, X * Y * Z)) {
                    break loop;
                }
            }
        }

        Arrays.sort(ABC);
        for (int k = ABC.length - 1; k > ABC.length - K - 1; k--) {
            out.println(ABC[k]);
        }
    }
}