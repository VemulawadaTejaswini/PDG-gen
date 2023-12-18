import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int x[] = new int[n];
        Arrays.fill(x, -1);

        boolean flg = true;
        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int d = sc.nextInt();
            if (x[l - 1] == -1) {
                if (x[r - 1] == -1) {
                    x[l - 1] = 0;
                    x[r - 1] = d;
                } else {
                    x[l - 1] = x[r - 1] - d;
                }
            } else {
                if (x[r - 1] == -1) {
                    x[r - 1] = x[l - 1] + d;
                } else {
                    flg &= (x[r - 1] - x[l - 1] == d);
                }
            }
        }

        System.out.println(flg ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
