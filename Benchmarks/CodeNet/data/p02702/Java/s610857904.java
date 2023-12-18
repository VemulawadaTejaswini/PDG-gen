import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = 2019;

    Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        char[] arr = sc.next().toCharArray();
        int len = arr.length;
        int sumMod = 0;
        for (int i=len-1; 0<=i; i--) {
            int tmp = arr[i] - '0';
            tmp *= modPow(10, len-1-i);
            sumMod += tmp;
            sumMod %= MOD;
            if (map.containsKey(sumMod)) {
                int val = map.get(sumMod);
                map.put(sumMod, val+1);
            } else {
                map.put(sumMod, 1);
            }
        }

        long ans = 0;

        for (Integer t: map.values()) {
            ans += t * (t - 1) / 2;
        }

        System.out.println(ans + ((map.get(0)==null) ? 0 : map.get(0)));
//        System.out.println(map);
    }

    int modPow(int x, int n) {
        int sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                sum *= x;
                sum %= MOD;
            }
            x *= x;
            x %= MOD;
            n >>= 1;
        }
        return sum % MOD;
    }

}
