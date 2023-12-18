import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n]; int[] y = new int[n];
        for (int i = 0; i < n; i++) { x[i] = sc.nextInt(); y[i] = sc.nextInt(); }
        int eo = Math.abs(x[0] + y[0]) % 2;
        for (int i = 1; i < n; i++) {
            if (Math.abs(x[i] + y[i]) % 2 != eo) {
                System.out.println(-1);
                return;
            }
        }
        int m = 20;
        if (eo == 1) m--;
        System.out.println(m);
        for (int i = 0; i < m; i++) {
            if (i < m - 1) System.out.print(1 + " ");
            else System.out.println(1);
        }
        for (int i = 0; i < n; i++) {
            char X = 'R', Y = 'U';
            if (x[i] < 0) X = 'L';
            if (y[i] < 0) Y = 'D';
            for (int j = 0; j < m; j++) {
                if (j < Math.abs(x[i])) System.out.print(X);
                else if (j < Math.abs(x[i]) + Math.abs(y[i])) System.out.print(Y);
                else if (j % 2 == 0) System.out.print('R');
                else System.out.print('L');
            }
            System.out.print("\n");
        }
    }
}