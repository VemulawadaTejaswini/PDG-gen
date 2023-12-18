import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        if(X == 2 || X == 3) System.out.println(X);
        else System.out.println(getPrimeNumber(X));
    }

    public static int getPrimeNumber(int x) {
        int ptr = 0; // 素数の個数
        int[] prime = new int[(x / 2) + 1];// 素数を格納

        prime[ptr++] = 2; // 2は素数
        prime[ptr++] = 3; // 3は素数

        boolean flg = false;
        int r = x;
        for(int n = 5; n <= Math.pow(10, 5) + 3; n+=2) { // 対象は奇数のみ(偶数は2で割り切れるため)
            boolean f = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++) { // prime[i]の2乗がn以下であるか
                if(n % prime[i] == 0) {
                    f = true;
                    break; // 割り切れると素数ではないため繰り返し処理を抜ける
                }
            }
            if(!f) {
                prime[ptr++] = n; // 素数をとして配列に設定
                if(!flg && n >= x) {
                    r = n;
                    break;
                }
            }
        }
        return r;
    }
}