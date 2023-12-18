import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[m];
        int[] y = new int[m];
        for (int i = 0 ; i < m; i++) {
            x[i] = sc.nextInt() -1;
            y[i] = sc.nextInt() - 1;
        }
        int[] a = new int[n];
        int[] b = new int[n];
        Arrays.fill(a, 1);
        b[0] = 1;
        for (int i = 0 ; i < m ; i++) {
            if (a[x[i]] > 0) {
                a[x[i]] -= 1;
                a[y[i]] += 1;
                if (b[x[i]] > 0) {
                    b[y[i]] = 1;
                }
                if (a[x[i]] == 0) {
                    b[x[i]] = 0;
                }

            }
        }

        int c = 0;
        for (int i = 0 ; i < n ; i++) {
            if (b[i] > 0) c++;
        }
        System.out.println(c);

    }

}