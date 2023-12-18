import java.util.*;

public class Main {
    public static void main(String[] args) {

        // a[]の作成
        int[] a = new int[101010];
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        a[3] = 1;
        a[4] = 0;
        for (int i = 5; i < 101010; i++) {
            if (isLike2017(i)) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }

        // s[]：累積和の作成
        int[] s = new int[101011];
        s[0] = 0;
        for (int i = 1; i < 101011; i++) {
            s[i] = s[i - 1] + a[i - 1];
        }

        Scanner sc = new Scanner(System.in);
        int Q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < Q; i++) {
            String[] query = sc.nextLine().split(" ");
            int l = Integer.parseInt(query[0]);
            int r = Integer.parseInt(query[1]);
            System.out.println(s[r + 1] - s[l]);
        }

        sc.close();
    }

    // エラストテネスの篩
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isLike2017(int n) {
        int val = (n + 1) / 2;
        if (isPrime(n) && isPrime(val)) {
            return true;
        }
        return false;
    }

}
