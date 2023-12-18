import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final long MOD = 1_000_000_007;

    private static int nextUnitAmida(int x) {
        int mask1 = 1;
        int mask2 = 3;
        ++x;
        for (;;) {
            int ck = x & mask2;
            if (ck == mask1) {
                break;
            } else if (ck == mask2) {
                x += mask1;
            } else {
                ;
            }
            mask1 <<= 1;
            mask2 <<= 1;
        }
        return x;
    }

    private static int[] createUnitAmida(int w) {
        List<Integer> uAmidas = new ArrayList<>();
        int x = 0;
        int limit = (1 << (w - 1));
        do {
            uAmidas.add(x);
            x = nextUnitAmida(x);
        } while (x < limit);

        int[] result = new int[uAmidas.size()];
        for (int i = 0; i < result.length; ++i) {
            result[i] = uAmidas.get(i);
        }
        return result;
    }

    private final int height;

    private final int width;

    private final int[] unitAmidas;

    private Main(int h, int w) {
        height = h;
        width = w;
        unitAmidas = createUnitAmida(w);
    }

    private long countIt(int h, int start, int goal) {
        if (h == 0) {
            return (start == goal ? 1 : 0);
        } else if (Math.abs(start - goal) > h) {
            return 0;
        }

        final int rMask = (1 << (start - 1));
        final int lMask = (rMask >> 1);

        int rCase = 0;
        int lCase = 0;
        int mCase = 0;

        for (int unitAmida : unitAmidas) {
            if ((unitAmida & rMask) != 0) {
                ++rCase;
            } else if ((unitAmida & lMask) != 0) {
                ++lCase;
            } else {
                ++mCase;
            }
        }

        int result = 0;
        if (rCase != 0) {
            result += (countIt(h - 1, start + 1, goal) * rCase) % MOD;
        }
        if (lCase != 0) {
            result += (countIt(h - 1, start - 1, goal) * lCase) % MOD;
        }
        result += (countIt(h - 1, start, goal) * mCase) % MOD;

        return result;
    }

    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out))
        {
            final int H = in.nextInt();
            final int W = in.nextInt();
            final int K = in.nextInt();

            long result = new Main(H, W).countIt(H, 1, K);
            out.println(result);
        }
    }
}
