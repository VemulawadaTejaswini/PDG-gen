import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC107B solver = new ABC107B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC107B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < H; i++) {
                list.add(in.next());
            }
            for (int i = 0; i < H; i++) {
                String s = list.get(i);
                if (s.indexOf("#") == -1) {
                    s = s.replaceAll(".", "!");
                    list.set(i, s);
                }
            }
            for (int i = 0; i < W; i++) {
                boolean f = true;
                for (int j = 0; j < H; j++) {
                    String s = list.get(j);
                    if (s.charAt(i) == '#') {
                        f = false;
                    }
                }
                if (f) {
                    for (int j = 0; j < H; j++) {
                        String s = list.get(j);
                        String s2 = s.substring(0, i) + "!" + s.substring(i + 1, s.length());
                        list.set(j, s2);
                    }
                }
            }
            for (int i = 0; i < H; i++) {
                String s = list.get(i);
                boolean f = false;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) != '!') {
                        out.append(s.charAt(j));
                        f = true;
                    }
                }
                if (f) {
                    out.println();
                }
            }
        }

    }
}

