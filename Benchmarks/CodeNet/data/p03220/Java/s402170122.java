
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt() * 1000;
        int a = sc.nextInt() * 1000;
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int min = -1;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Math.abs(a - (t - h[i] * 6));
            // System.out.println(tmp);
            if (i == 0) {
                min = tmp;
                idx = 0;
            } else {
                if (min > tmp) {
                    min = tmp;
                    idx = i;
                }
            }
        }
        System.out.println((idx + 1));

    }

}
