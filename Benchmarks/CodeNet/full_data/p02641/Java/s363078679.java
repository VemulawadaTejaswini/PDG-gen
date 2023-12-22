import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int X = Integer.parseInt(sc.next());
            int N = Integer.parseInt(sc.next());
            boolean[] p = new boolean[102];

            for (int i = 0; i < N; i++) {
                 p[Integer.parseInt(sc.next())] = true;
            }
            for (int i = 0; i <= 50; i++) {
                if (X - i >= 0 && !p[X - i]) {
                    System.out.println(X - i);
                    return;
                }
                if (X + i <= 101 && !p[X + i]) {
                    System.out.println(X + i);
                    return;
                }
            }
        }
    }
}
