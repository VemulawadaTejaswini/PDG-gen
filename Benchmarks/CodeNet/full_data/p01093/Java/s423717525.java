
import java.util.Scanner;

public class Main {

    static int abs(int x) {
        if (x < 0) {
            x = -x;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int y = 1000000;
            int z = 0;
            for (int b = 0; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    z = abs(a[b] - a[c]);

                    if (z < y) {
                        y = z;
                    }
                }
            }
            System.out.println(y);
            n = sc.nextInt();
            

        }
    }
}

