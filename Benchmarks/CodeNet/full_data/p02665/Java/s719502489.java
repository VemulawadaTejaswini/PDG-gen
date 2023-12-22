import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n + 1];

        int[][] ren = new int[2][n + 1];

        for (int i = 0; i <= n; i++) {
            a[i] = scn.nextInt();
        }
        if (n == 0) {
            if (a[0] == 0) {
                System.out.println(-1);
            } else {
                System.out.println(1);
            }
            return;
        }

        ren[1][n] = a[n];
        ren[0][n] = a[n];
        for (int i = n - 1; i >= 0; i--) {
            ren[0][i] = ren[0][i + 1] + a[i];
            ren[1][i] = a[i] + ((ren[1][i + 1] / 2) + ren[1][i + 1] % 2);
        }
        if (ren[1][0] > 1) {
            System.out.println(-1);
            return;
        }

        int ans = 1;
        int root = 1;

        for (int i = 1; i <= n; i++) {
            root = Math.min((root - a[i-1])*2,ren[0][i]);
            ans += root;
        }
        System.out.println(ans);


        scn.close();


    }


}