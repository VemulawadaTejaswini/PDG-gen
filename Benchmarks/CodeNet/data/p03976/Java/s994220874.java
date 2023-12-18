import java.util.*;

class B {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int K = sc.nextInt();
        final char[][] P = new char[N][];
        for (int i = 0; i < P.length; i++)
            P[i] = sc.next().toCharArray();
        final int[] cnts = new int[26];
        for (int i = 0; i < N; i++)
            cnts[P[i][0] - 'A']++;
        int ans = 0;
        while (true) {
            Arrays.sort(cnts);
            if (cnts[26 - K] == 0)
                break;
            for (int i = 26 - K; i < 26; i++)
                cnts[i]--;
            ans++;
        }
        System.out.println(ans);
    }
}

public class Main {
    public static void main(String... args) {
        B.main();
    }
}