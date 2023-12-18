import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    static long mod = 1000000007;

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2 ; i <= 1000 ; i++) {
            if (isPrime(i)) primeList.add(i);
        }
        List<Map<Integer, Integer>> kk = new ArrayList<Map<Integer,Integer>>();
        Map<Integer, Integer> num = new HashMap<>();
        int[] primeArray = new int[1000007];

        for (int i = 0 ; i < n ; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int b = a[i];
            for (Integer j : primeList) {
                while (b % j == 0) {
                    if (map.containsKey(j)) {
                        map.put(j, map.get(j) + 1);
                    } else {
                        map.put(j, 1);
                    }
                    b /= j;
                }
            }
            if (b != 1) {
                map.put(b, 1);
            }
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();
                primeArray[key] = Math.max(primeArray[key], value);
            }
        }
        long ans = 0;
        long start =  System.currentTimeMillis();
        for (int i = 0 ; i < n ; i++) {
            long z = 1l;
            int b = a[i];
            for (int p : primeList) {
                int cnt = 0;
                if (primeArray[p] > 0) {
                    while (b % p == 0) {
                        b /= p;
                        cnt++;
                    }
                    z *= pow(p, primeArray[p] - cnt);
                    z %= mod;
                }
            }

//            for (Entry<Integer, Integer> entry : num.entrySet()) {
//                Integer key = entry.getKey();
//                Integer value = entry.getValue();
//                if (kk.get(i).containsKey(key)) {
//                    z *= pow(key, value - kk.get(i).get(key));
//                    z %= mod;
//                } else {
//                    z *= pow(key, value);
//                    z %= mod;
//                }
//            }
            ans += z % mod;
        }
        long goal =  System.currentTimeMillis();
        System.out.println(ans % mod);

    }

    static boolean isPrime(int i) {
        for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    static long pow (long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                sum = sum * x % mod;
            }
            x = x * x % mod;
            n >>= 1;
        }
        return sum;
    }

}