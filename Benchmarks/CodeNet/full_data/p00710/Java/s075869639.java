import java.util.*;
import java.lang.*;

/**
 * HanafudaShuffle
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out_of_loop: while (true) {
            int n = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());

            // zńúťiăŠçlŚÄ˘éj
            int[] list = new int[n];
            for (int i = 0; i < n; i++) {
                list[i] = n - i;
            }

            if (n == 0 && r == 0)
                break out_of_loop;

            for (int i = 0; i < r; i++) {
                int p = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());

                int newarray[] = new int[n];
                System.arraycopy(list, p - 1, newarray, 0, c);
                System.arraycopy(list, 0, newarray, c, p - 1);
                System.arraycopy(list, p + c - 1, newarray, p + c - 1, n - (p + c - 1));

                list = newarray.clone();
            }

            System.out.println(list[0]);
        }
    }
}
