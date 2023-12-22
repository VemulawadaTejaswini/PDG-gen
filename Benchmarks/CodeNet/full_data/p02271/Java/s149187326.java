import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(sc.next());
        }

        List<Integer> totals = new ArrayList<>();
        for (int i = 1; i < 2 << (n-1); i++) {
            char[] c = new StringBuffer(Integer.toBinaryString(i)).reverse().toString().toCharArray();
            int total = 0;
            for (int j = 0; j < c.length; j++) {
                if (c[j] == 49) total += a[j];
            }
            totals.add(total);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int m = Integer.parseInt(sc.next());
            System.out.println(totals.contains(m) ? "yes" : "no");
        }
    }
}

