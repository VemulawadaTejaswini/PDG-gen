import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int m = sc.nextInt(), n = sc.nextInt();
            if ((m | n) == 0)
                break;
            List<Integer> l = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                l.add(i);
            }
            int p = 0;
            for (int i = 1; i <= n; i++) {
                String s = sc.next();
                String a = "";
                if (i % 3 == 0) {
                    a = "Fizz";
                }
                if (i % 5 == 0) {
                    a += "Buzz";
                }
                if (a.equals("")) {
                    a = String.valueOf(i);
                }
                if (s.equals(a)) {
                    p = (p + 1) % l.size();
                } else if (l.size() > 1) {
                    l.remove(p);
                    p %= l.size();
                }
            }
            for (int i = 0; i < l.size(); i++) {
                System.out.print(l.get(i) + (i < l.size() - 1 ? " " : "\n"));
            }
        }
    }
}
