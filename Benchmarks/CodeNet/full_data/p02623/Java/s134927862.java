import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int arrayn[] = new int[n];

        for (int i = 0; i < n; i++) {
            arrayn[i] = sc.nextInt();
        }

        int arraym[] = new int[m];

        for (int i = 0; i < m; i++) {
            arraym[i] = sc.nextInt();
        }

        int ans = 0;

        int nflg = 0;
        int mflg = 0;

        while (k >= 0) {
            if (nflg == n && mflg == m) {
                break;
            } else if (nflg == n) {
                k -= arraym[mflg];
                mflg++;
                ans++;
            } else if (mflg == m) {
                k -= arrayn[nflg];
                nflg++;
                ans++;
            } else {
                if (arrayn[nflg] > arraym[mflg]) {
                    k -= arraym[mflg];
                    mflg++;
                    ans++;
                } else {
                    k -= arrayn[nflg];
                    nflg++;
                    ans++;
                }
            }
        }

        if (ans != 0 && ans != n + m) {
            ans--;
        }

        System.out.println(ans);

        sc.close();

    }

}
