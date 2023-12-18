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
        DGatheringChildren solver = new DGatheringChildren();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGatheringChildren {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // R..RL..Lの塊を探す
            char[] s = in.next().toCharArray();

            ArrayList<Vec2i> rl = new ArrayList<>();
            int r = 1;
            int l = 0;


            for (int i = 1; i < s.length; i++) {
                if (s[i] == 'R' && s[i - 1] == 'L') {
                    rl.add(new Vec2i(r, l));
                    r = 1;
                    l = 0;
                } else if (s[i] == 'R') {
                    r++;
                } else {
                    l++;
                }
            }
            rl.add(new Vec2i(r, l));

            int index = -1;
            int[] ans = new int[s.length];

            for (Vec2i v : rl) {
                index += v.x;
                ans[index++] = MathUtil.ceil(v.x, 2) + v.y / 2;
                ans[index] = v.x / 2 + MathUtil.ceil(v.y, 2);
                index += v.y - 1;
            }

            for (int i = 0; i < ans.length; i++) {
                out.print(ans[i] + (i == ans.length - 1 ? "\n" : " "));
            }


        }

    }

    static class Vec2i {
        public int x;
        public int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
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

    static class MathUtil {
        public static int ceil(int i1, int i2) {
            return (i1 - 1 + i2) / i2;
        }

    }
}

