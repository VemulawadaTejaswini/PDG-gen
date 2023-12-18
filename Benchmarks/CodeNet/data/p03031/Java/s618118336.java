import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] s = new int[m][10];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            for (int j = 0; j < k; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        boolean[] is0 = new boolean[m];
        for (int i = 0; i < m; i++) {
            is0[i] = sc.nextInt() == 0;
        }

        int ans = 0;
        for (int switches = 0; switches < (1 << n); switches++) {//suicchizentansaku
            boolean flag = true;
            boolean[] isOn = new boolean[n];
            for (int i = 0; i < n; i++) {
                isOn[i] = ((switches >> i) & 1) == 1;
            }

            for (int i = 0; i < m; i++) {//denkyugoto

                int on = 0;
                for (int k : s[i]) {
                    if (k == 0) break;
                    if (isOn[k - 1]) on++;
                }
                if (is0[i] != (on % 2 == 0)) {
                    flag = false;
                }

            }

            if (flag) ans++;
        }
        System.out.println(ans);
    }
}