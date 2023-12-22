
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        for (int n = scan.nextInt(); n != 0; n = scan.nextInt()) {
            int t[] = new int[n];

            for (int i = 0; i < n; i++) {
                t[i] = scan.nextInt();
            }
            int b = -1000000;

            for (int l = 0; l < n; l++) {
                int g = 0;
                for (int r = l; r < n; r++) {
                    g += t[r];
                    if (g > b) {
                        b = g;
                    }
                }
            }
            System.out.println(b);
        }
    }
}

