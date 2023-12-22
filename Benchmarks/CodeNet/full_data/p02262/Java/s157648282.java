import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = inp.nextInt();

        int[] b = new int[total];

        for (int k = 0; k < total; k++) {
            int a = inp.nextInt();

            b[k] = a;
        }

        shellSort(b, total);
    }

    public static int insertionSort(int[] b, int n, int g) {
        int counter = 0;
        for (int i = g; i < n; i++) {
            int v = b[i];
            int j = i - g;
            while (j >= 0 && b[j] > v) {
                b[j + g] = b[j];
                j = j - g;
                counter++;
            }

            b[j + g] = v;
        }

        return counter;
    }

    public static void shellSort(int[] b, int n) {
        int counter = 0;
        int m = 0;
        int g[] = new int[100];

        for (int i = 1; i <= n; i=i*3+1) {
            g[m] = i;
            m++;
        }

        System.out.println(m);

        m--;

        for (int i = m; i >= 0; i--) {
            counter += insertionSort(b, n, g[i]);

            if (i == 0) {
                System.out.printf(" %d", g[i]);
            } else {
                System.out.printf("%d", g[i]);
            }
        }

        System.out.println("\n" + counter);

        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }
    }
}

