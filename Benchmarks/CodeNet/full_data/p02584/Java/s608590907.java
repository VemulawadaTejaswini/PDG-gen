import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main{
    static void walkingTakashi(List<Long> list, long X, long K, long D) {
        long x = abs(X);
        if (x / D >= K)
            list.add(x - D * K);
        else {
            long k = K - x / D;
            x -= D * K;
            //往復
            if (k % 2 == 0)
                list.add(x);
            else
                list.add(abs(x - D));
        }

    }

    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        long X = std.nextLong();
        long K = std.nextLong();
        long D = std.nextLong();

        List<Long> list = new ArrayList<Long>();
        walkingTakashi(list, X, K, D);

        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
