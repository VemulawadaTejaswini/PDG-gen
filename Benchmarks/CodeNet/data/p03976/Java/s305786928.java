import java.util.*;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        final int K = sc.nextInt();
        final char[][] P = new char[N][];
        for (int i = 0; i < P.length; i++)
            P[i] = sc.next().toCharArray();
        final int[] cnts = new int[128];
        for (int i = 0; i < N; i++)
            cnts[P[i][0]]++;
        int ans = 0;
        loop:
        for (; N >= K; ans++) {
            for (int i = 'A', j = 0; i <= 'Z'; i++) {
                if (cnts[i] == 0)
                    continue;
                cnts[i]--;
                if (++j == K)
                    continue loop;
            }
            break;
        }
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String... args) {
        B.main();
    }
}