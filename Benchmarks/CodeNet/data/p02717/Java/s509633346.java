import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ERedAndGreenApples solver = new ERedAndGreenApples();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERedAndGreenApples {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = Integer.parseInt(in.next());
            int y = Integer.parseInt(in.next());

            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());

            List<Integer> p = new ArrayList<>();
            List<Integer> q = new ArrayList<>();
            List<Integer> r = new ArrayList<>();

            for (int i = 0; i < a; i++) {
                p.add(Integer.parseInt(in.next()));
            }
            for (int i = 0; i < b; i++) {
                q.add(Integer.parseInt(in.next()));
            }
            for (int i = 0; i < c; i++) {
                r.add(Integer.parseInt(in.next()));
            }
            r.sort(Collections.reverseOrder());

            long ans = 0;
            List<Integer> nokori = r;
            if (x <= a) {
                p.sort(Collections.reverseOrder());
                List<Integer> sbList = p.subList(0, x);
                ans += sbList.stream().mapToLong(i -> i).sum();
            } else {
                ans += p.stream().mapToLong(i -> i).sum();
                ans += r.subList(0, x - a).stream().mapToLong(i -> i).sum();
                nokori = r.subList(x - a + 1, r.size());
            }
            out.println(ans);
            if (y <= b) {
                q.sort(Collections.reverseOrder());
                List<Integer> sbList = q.subList(0, y);
                ans += sbList.stream().mapToLong(i -> i).sum();
            } else {
                ans += q.stream().mapToLong(i -> i).sum();
                ans += nokori.subList(0, y - b).stream().mapToLong(i -> i).sum();
            }
            out.println(ans);

        }

    }
}

