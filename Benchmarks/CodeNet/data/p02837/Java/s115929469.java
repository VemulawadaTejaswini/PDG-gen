import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // C - HonestOrUnkind2

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 人数
        int[] a = new int[n]; // 証言数
        int[][] x = new int[n][]; // 誰に対して？
        int[][] y = new int[n][]; // 証言
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            int[] x2 = new int[a[i]]; // x
            int[] y2 = new int[a[i]]; // y
            for (int j = 0; j < a[i]; j++) {
                x2[j] = sc.nextInt();
                y2[j] = sc.nextInt();
            }
            x[i] = x2;
            y[i] = y2;
        }
//        System.out.println("x=" + Arrays.deepToString(x));
//        System.out.println("y=" + Arrays.deepToString(y));

        // 1 についての証言
        int[][] ans0 = new int[n][n];
        int[][] ans1 = new int[n][n];
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < x[i1].length; j1++) {
                for (int k1 = 1; k1 <= n; k1++) {
                    if (x[i1][j1] == k1) {
                        if (y[i1][j1] == 0) {
                            ans0[k1 - 1][i1] = i1 + 1;
                        } else {
                            ans1[k1 - 1][i1] = i1 + 1;
                        }
                    }
                }
            }
        }
//        System.out.println("ans0=" + Arrays.deepToString(ans0));
//        System.out.println("ans1=" + Arrays.deepToString(ans1));
        
        // 自分が正直と言っているひとは、自分を正直と言っているか
        // 自分が不親切と言っているひとは、自分を不親切と言っているか
        // これが成り立てば、自分を正直としてカウントする
        int count = 0;
        for (int i2 = 0; i2 < n; i2++) {
            for (int j2 = 0; j2 < x[i2].length; j2++) {
                if (y[i2][j2] == 0) {
                    if (ans0[i2][x[i2][j2] - 1] != 0) count++;
                } else {
                    if (ans1[i2][x[i2][j2] - 1] != 0) count++;
                }
            }
        }
        

        System.out.println(count);
    }

}