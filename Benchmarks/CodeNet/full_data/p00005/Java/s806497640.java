
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {

            long a = scan.nextLong();
            long b = scan.nextLong();
            long X = a;
            long Y = b;
            long Z;

            while (X % Y != 0) {
                Z = X;
                X = Y;
                Y = Z % Y;
            }
            System.out.println(Y + " " + a / Y * b);
        }
    }
}

