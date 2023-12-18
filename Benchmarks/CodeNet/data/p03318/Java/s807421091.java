import java.io.FileNotFoundException;
import java.io.PrintStream;
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

    public static void main(String args[]) throws FileNotFoundException {

        //System.setOut(new PrintStream("src/out.txt"));

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        for (int i = 1; i <= k && i < 10; i++) {
            System.out.println(i);
        }
        long mod = 10;
        long cur = 19;

        for (int i = 10; i <= k; ) {
            List<Long> list = new ArrayList<>();
            list.add(cur);

            long val = cur / S(cur);
            int d = 1;
            long tmp = cur;
            while (d < mod) {
                for (int j = d; j < d * 10; j += d) {
                    if ((tmp - j) / S(tmp - j) <= val) {
                        list.add(tmp - j);
                    } else {
                        break;
                    }
                }
                d *= 10;
            }

            if (cur + mod > mod * 10) {
                cur += mod * 10;
            } else {
                cur += mod;
            }
            if (cur > mod * 10) {
                mod *= 10;
            }
            for (int j = list.size() - 1; j >= 0 && i <= k; j--, i++) {
                System.out.println(list.get(j));
            }
        }
    }
}
