import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
        int ans = 0;
        for (int position = 0; position < N; position++) {
            String sub = S.substring(position);
            int[] Z = Z(sub);
            for (int i = 0; i < Z.length; i++) {
                ans = Math.max(ans, Math.min(i, Z[i]));
            }
        }
        System.out.println(ans);
    }
    private int[] Z(String S) {
        int N = S.length();
        char[] d = S.toCharArray();
        int[] Z = new int[N];
        int i = 1;
        int j = 0;
        Z[0] = N;
        while (i < N) {
            while (i + j < N && d[j] == d[i + j]) {
                j += 1;
            }
            Z[i] = j;
            if (j == 0) {
                i += 1;
                continue;
            }
            int k = 1;
            while (k < j && k + Z[k] < j) {
                Z[i + k] = Z[k];
                k += 1;
            }
            i += k;
            j -= k;
        }
        return Z;
    }
}
