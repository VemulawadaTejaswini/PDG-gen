
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long max = 1_000_000_000_000_000_000L;
        long root = 3037000499L;
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = in.nextInt();
        long ans = 1;

        if (N == 0) {
            System.out.println(0);
            return;
        }

        //System.out.println(max * max);

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            long a = in.nextLong();
            if (a > max) {
                System.out.println(-1);
                return;
            }

            if (a == 0) {
                System.out.println(0);
                return;
            }

            list.add(a);

        }

        for (long a : list) {
            if (ans > root && a > root) {
                System.out.println(-1);
                return;
            }
            ans *= a;

            if (ans < 0 || ans > max) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(ans);
        in.close();
    }
}