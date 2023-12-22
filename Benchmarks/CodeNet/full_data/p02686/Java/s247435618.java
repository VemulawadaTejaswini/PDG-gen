
import java.io.PrintWriter;
import java.util.*;

public class Main {
    class Pair {
        int b, h;
        public Pair(int b, int h) {
            this.b = b;
            this.h = h;
        }
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        PriorityQueue<Pair> incPq = new PriorityQueue<>((p1, p2) -> p1.b - p2.b);
        PriorityQueue<Pair> decPq = new PriorityQueue<>((p1, p2) -> p1.b - p2.b);

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int b = 0;
            int h = 0;
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    h++;
                } else {
                    h--;
                }
                b = Math.min(b, h);
            }

            if (h < 0) {
                Pair p = new Pair(b - h, -h);
                decPq.add(p);
            } else {
                Pair p = new Pair(b, h);
                incPq.add(p);
            }
        }

        int current = 0;
        while (!incPq.isEmpty()) {
            Pair p = incPq.remove();
            if (current + p.b < 0) {
                System.out.println("No");
                return;
            }
            current += p.h;
        }

        int current2 = 0;
        while (!decPq.isEmpty()) {
            Pair p = decPq.remove();
            if (current2 + p.b < 0) {
                System.out.println("No");
                return;
            }
            current2 += p.h;
        }

        if (current == current2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }



        // out.println("Hello World");
        out.flush();    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
