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

            if (t <= T) {
                if (a <= A) {
                    t = T;
                    a = A;
                } else {
                    a = ((a / A) + 1) * A;
                    t = T * a / A;
                }
            } else {
                if (a <= A) {
                    t = ((t / T) + 1) * T;
                    a = A * t / T;
                } else {
                    int a1 = (int) (Math.ceil(a / A)) * A;
                    int t1 = T * a1 / A;
                    if (t1 >= t) {
                        a = a1;
                        t = t1;
                        continue;
                    }

                    t = (int) Math.ceil(t / T) * T;
                    a = A * t / T;
                }
            }
        }
        out.println(t + a);
    }
}