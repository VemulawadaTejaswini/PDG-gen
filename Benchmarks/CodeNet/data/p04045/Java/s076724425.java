import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        int N, K;
        Integer[] D;

        N = sc.nextInt();
        K = sc.nextInt();

        D = new Integer[K];
        for (int i = 0; i < K; i++) {
            D[i] = sc.nextInt();
        }

        for (int i = 1; i < 100000; i++) {
            if (N <= i) {
                if (i < 10000)
                {
                    if (!Arrays.asList(D).contains((i%10000)/1000) && !Arrays.asList(D).contains((i%1000)/100) && !Arrays.asList(D).contains((i%100)/10) && !Arrays.asList(D).contains(i%10)) {
                        out.println(i);
                        break;
                    }
                }
                if (i > 10000)
                    if (!Arrays.asList(D).contains(i/10000) && !Arrays.asList(D).contains((i%10000)/1000) && !Arrays.asList(D).contains((i%1000)/100) && !Arrays.asList(D).contains((i%100)/10) && !Arrays.asList(D).contains(i%10)) {
                        out.println(i);
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}