import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B;// = new ArrayList<Integer>();
        int N = sc.nextInt();
        int K = sc.nextInt();
        long ans = 0;
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        B = new ArrayList<Integer>(A);
        Collections.sort(B);
        // int base = 0;
        for (int i = 0; i < N; i++) {
            long base = 0;
            int num = A.get(i);
            for (int j = i + 1; j < N; j++) {
                if (num > A.get(j)) {
                    base++;
                }
            }

            // System.out.println(num + " b" + base);
            base *= K;
            base %= MOD;
            int ki = binary_search(num, B);
            // System.out.println(num + " k" + ki);
            BigInteger big = new BigInteger("1");
            big = big.multiply(new BigInteger(String.valueOf(K)));
            big = big.multiply(new BigInteger(String.valueOf(K-1)));
            big = big.multiply(new BigInteger(String.valueOf(ki)));
            big = big.divide(new BigInteger(String.valueOf(2)));
            big = big.mod(new BigInteger(String.valueOf(MOD)));
            // big.
            long pl = Long.parseLong(big.toString());
            // long pl = ki * K * (K - 1) / 2 % MOD;
            // pl %= MOD;
            // pl *= ki;
            // pl %= MOD;
            // pl /=2;

            // System.out.println(num + " b:" + base + " p:" + pl);

            ans += base;
            ans %= MOD;
            ans += pl;
            ans %= MOD;
        }
        System.out.println(ans);
    }

    static boolean isOK(int index, int key, ArrayList<Integer> list) {
        if (list.get(index) >= key)
            return true;
        else
            return false;
    }

    static int binary_search(int key, ArrayList<Integer> list) {
        int left = -1;
        int right = (int) list.size();
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (isOK(mid, key, list))
                right = mid;
            else
                left = mid;
        }
        return right;
    }
}