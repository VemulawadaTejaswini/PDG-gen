import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        Set<Integer>[] set = new HashSet[n];

        int gcd = a[0];

        PrimeFact primeFact = new PrimeFact(1000001);
        for (int i=0; i<n; i++) {
            set[i] = primeFact.query(a[i]);
//            System.out.print(map[i]);
            gcd = gcd(gcd, a[i]);

        }

        long mapSum = 0;
        for (int i=0; i<n; i++) {
            mapSum += set[i].size();
        }

        Set<Integer> keySet = new HashSet<>();
        for (int i=0; i<n; i++) {
            for (Integer key: set[i]) {
                keySet.add(key);
            }
        }

//        System.out.print(mapSum);
//        System.out.print(keySet.size());

        if ((mapSum == keySet.size())) {
            System.out.print("pairwise coprime");
            return;
        }


        if (gcd == 1) {
            System.out.print("setwise coprime");
            return;
        }

        System.out.print("not coprime");

    }

    int gcd(int c, int d) {
        if (c < d) return gcd(d, c);
        if (d == 0) return c;
        return gcd(d, c % d);
    }

    class PrimeFact {
        int[] spf;
        PrimeFact(Integer n) {
            init(n);
        }
        void init(int n) {
            spf = new int[n+1];
            for (int i=0; i<=n; i++) spf[i] = i;
            int sqrt = (int)Math.sqrt(n);
            for (int i=2; i<=sqrt+1; i++) {
                if (spf[i] == i) {
                    for (int j=i*i; j<=n; j+=i) {
                        if (spf[j] == j) {
                            spf[j] = i;
                        }
                    }
                }
            }
        }
        Set<Integer> query(Integer n) {
            Set<Integer> innerSet = new HashSet<>();
            while (n != 1) {
                innerSet.add(spf[n]);
                n /= spf[n];
            }
            return innerSet;
        }
    }

}

