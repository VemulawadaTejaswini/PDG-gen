import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(s.substring(i, i + 1));
        }
        if (set.size() == n) {
            System.out.println(0);
            return;
        }
        int max = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = i ; j < n + 1 ; j++) {
                String t = s.substring(i, j);
                String u = s.substring(j, n);
                if (u.contains(t)) {
                    max = Math.max(max, t.length());
                }

            }
        }
        System.out.println(max);
    }

}
