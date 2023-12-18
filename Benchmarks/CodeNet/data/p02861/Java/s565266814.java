import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static class D {
        int x;
        int y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int maxn = 10;
        D[] d = new D[maxn];

        for (int i = 0; i < n; i++) {
            d[i] = new D();
            d[i].x = sc.nextInt();
            d[i].y = sc.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += dis(d[i],d[j]);
            }
        }
        System.out.println(sum*fac(n-1)/fac(n));

    }

    private static int fac(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    private static double dis(D d, D d1) {
        return Math.sqrt(Math.pow(d.x-d1.x,2)+Math.pow(d.y-d1.y,2));
    }
}
