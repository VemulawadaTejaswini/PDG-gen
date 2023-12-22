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

        Map<Integer, Integer>[] map = new HashMap[n];

        int gcd = a[0];

        PrimeFact primeFact = new PrimeFact(1000001);
        for (int i=0; i<n; i++) {
            map[i] = primeFact.query(a[i]);
//            System.out.print(map[i]);
            gcd = gcd(gcd, a[i]);

        }

        long mapSum = 0;
        for (int i=0; i<n; i++) {
            mapSum += map[i].size();
        }

        Set<Integer> keySet = new HashSet<>();
        for (int i=0; i<n; i++) {
            for (Integer key: map[i].keySet()) {
                if (!keySet.add(key)) {
                    System.out.print("pairwise coprime");
                    return;
                }
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
        Map<Integer, Integer> query(Integer n) {
            Map<Integer, Integer> map = new HashMap<>();
            while (n != 1) {
                if (map.containsKey(spf[n])) {
                    int val = map.get(spf[n]) + 1;
                    map.put(spf[n], val);
                } else {
                    map.put(spf[n], 1);
                }
                n /= spf[n];
            }
            return map;
        }
    }

}

