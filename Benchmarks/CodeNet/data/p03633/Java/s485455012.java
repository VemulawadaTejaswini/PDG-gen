import java.util.Scanner;

public class Main {

    private static double lcmd(double m, double n) {
        return m * n / gcdd(m, n);
    }

    private static double gcdd(double m, double n) {
        double r;
        while (n > 0) {
            r = (long)m % (long)n;
            m = n;
            n = r;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] mn = new long[n];
        double d = 1;
        long max = 0;
        for (int i = 0; i < n; i++) {
            mn[i] = sc.nextLong();
            if (i == 0) {
                d = mn[0];
            } else {
                d = lcmd(d, mn[i]);
            }
            max = (mn[i] > max) ? mn[i] : max;
        }

        boolean w = true;
        for (int i = 0; i < n; i++) {
            if (max % mn[i] != 0) {
                w = false;
                break;
            }
        }

        System.out.println(w ? max : (long)d);
    }

}
