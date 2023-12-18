import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/6/23 11:55
 * @see meituan.n2018.Bturn
 */
public class Main {

    private static long S(long n) {
        int tmp = 0;
        while (n > 0) {
            tmp += n % 10;
            n /= 10;
        }
        return tmp;
    }

    private static void helper(List<Long> list, long cur, long mod, long d, long val) {
        while (d < mod) {
            for (long j = d; j < d * 10; j += d) {
                if ((cur - j) / S(cur - j) <= val) {
                    list.add(cur - j);
                    if (d > 1) {
                        helper(list, cur - j, d, 1, (cur - j) / S(cur - j));
                    }
                } else {
                    break;
                }
            }
            d *= 10;
        }
    }

    public static void main(String args[]) throws FileNotFoundException {

//        System.setOut(new PrintStream("src/out.txt"));

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
//        int k = 800;

        for (int i = 1; i <= k && i < 10; i++) {
            System.out.println(i);
        }
        long mod = 10;
        long cur = 19;

        for (int i = 10; i <= k; ) {
            List<Long> list = new ArrayList<>();
            list.add(cur);

            long val = cur / S(cur);
            long d = 1;

            if (cur == 1099) {
                int ll = 0;
                for (int jj = 0; jj < 1; jj++) {

                }
            }

            helper(list, cur, mod, d, val);

            if (cur + mod > mod * 10) {
                mod *= 10;
            }
            cur += mod;
            for (int j = list.size() - 1; j >= 0 && i <= k; j--, i++) {
                System.out.println(list.get(j));
            }
        }
    }
}
