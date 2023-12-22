import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        Set<Integer> p = new HashSet<>();
        int[] count = new int[1000001];
        boolean[] isPrimeArray = isPrimeArray(1000000);
        boolean[] isDiv = new boolean[1000001];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.next());
            p.add(num);
            count[num]++;
            for (int j = num * 2; j <= 1000000; j += num) {
                isDiv[j] = true;
            }
        }
        // Collections.sort(p, Collections.reverseOrder());

        sc.close();

        // 主処理
        int result = 0;
        for (int num : p) {
            if (1 < count[num]) { // 同じ数が2つ以上ある場合
                continue;
            }
            if (isPrimeArray[num]) { // 素数の場合
                result++;
                continue;
            }

            if (!isDiv[num]) {
                result++;
            }
        }

        // 出力
        System.out.println(result);
    }

    static boolean[] isPrimeArray(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (!prime[i])
                continue;
            for (int j = 2; i * j <= n; j++) {
                prime[i * j] = false;
            }
        }
        return prime;
    }
}
