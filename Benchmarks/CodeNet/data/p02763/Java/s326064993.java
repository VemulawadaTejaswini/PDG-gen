import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }

    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] d = S.toCharArray();
        int[][] summary = new int[N+1][26];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(summary[i], 0);
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < 26; j++) {
                summary[i][j] = summary[i-1][j];
            }
            summary[i][(int)d[i-1]-'a'] += 1;
        }
        int Q = scan.nextInt();
        int[][] diff = new int[Q][26];
        for (int i = 0; i < Q; i++) {
            int type = scan.nextInt();
            if (type == 1) {
                int index = scan.nextInt();
                char c = scan.next().toCharArray()[0];
                if (d[index-1] == c) {
                    continue;
                }
                diff[i][(int) d[index-1]-'a'] -= 1;
                diff[i][(int) c-'a'] += 1;
                d[index-1] = c;
                for (int k = i + 1; k < Q; k++) {
                    for (int l = 0; l < 26; l++) {
                        diff[k][l]=diff[i][l];
                    }
                }
                continue;
            }
            int l = scan.nextInt();
            int r = scan.nextInt();
            int ans = 0;
            for (int j = 0; j < 26; j++) {
                if (0 < summary[r][j]+diff[i][j] - summary[l-1][j]-diff[l-1][j]) {
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }
}
