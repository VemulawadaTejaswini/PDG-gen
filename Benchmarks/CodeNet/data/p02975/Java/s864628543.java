import java.util.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int result = 0;
        String[] a_str = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
            result ^= a[i];
        }

        System.out.println(result == 0 ? "Yes" : "No");
    }
}