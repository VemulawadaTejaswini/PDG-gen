import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] masu = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    masu[i][j] = 0;
                } else {
                    masu[i][j] = a[i] + a[j];
                }
            }
        }
        long ans = 0;
        long fincount = 0;
        // 全部奇数にする奇数になったらその部分だけ確認
        while (fincount != n) {

            int odcnt = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 1) {
                    odcnt++;
                }
            }
            int odd[] = new int[odcnt];
            // System.out.println(odcnt);
            int tag = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 1) {
                    odd[tag] = a[i];
                    tag++;
                    a[i] = 0;
                    fincount++;
                } else {
                    a[i] = a[i] / 2;
                }
            }
            Arrays.sort(odd);
            for (int i = 0; i < odcnt; i++) {
                if (odd[odcnt - 1 - i] == -1)
                    continue;
                int max = odd[odcnt - 1 - i];
                // System.out.println(max);
                for (int j = i + 1; j < odcnt; j++) {
                    if (odd[odcnt - 1 - j] == -1)
                        continue;
                    int nent = odd[odcnt - 1 - j];
                    boolean saru = true;
                    int ni = 1;
                    int wa = max + nent;
                    // System.out.println(wa);
                    while (ni < wa) {
                        ni = ni * 2;
                        if (wa == ni) {
                            odd[i] = -1;
                            odd[j] = -1;
                            ans++;
                        }
                    }
                }
                odd[odcnt - 1 - i] = -1;

            }
        }
        System.out.println(ans);
    }
}