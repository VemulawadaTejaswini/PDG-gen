import java.util.Scanner;

public class Main {
    static int ans = Integer.MIN_VALUE, n, m, q, a[][];

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        q = in.nextInt();
        a = new int[q][4];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int[] d = new int[n];
        for (int i = 1; i <= m; i++) {
            d[0] = i;
            pl(d, 1);
        }
        System.out.println(ans);
    }

    static void pl(int[] d, int i) {
        if (i == n) {
            int ansx = 0;
            for (int k = 0; k < q; k++) {
                if (d[a[k][1] - 1] - d[a[k][0] - 1] == a[k][2])
                    ansx += a[k][3];
            }
            ans = Math.max(ansx, ans);
        } else {
            for (int k = d[i - 1]; k <= m; k++) {
                d[i] = k;
                pl(d, i + 1);
            }
        }
    }

}
