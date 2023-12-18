import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] list = new long[n];

        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }

        Arrays.sort(list);

        long[] constant = new long[n];

        for (int i = k - 1; i < constant.length ; i++) {
            constant[i] = calcNumOfCombination(i, k - 1) % 1000000007;
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long min = constant[n - i - 1];
            long max = constant[i];
            long gap = max - min;
            ans += list[i] * (gap) % 1000000007;
            ans %= 1000000007;
        }

        System.out.println(ans);
    }

    //組み合わせの数nCrを計算
    private static long calcNumOfCombination(long n, long r){
        long num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}