import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(in);
        PrintWriter w = new PrintWriter(out);

        int n = sc.nextInt();

        int[] a = new int[n + 1];
        Number[] arr = new Number[n];

        int sum = 0;
        boolean hasNatural = false;

        for (int i = 0; i < n; i++) {
            a[i+1] = sc.nextInt();
            arr[i] = new Number(i+1, a[i+1]);
            sum += a[i+1];
            if(a[i+1] > 0) hasNatural = true;
        }

        if(!hasNatural) {
            w.println(0);
            w.close();
            System.exit(0);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.val != o2.val) return o1.val - o2.val;
            return o1.i - o2.i;
        });

        int max = sum;
        int nok = 1;

        for (int i = 0; i < n && arr[i].val < 0; i++) {
            nok = NOK(arr[i].i, nok);

            int sum2 = sum;

            for (int j = 2; j <= n; j++) {
                if(j % nok == 0 || nok % j == 0) sum2 -= a[j];
            }

            if(sum2 > max) max = sum2;
        }

        w.println(max);

        w.close();
    }

    public static int NOK(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static class Number {
        int i, val;

        public Number(int i, int val) {
            this.i = i;
            this.val = val;
        }
    }
}
