import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ##### 初期読み込み #######################################################################

        // 複数行 1行目h,w 2行目以降 long[][] ----------------------------------------------------
        String[] sLine1 = scanner.nextLine().split(" ");
        int a = Integer.parseInt(sLine1[0]);
        int b = Integer.parseInt(sLine1[1]);
        int m = Integer.parseInt(sLine1[2]);

        String[] sLine2 = scanner.nextLine().split(" ");
        long[] aline = new long[sLine2.length];
        long minA = 100001;
        for (int i = 0; i < sLine2.length; i++) {
            aline[i] = Long.parseLong(sLine2[i]);
            if (aline[i] < minA) {
                minA = aline[i];
            }
        }

        String[] sLine3 = scanner.nextLine().split(" ");
        long[] bline = new long[sLine3.length];
        long minB = 100001;
        for (int i = 0; i < sLine3.length; i++) {
            bline[i] = Long.parseLong(sLine3[i]);
            if (bline[i] < minB) {
                minB = bline[i];
            }
        }

        int[][] waribikikens = new int[m][3];
        for (int i = 0; i < m; i++) {
            String[] sLines = scanner.nextLine().split(" ");
            for (int j = 0; j < 3; j++) {
                waribikikens[i][j] = Integer.parseInt(sLines[j]);
            }
        }

        // ##### メイン処理 #######################################################################

        long min = minA + minB;

        for (int i = 0; i < m; i++) {
            long sum = aline[waribikikens[i][0] - 1] + bline[waribikikens[i][1] - 1] - waribikikens[i][2];
            if (sum < min) {
                min = sum;
            }
        }

        System.out.println(min);
    }
}