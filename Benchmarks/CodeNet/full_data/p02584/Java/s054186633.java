import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    static void walkingTakashi(List<Long> list, long X, long K, long D) {
        list.add(X);
        if(X != 0) {
            long x = X;

            for(long i = K; i > 0; i--) {
                try {
                    x -= D;
                    list.add(abs(x));

                    if(signum(x) == 0) break;
                    //0から遠ざかっているとき
                    if(abs(x) > abs(list.get(list.size() - 1))) break;
                    //異符号のとき
                    if(signum(x) != signum(list.get(list.size() - 1))) break;
                } catch (ArithmeticException e) {
                    // TODO: handle exception
                    break;
                }
            }
            for(long i = K; i > 0; i--) {
                try {
                    x += D;
                    list.add(abs(x));

                    if(signum(x) == 0) break;
                    //0から遠ざかっているとき
                    if(abs(x) > abs(list.get(list.size() - 1))) break;
                    //異符号のとき
                    if(signum(x) != signum(list.get(list.size() - 1))) break;
                } catch (ArithmeticException e) {
                    // TODO: handle exception
                    break;
                }
            }
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
