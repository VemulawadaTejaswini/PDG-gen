import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();

        long absX = Math.abs(x);

        long tmpMove = absX / d;
        long tmpMulti = k * d;

        if (k <= tmpMove) {
            if (0 < x) System.out.println(x - tmpMulti);
            else System.out.println(Math.abs(x + tmpMulti));
        } else {
            if (0 < x) {
                x -= d * tmpMove;
                long res = Math.abs(x);
                k -= tmpMove;
                if (k % 2 == 0) {
                    System.out.println(res);
                } else {
                    System.out.println(Math.min(Math.abs(x - d), Math.abs(x + d)));
                }
            } else {
                x += d * tmpMove;
                long res = Math.abs(x);
                k -= tmpMove;
                if (k % 2 == 0) {
                    System.out.println(res);
                } else {
                    System.out.println(Math.min(Math.abs(x - d), Math.abs(x + d)));
                }
            }
        }


    }


}

