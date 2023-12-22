
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int N = scan.nextInt();
            int a;
            int b;
            int c;
            int d;
            int i;
            for (i = 0; i < N; i++) {
                a = scan.nextInt();
                b = scan.nextInt();
                c = scan.nextInt();

                if ((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (c * c) + (b * b) == (a * a)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");

                }
            }
        }
    }
}

