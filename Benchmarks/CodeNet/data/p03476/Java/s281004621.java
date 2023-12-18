import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String INPUT = "";

    public static void main(String[] args) {
        InputStream is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());

        Scanner scanner = new Scanner(is);

        final int q = scanner.nextInt();
        List<LR> lr = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            lr.add(new LR(scanner.nextInt(), scanner.nextInt()));
        }

        boolean[] sieve = primeSieve(100000);
        List<Integer> ret = solve(sieve, lr);
        for (int r : ret) {
            System.out.println(r);
        }
    }

    static List<Integer> solve(boolean[] sieve, List<LR> lrList) {
        List<Integer> ret = new ArrayList<>();

        for (LR ele : lrList) {
            int count = 0;
            for (int i = ele.l; i <= ele.r; i += 2) {
                if (sieve[i] && sieve[(i + 1) / 2]) {
                    count++;
                }
            }
            ret.add(count);
        }
        return ret;
    }

    static class LR {
        int l;
        int r;

        LR(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    static boolean[] primeSieve(int n) {
        boolean[] isPrime = new boolean[n];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        isPrime[1] = false;
        int limit = (int) Math.ceil(Math.sqrt(n));
        for (int i = 2; i < limit; i++) {
            for (int j = 2; j * i < n; j++) {
                isPrime[j * i] = false;
            }
        }
        return isPrime;
    }
}
