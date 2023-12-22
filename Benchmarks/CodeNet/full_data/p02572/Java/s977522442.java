import java.util.Scanner;

// 解説を参考した
class Main{
    final static int MOD = (int)Math.pow(10, 9) + 7;

    static int[] cumulativeSum(int[] a) {
        int[] b = new int[a.length + 1];
        b[0] = 0;
        for(int i = 0; i < a.length; i++)
            b[i + 1] = (b[i] + a[i]) % MOD;

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i = 0; i < N; i++)
            a[i] = sc.nextInt();
        sc.close();

        int[] b = cumulativeSum(a);

        long sum = 0;
        for(int i = 0; i < N - 1; i++) {
            sum += ((long)a[i] * (long)Math.abs(b[N] - b[i + 1])) % MOD;
            sum %= MOD;
        }

        System.out.println(sum);
    }

}
