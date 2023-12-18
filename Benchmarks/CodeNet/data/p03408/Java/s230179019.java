import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
        }
        int M = sc.nextInt();
        String[] t = new String[M];
        for (int i = 0; i < M; i++) {
            t[i] = sc.next();
        }
        Arrays.sort(s);
        Arrays.sort(t);
        int sa = 0;
        int ta = 0;
        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (s[i].equals(s[j])) {
                    sa++;
                }
            }
            for (int k = 0; k < M; k++) {
                if (t[k].equals(s[i])) {
                    ta++;
                }
            }
            tmp = sa - ta;
            if (tmp < 0) {
                tmp = 0;
            }
            ans = Math.max(ans, tmp);
            sa=0;
            ta=0;
        }
         System.out.println(ans);
    }
   

}
