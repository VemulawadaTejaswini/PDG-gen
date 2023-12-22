
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hito = scan.nextInt();
        int nmin = scan.nextInt();
        int nmax = scan.nextInt();
        int p[] = new int[201];
        while (hito != 0 || nmin != 0 || nmax != 0) {

            int g;
            int max = 0;
            int ninnzu = 0;
            for (int i = 1; i <= hito; i++) {
                p[i] = scan.nextInt();
            }
            for (int h = nmin; h <= nmax; h++) {
                g = p[h] - p[h + 1];

                if (max <= g) {
                    max = g;
                    ninnzu = h;
                }

            }
            System.out.println(ninnzu);
            hito = scan.nextInt();
            nmin = scan.nextInt();
            nmax = scan.nextInt();
        }
    }
}

