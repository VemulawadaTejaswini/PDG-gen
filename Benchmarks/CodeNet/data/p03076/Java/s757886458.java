import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
        int wait = 10;
        for (int i = 0; i < a.length; i++) {
            int mod = a[i] % 10;
            if (mod < wait && mod != 0) {
                wait = mod;
            }

            if (mod != 0) {
                sum += (a[i] / 10 + 1) * 10;
            } else {
                sum += a[i];
            }
        }

        if (wait != 10) {
            sum -= 10 - wait;
        }

        out.println(sum);
    }
}