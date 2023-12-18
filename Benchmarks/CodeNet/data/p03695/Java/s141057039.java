import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] col = new int[9];
        for (int i = 0; i < n; i++) {
            int an = sc.nextInt();
            int r = Math.min(an / 400, 8);
            col[r] += 1;
        }

        int mi = 0;
        for (int i = 0; i < 8; i++) {
            if (col[i] > 0) {
                mi += 1;
            }
        }
        int ma = mi;
        if (col[8] == 0) {
            System.out.println(mi + " " + ma);
            System.exit(0);
        }

        //if (col[8] > mi) {
        //    mi += col[8] - mi;
        //}
        if (mi == 0) {
            mi = 1;
        }
        ma += Math.min(8-mi, col[8]);
        //ma = Math.min(ma, 8);
        System.out.println(mi + " " + ma);
    }

}
