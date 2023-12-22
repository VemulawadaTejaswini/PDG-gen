import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] params = new long[4];
        for (int i = 0; i < 4; i++) {
            params[i] = scanner.nextInt();
        }
        long a = params[0];
        long b = params[1];
        long c = params[2];
        long d = params[3];

        if (a >= 0) {
            if (c >= 0) {
                System.out.println(b * d);
            } else if (d >= 0) {
                System.out.println(b * d);
            } else {
                System.out.println(a * d);
            }
        } else if (b >= 0) {

            if (c >= 0) {
                System.out.println(b * d);
            } else if (d >= 0) {
                // a<0  b>=0   c<0  d>=0
                if (a * c  > b * d) {
                    System.out.println(a * c);
                } else {
                    System.out.println(b * d);
                }
            } else {
                System.out.println(a * c);
            }

        } else {

            if (c >= 0) {
                System.out.println(b * c);
            } else if (d >= 0) {
                System.out.println(a * c);
            } else {
                System.out.println(a * c);
            }

        }
    }
}