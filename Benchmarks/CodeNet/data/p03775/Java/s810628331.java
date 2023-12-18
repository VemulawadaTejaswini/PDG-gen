import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long r = 1000000000;
        for (long a = 1; a <= N; a++) {
            if (N % a == 0) {
                long b = N / a;
                long m = Math.max(a, b);
                if (m < r) r = m;
            }
        }
        System.out.println(String.valueOf(r).length());
    }
}