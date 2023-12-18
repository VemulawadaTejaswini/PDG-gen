import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long p = sc.nextInt();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] s = sc.next().toCharArray();

        long ans = 0;

        long sumMod = 0;

        Map<Long, Long> map = new HashMap<>();

//        map.put((long)0, (long)1);

        if (p == 2 || p == 5) {
            for (int i=0; i<n; i++) {
                if ((s[i]-'0') % p == 0) ans += i + 1;
            }
//            for (int i=n-1; 0<=i; i--) {
//                if ((s[i]-'0') % p == 0) ans += i + 1;
//            }

            System.out.println(ans);
            return;
        }

        for (int i=n-1; 0<=i; i--) {
            long tmp = s[i] - '0';
            tmp *= modPow(10, n-1-i);
            tmp %= p;
            sumMod += tmp;
            sumMod %= p;
            if (map.containsKey(sumMod)) {
                map.put(sumMod, map.get(sumMod)+(long)1);
            } else {
                map.put(sumMod, (long)1);
            }
        }

//        System.out.println(map);

        for (Long t: map.values()) {
            ans += t * (t - 1) / 2;
        }

//        System.out.println(ans);

        if (map.get((long)0) == null) {
            System.out.println(ans);
        } else {
            System.out.println(ans + map.get((long)0));
        }


    }

    long modPow(long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ( (n & 1) == 1 ) {
                sum *= x;
                sum %= p;
            }
            x *= x;
            x %= p;
            n >>= 1;
        }
        return sum % p;
    }
}
