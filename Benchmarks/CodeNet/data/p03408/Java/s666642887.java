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
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (s[i].equals(t[j])) {
                    s[i] = "";
                    t[j] = "";
                }
            }
        }
        Arrays.sort(s);
        int ans = 0;
        int tmp = 1;
        for (int i = 1; i < N; i++) {
            if (s[i].equals(s[i - 1]) && s[i] != "") {
                tmp++;
            } else {
                if (s[i] == "") {
                    continue;
                }
                if (ans < tmp) {
                    ans = tmp;
                }
                tmp = 1;
            }
        }
        if (ans < tmp) {
            ans = tmp;
        }
        System.out.println(ans);

    }

}