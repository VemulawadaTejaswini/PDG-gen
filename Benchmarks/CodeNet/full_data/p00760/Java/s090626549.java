import java.util.*;

public class Main {
    private static final int MAX = 1000;

    public static void main(String[] args) {
        int base = calc(MAX, 1, 1);

        try(Scanner scn = new Scanner(System.in)) {
            int lmt = scn.nextInt();
            for(int i = 0; i < lmt; i++) {
                System.out.println(base - calc(scn.nextInt(), scn.nextInt(), scn.nextInt()));
            }
        }
    }

    public static int calc(int y, int m, int d) {
        int rslt = 0;

        rslt += ~-y / 3 * 590;
        rslt += ~-y % 3 * 195;
        if(y % 3 == 0) {
            rslt += ~-m * 20;
        } else {
            rslt += ~-m / 2 * 39;
            rslt += ~-m % 2 * 20;
        }
        rslt += d;

        return rslt;
    }
}