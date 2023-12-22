
import java.util.Scanner;

class Main {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        while (m != -1 || f != -1 || r != -1) {

            if (m == 0 || f == 0 || m + f < 30) {
                System.out.println("F");
            } else if (80 <= m + f) {
                System.out.println("A");
            } else if (65 <= m + f && m + f < 80) {
                System.out.println("B");
            } else if (50 <= m + f && m + f < 65) {
                System.out.println("C");
            } else if (30 <= m + f && m + f < 50 && r <= 50) {
                System.out.println("C");
            } else if (30 <= m + f && m + f < 50 && r > 50) {
                System.out.println("D");
            }
            m = sc.nextInt();
            f = sc.nextInt();
            r = sc.nextInt();
        }
    }

}

