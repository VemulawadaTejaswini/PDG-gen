import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int a[] = new int[m];
        for (int ct = 0; ct < a.length; ct++) {
            a[ct] = sc.nextInt();
        }
        int lo = 0, hi = 0;
        for (int oki : a) {
            if (oki < x) {
                lo++;
            } else {
                hi++;
            }
        }
        if (lo < hi) {
            System.out.println(lo);
        } else {
            System.out.println(hi);
        }
    }
}
