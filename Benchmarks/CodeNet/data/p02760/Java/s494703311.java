import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // boolean flag = false;
        int[] a = new int[3 * 3];

        // String s = sc.next();
        // int cnt = 1;

        for (int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        int n = Integer.parseInt(sc.next());
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(sc.next());
            for (int j = 0; j < 9; j++) {
                if (b[i] == a[j]) {
                    a[j] = 0;
                    break;
                }
            }
        }

        if ((a[0] == 0 && a[1] == 0 && a[2] == 0) || (a[3] == 0 && a[4] == 0 && a[5] == 0)
                || (a[6] == 0 && a[7] == 0 && a[8] == 0) || (a[0] == 0 && a[3] == 0 && a[6] == 0)
                || (a[1] == 0 && a[4] == 0 && a[7] == 0) || (a[2] == 0 && a[5] == 0 && a[8] == 0)
                || (a[0] == 0 && a[4] == 0 && a[8] == 0) || (a[2] == 0 && a[4] == 0 && a[6] == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}