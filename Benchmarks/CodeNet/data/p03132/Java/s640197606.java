import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = sc.nextInt();
        }
        long[] sum = new long[l + 1];
        long[] ssm = new long[l + 1];
        for (int i = l - 1; i >= 0; i--) {
            sum[i] = sum[i + 1] + a[i];
        }
        for (int i = 0; i < l; i++) {

            ssm[i + 1] += ssm[i];
            if (i + 1 <= l && a[i] % 2 == 0) {
                ssm[i + 1]++;
            }

        }
        long[] scm = new long[l + 1];
        long[] mmm = new long[l + 1];

        for (int j = l - 1; j >= 0; j--) {
            if (a[j] % 2 == 0) {
                scm[j]--;
            } else {
                scm[j]++;
            }
            if (j != 0)
                scm[j - 1] = scm[j];
        }
        for (int j = 0; j < l; j++) {
            mmm[j + 1] = Math.min(mmm[j], scm[j]);
        }

        long ans = 999999999999L;
        for (int i = 0; i < l + 1; i++) {
            // ここでやめると
            long tmp = sum[i] + ssm[i];
            ans = Math.min(tmp, ans);
            long tmpp = 0;
            if (i != l)
                tmpp = -sum[i + 1] + sum[i];

            ans = Math.min(tmp + mmm[i], ans);
        }
        System.out.println(ans);
    }

}
