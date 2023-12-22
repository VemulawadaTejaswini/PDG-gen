import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FBracketSequencing solver = new FBracketSequencing();
        solver.solve(1, in, out);
        out.close();
    }

    static class FBracketSequencing {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            ArrayList<Vec2i> v = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                char[] s = in.next().toCharArray();
                int pm = 0;
                int min = 0;
                for (int j = 0; j < s.length; j++) {
                    if (s[j] == '(') {
                        pm++;
                    } else {
                        pm--;
                        min = Math.min(min, pm);
                    }
                }
                v.add(new Vec2i(min, pm));
            }
            v.sort(Vec2i::compareTo);
            int now = 0;
            for (Vec2i vec2i : v) {
                if (now + vec2i.x < 0) {
                    out.println("No");
                    return;
                }
                now += vec2i.y;
            }
            out.println(now == 0 ? "Yes" : "No");

        }

    }

    static class Vec2i {
        public int x;
        public int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Vec2i v) {
            // xの降順 -> yの降順
            if (this.x < v.x) return 1;
            else if (this.x > v.x) return -1;
            else if (this.y < v.y) return 1;
            else if (this.y > v.y) return -1;
            return 0;
        }

        public String toString() {
            return "Vec2i{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

    }
}

