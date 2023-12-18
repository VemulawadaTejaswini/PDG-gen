
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

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        long mod = 10;
        long cur = 0;
        for (int i = 0; i < k; i++){
            if (cur + mod / 10 >= mod) {
                mod *= 10;
            }
            cur += mod / 10;
            System.out.println(cur);
        }
    }
}
