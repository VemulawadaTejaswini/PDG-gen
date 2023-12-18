import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int t = 1;
        int a = 1;
        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            int A = sc.nextInt();

            int nextT = t;
            int nextA = a;
            if (T < A) {
                nextA = A * nextT / T;
                while (!(nextT % T == 0 && nextA >= a)) {
                    nextT++;
                    nextA = A * nextT / T;
                }
            } else {
                nextT = T * nextA / A;
                while (!(nextA % A == 0 && nextT >= t)) {
                    nextA++;
                    nextT = T * nextA / A;
                }
            }
            t = nextT;
            a = nextA;
        }
        out.println(t + a);
    }
}