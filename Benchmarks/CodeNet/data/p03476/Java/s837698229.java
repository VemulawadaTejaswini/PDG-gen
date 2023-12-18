import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();

        int[] l = new int[Q];
        int[] r = new int[Q];
        for (int i = 0; i < Q; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        List<Integer> primes = sieveOfEratosthenes(10000);

        boolean[] isPrime = new boolean[10001];
        for (int p : primes) {
            isPrime[p] = true;
        }

        int[] cnt = new int[10001];
        for (int i = 0; i < cnt.length; i++) {
            if (isPrime[i] && (i + 1) % 2 == 0 && isPrime[(i + 1) / 2]) {
                cnt[i]++;
            }
        }

        for (int i = 1; i < cnt.length; i++) {
            cnt[i] += cnt[i - 1];
        }

        for (int i = 0; i < Q; i++) {
            out.println(cnt[r[i]] - cnt[l[i] - 1]);
        }
    }


    public static List<Integer> sieveOfEratosthenes(int max) {
        List<Integer> primes = new ArrayList<Integer>();

        int prime;
        int max_check = (int) Math.floor(Math.sqrt(max));   //ふるい落としのチェックに利用する値
        List<Integer> nums = new ArrayList<Integer>();     //素数候補
        for (int i = 2; i <= max; i++) {
            nums.add(i);
        }


        while (true) {
            // ふるい落とした先頭は素数
            if (nums.size() < 2) {
                break;
            }
            prime = nums.get(0);

            // ふるい落としのチェックに利用する値は最大値の平方根未満の最大値
            if (prime >= max_check) {
                break;
            }

            primes.add(prime);

            // primeでふるい落とし
            List<Integer> rest_nums = new ArrayList<Integer>();
            for (int n : nums) {
                if (n % prime != 0) {
                    rest_nums.add(n);
                }
            }

            // ふるい落とした候補に更新
            nums = rest_nums;
        }

        //残っている候補は素数
        for (int n : nums) {
            primes.add(n);
        }

        return primes;
    }

}