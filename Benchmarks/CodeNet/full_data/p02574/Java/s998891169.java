
import java.io.PrintWriter;
import java.util.*;

public class Main {



    int gcd(int m, int n) {
        if (m < n) return gcd(n, m);
        if (n == 0) return m;
        return gcd(n, m % n);
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        boolean existsOne = false;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 1) {
                if (existsOne) {
                    continue;
                }
                existsOne = true;
            }
            list.add(a);
        }

        int gcd = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            gcd = gcd(list.get(i), gcd);
        }

        if (gcd != 1) {
            System.out.println("not coprime");
            return;
        }


        if (list.size() > 80000) { // num of primes
            System.out.println("setwise coprime");
            return;
        }


        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) { // 8 * 10^4
            int a = list.get(i);
            for (int j = 1; j * j <= a; j++) { // 10 ^2
                if (a % j == 0) {
                    if (j != 1) {
                        if (set.contains(j)) {
                            System.out.println("setwise coprime");
                            return;
                        }
                        set.add(j);
                    }
                    int k = a / j;
                    if (k != j) {
                       if (set.contains(k)) {
                           System.out.println("setwise coprime");
                           return;
                       }
                       set.add(k);
                    }
                }
            }
        }
        System.out.println("pairwise coprime");


        // out.println("Hello World");
        out.flush();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
