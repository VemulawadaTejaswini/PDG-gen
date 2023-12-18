import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();
        String t = sc.next();

        System.out.println(subCount(n, s, t));

    }

    private static int subCount(int n,String s, String t) {
        for (int i = 0; i < n; i++) {
            if (s.substring(i, n).equals(t.substring(0, n-i))) {
                return n + i;
            }
        }
        return 2 * n;
    }
}