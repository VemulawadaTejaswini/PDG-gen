import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        boolean p = true;
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (t == 1) {
                p = !p;
            } else {
                int f = sc.nextInt();
                char c = sc.next().charAt(0);
                if (f == 1) {
                    if (p) sb.insert(0, c);
                    if (!p) sb.append(c);
                } else {
                    if (p) sb.append(c);
                    if (!p) sb.insert(0, c);
                }
            }
        }
        if (p) {
            System.out.println(sb.toString());
        } else {
            System.out.println(sb.reverse().toString());
        }
    }
}
