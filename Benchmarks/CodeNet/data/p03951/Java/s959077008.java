import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        for (int i = 0; i < n; i++) {
            String v = s.substring(i);
            if (t.startsWith(v)) {
                System.out.println(2 * n - v.length());
                return;
            }
        }
        System.out.println(2 * n);
    }
}