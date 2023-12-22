
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int g = 0;
        int s = 1000000;

        while (n != 0) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();

            }
            for (int b = 0; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    if (a[b] > a[c]) {
                        g = a[b] - a[c];
                    } else {
                        g = a[c] - a[b];
                    }
                    if (s > g) {
                        s = g;
                    }
                }
            }
            System.out.println(s);
            s = 1000000;
            g = 0;
            n = scan.nextInt();
        }
    }
}

