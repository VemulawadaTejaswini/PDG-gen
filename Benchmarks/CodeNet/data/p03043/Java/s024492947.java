import java.math.*;
import java.util.*;

public class Main {
    static double per(int n, int i, int k) {
        int cnt = 0;

        while (true) {
            if (i > k)
                break;
            i *= 2;
            cnt++;
        }
        return 1 / (n * Math.pow(2, cnt));
    }

    static double cnt(int k) {
        double cnt = 0;
        double tmp = 1;
        while (true) {
            if (tmp > k)
                break;
            tmp *= 2;
            cnt++;
        }
        return cnt;
    }

    static double fromcnt(double a) {
        double tmp = 0;
        double tmp2 = 1;
        for (int i =1; i < a; i++) {
            tmp += tmp2;
            tmp2 *= 2;
        }
        return tmp;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double base = (double) n * Math.pow(2, cnt(k));
        double tmp = fromcnt(cnt(k));
        if (n > k)
            tmp += (n - k) * Math.pow(2, cnt(k));
        System.out.println(tmp/base);
    }
}
