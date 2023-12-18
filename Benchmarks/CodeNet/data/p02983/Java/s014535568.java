import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final long L = Long.parseLong(sc.next());
        final long R = Long.parseLong(sc.next());
        sc.close();

        int min = Integer.MAX_VALUE;

        int m = (int)(L % 2019);
        int n = (int)(R % 2019);
        if (m>n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        for (long i=m; i<n; i++) {
            for (long j=i+1; j<=n; j++) {
                long mod = (i * j) % 2019;
                if (min>mod)
                    min = (int)mod;
            }
        }

        System.out.println(min);
    }
}