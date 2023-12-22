import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] p = new int[n];
        boolean fl = true;

        if (n == 0) {
            System.out.println(x);

            return;
        }

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < x; i++) {
            fl = true;

            for (int j = 0; j < n; j++) {
                if (p[j] == x - i) {
                    fl = false;
                }
            }
            if (fl) {
                System.out.println(x - i);
                return;
            }
            
            fl = true;
            for (int j = 0; j < n; j++) {
                if (p[j] == x + i) {
                    fl = false;
                }
            }
            if (fl) {
                System.out.println(x + i);
                return;
            }

        }

        sc.close();
    }

}