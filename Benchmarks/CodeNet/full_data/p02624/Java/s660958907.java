import java.math.*;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    Map<Integer, Integer> map = new HashMap<>();


    public static void main(String[] args) {
        new Main().run();
    }

    long sum = 1;

    long[] cnt = new long[n+1];

    void run() {

        for (int i=1; i<=n; i++) {
            for (int j=i; j<=n; j+=i) {
                cnt[j]++;
            }
        }

        for (int i=2; i<=n; i++) sum += (long)i * cnt[i];

        System.out.print(sum);


    }
    Map<Integer, Integer> primes(int n) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        while (n >= 4 && n % 2 == 0) {
            list.add(2);
            n /= 2;
        }
        int d = 3;
        int q = n / d;
        while (q >= d) {
            if (n % d == 0) {
                list.add(d);
                n = q;
            } else {
                d += 2;
            }
            q = n / d;
        }
        list.add(n);

        for (int t: list) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }
        return map;

    }


}

