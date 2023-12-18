import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T = sc.nextLong();

        long sum = 0;
        long t0 = Long.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            long t1 = sc.nextLong();
            if(t0 + T <= t1){
                sum += T;
            } else {
                sum += t1 - t0;
            }
            t0 = t1;
        }
        out.println(sum);
    }
}