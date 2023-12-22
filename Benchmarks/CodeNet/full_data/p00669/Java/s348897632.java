import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if ((n | k) == 0)
                break;
            int cs[] = new int[n];
            for (int i = 0; i < n; i++) {
                cs[i] = sc.nextInt();
            }
            int ck = 0;
            for (int i = 0; i <= n - k; i++) {
                int pro = 1;
                for (int j = 0; j < k; j++) {
                    pro *= cs[i + j];
                }
                ck = Math.max(ck, pro);
            }
            int ckd = 0;
            int ans = 0;
            boolean nogame = true;
            for (int i = 0; i < n; i++) {
                int[] tmp = new int[n];
                for (int j = i + 1; j < n; j++) {
                    for (int p = 0; p < n; p++) {
                        tmp[p] = cs[p];
                    }
                    int temp = tmp[i];
                    tmp[i] = tmp[j];
                    tmp[j] = temp;
                    for (int l = 0; l <= n - k; l++) {
                        int pro = 1;
                        for (int m = 0; m < k; m++) {
                            pro *= tmp[l + m];
                        }
                        ckd = Math.max(ckd, pro);
                        if (ckd >= ck) {
                            nogame = false;
                            ans = Math.max(ckd - ck, ans);
                        }
                    }
                }
            }
            System.out.println(nogame ? "NO GAME" : ans);
        }
    }
}