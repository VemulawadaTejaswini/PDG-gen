import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        sc.close();

        long rn = (long) Math.sqrt(N);
        ArrayList<Integer> ans = new ArrayList<>();
        for (long i = 1; i <= rn; i++) {
            if (N % i != 0) {
                continue;
            } else {
                long j = N / i;
                ans.add(dig(i, j));
            }
        }
        Collections.sort(ans);
        System.out.println(ans.get(0));
    }

    private static int dig(long a, long b) {
        int ad = 0;
        while (a > 0) {
            a /= 10;
            ad++;
        }
        int bd = 0;
        while (b > 0) {
            b /= 10;
            bd++;
        }
        return Math.max(ad, bd);
    }
}
