import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }

        int cnt = 0;
        long pre = a[0];
        int i = 1;
        while (i < N) {
            if (pre == a[i]) {
                i++;
            }

            if (pre < a[i]) {
                while (i < N && pre < a[i]) {
                    pre = a[i++];
                }
            } else {
                while (i < N && pre > a[i]) {
                    pre = a[i++];
                }
            }

            cnt++;
            if (i < N - 1) {
                pre = a[i++];
            }
        }

        out.println(cnt);
    }
}