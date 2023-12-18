import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> h = new ArrayList<>();
        int xx = 0;
        int yy = 0;
        int hh = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            x.add(a);
            y.add(b);
            h.add(c);
            if (c >= 1) {
                xx = a;
                yy = b;
                hh = c;
            }
        }

        // (Cx, Cy) について、(0, 0) から (100, 100) まで全探索
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j <= 100; j++) {
                boolean ok = true;
                int ch = Math.abs(xx - i) + Math.abs(yy - j) + hh;
                ch = Math.max(ch, 0);
                for (int k = 0; k < n; k++) {
                    int tmp = ch - Math.abs(x.get(k) - i) - Math.abs(y.get(k) - j);
                    tmp = Math.max(tmp, 0);
                    if (tmp != h.get(k)) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    System.out.printf("%d %d %d\n", i, j, ch);
                }
            }
        }
    }
}
