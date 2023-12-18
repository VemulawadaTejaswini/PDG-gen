import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] p = new int[a];
        int[] q = new int[b];
        int[] r = new int[c];
        for (int i = 0; i < a; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            q[i] = sc.nextInt();
        }
        for (int i = 0; i < c; i++) {
            r[i] = sc.nextInt();
        }
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        int[] g = new int[x + y];
        for (int i = 0 ; i < x ; i++) {
            g[i] = p[a - 1 - i];
        }
        for (int i = 0 ; i < y ; i++) {
            g[x + i] = q[b - 1 - i];
        }

        Arrays.sort(g);

        for (int i = 0 ; i < c ; i++) {
            if (g[i] < r[c - 1 - i]) {
                g[i] = r[c - 1 - i];
            }
        }
        long sum = 0;
        for (int i = 0 ; i < x + y ; i++) {
            sum += (long) g[i];
        }

        System.out.println(sum);

    }

}
