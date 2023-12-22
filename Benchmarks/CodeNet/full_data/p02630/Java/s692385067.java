import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long > a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        int q = sc.nextInt();
        int[] b = new int[q];
        long[] c = new long[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextLong();
        }
        for (int i = 0; i < q; i++) {
            int tmp1 = b[i];
            long tmp2 = c[i];
            Collections.replaceAll(a, (long)tmp1, tmp2);
            long ans = 0;
            for (int j = 0; j < n; j++) {
                ans += a.get(j);
            }
            System.out.println(ans);
        }
    }
}