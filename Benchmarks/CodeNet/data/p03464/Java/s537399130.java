import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int k = sc.nextInt();
        int a[] = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }

        if (a[k - 1] != 2) {
            System.out.println(-1);
            return;
        }

        long min = 2;
        for (int i = k - 2; i >= 0; i--) {
            if (2 * min <= a[i]) {
                System.out.println(-1);
                return;
            }
            min = a[i] * ((min + a[i] - 1) / a[i]);
        }

        System.out.println(min + " " + (min + a[0] - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
