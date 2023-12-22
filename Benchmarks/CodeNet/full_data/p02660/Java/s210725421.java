import java.util.*;

public class Main {

    private static final int[] lp = new int[1000000 + 1];
    private static final List<Integer> pr = new ArrayList<>();

    static  {
        for (int i = 2; i <= 1000000; ++i) {
            if (lp[i] == 0) {
                lp[ i] = i;
                pr.add(i);
            }
            for (int j = 0; j < pr.size() && pr.get(j) <= lp[i] && i*pr.get(j) <= 1000000; ++j) {
                lp[i * pr.get(j)] = pr.get(j);
            }
        }
    }

    public static void main (String[] args) {

        final Scanner in = new Scanner(System.in);

        long N = in.nextLong();

        final long B = (long)Math.sqrt(N) + 1;
        long count = 0;

        for (int z = 2; z <= Math.min(B, 1000000); ++z) {
            if (primePower(z) && (N > 0) && (N % z == 0)) {
                count++;
                N = N/z;
            }
        }

        if (count == 0 && N > 1) { // N is prime!
            System.out.println(1);
        } else {
            System.out.println(count);
        }
    }

    private static boolean primePower(int z) {
        final int div = lp[z];
        while (z > 0 && (z % div == 0)) {
            z = z/div;
        }
        return z == 1;
    }
}