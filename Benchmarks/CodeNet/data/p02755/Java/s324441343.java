import java.util.*;
import java.lang.*;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int p = 1; p < 2000; p++) {
            if (p * .08 == a && p * .1 == b) {
                System.out.println(p);
                return;
            }
        }
        System.out.println(-1);
    }
}