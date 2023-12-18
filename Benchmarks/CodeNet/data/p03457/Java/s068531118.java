import java.util.Scanner;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        int pt = 0;
        int px = 0;
        int py = 0;

        boolean flg = true;
        for (int i = 1; i <= n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int dt = t - pt;
            int dl = Math.abs(x - px) + Math.abs(y - py);
            if (dt < dl) {
                flg = false;
                break;
            }

            if (dt % 2 != dl % 2) {
                flg = false;
                break;
            }

            pt = t;
            px = x;
            py = y;
        }

        System.out.println(flg ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
