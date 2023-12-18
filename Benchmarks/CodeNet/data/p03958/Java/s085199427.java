/**
 * Created by fanny on 16-10-23.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        String line1 = scanner1.nextLine();
        int K = Integer.parseInt(line1.split(" ")[0]);
        int T = Integer.parseInt(line1.split(" ")[1]);

        String line2 = scanner1.nextLine();
        String[] a = line2.split(" ");

        int max = K-1;
        if (T == 1) {
            System.out.println(max);
            return;
        }

        int[] c = new int[T];
        for (int i = 0; i < T; i++) {
            c[i] = Integer.parseInt(a[i]);
        }

        boolean result = false;
        for (int i = 0; i < T; i++) {
            if (c[i] > Math.floor(K / T)) {
                result = true;
                max = c[i];
            }
        }

        if (!result) {
            System.out.println(0);
            return;
        }
        else{
            for (int i = 0; i < T; i++) {
                if (c[i] > Math.floor(K / T)) {
                    result = true;
                    max = c[i];
                }
            }
            int tmp = max;
            for (int i = 0; i < T; i++) {
                if (c[i]!=max) {
                    tmp -= c[i];
                }
            }
            max = tmp-1;
            System.out.println(max);
            return;
        }
    }
}