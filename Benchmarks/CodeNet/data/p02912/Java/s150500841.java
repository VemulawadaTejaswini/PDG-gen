import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(sc.next());
            a[i] = num;
        }
        for (int i = 0; i < m; i++) {
            Arrays.sort(a, Comparator.reverseOrder());
            a[0] /= 2;
        }
        long ans = 0;
        for (long l : a) {
            ans += l;
        }
        System.out.println(ans);
    }
}