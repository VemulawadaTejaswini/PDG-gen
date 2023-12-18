import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int n;
    long[] a;
    void run() {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
        }
        long count = 0;
        while(!check()) {
            Arrays.sort(a);
            long add = a[n-1] / n;
            a[n-1] %= n;
            for (int i = 0; i < n-1; i++)
                a[i] += add;
            count += add;
        }
        System.out.println(count);
    }
    boolean check() {
        boolean flg = false;
        for (int i = 0; i < n; i++) {
            if (a[i] >= n) {
                return false;
            } else if (a[i] == n - 1) {
                flg = true;
            }
        }
        return flg;
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
