import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();
        int[][] cnt = new int[N+1][N+1];
        for (int i = 0; i < M; i++) {
            int L = Integer.parseInt(sc.next());
            int R = Integer.parseInt(sc.next());
            cnt[L][R]++;
        }


        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int tmp = 0;
            for (int l = p; l <= q; l++) {
                for (int r = l; r <= q; r++) {
                    tmp += cnt[l][r];
                }
            }
            ans.append(tmp).append('\n');
        }

        System.out.print(ans);
    }
}
