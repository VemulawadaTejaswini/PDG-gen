import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a, b, c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int n = 0;

        int ballSet = b + c;
        int totalBallSet = a /ballSet;
        if (ballSet >= a || b == 0) {
            System.out.println(b);
        } else if (a % ballSet <= b) {
            n = totalBallSet * b + (a % ballSet);

            System.out.println(n);
        } else {

            n = totalBallSet * b +b;
            System.out.println(n);
        }
    }
}