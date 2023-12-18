import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] a = new long[n];
        int[] b = new int[m];
        long[] c = new long[m];
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            list.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            c[i] = sc.nextLong();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < b[i]; j++) {
                list.add(c[i]);
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += list.get(i);
        }
        System.out.println(ans);
    }

}
