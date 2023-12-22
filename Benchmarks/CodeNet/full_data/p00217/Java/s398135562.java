
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        while (n > 0) {
            int m = -1;
            int s = -1;
            for (int i = 0; i < n; i++) {
                int p = scan.nextInt();
                int d1 = scan.nextInt();
                int d2 = scan.nextInt();
                if (d1 + d2 > m) {
                    m = d1 + d2;
                    s = p;
                }
            }
            System.out.println(s + " " + m);
            n = scan.nextInt();
        }
    }
}

