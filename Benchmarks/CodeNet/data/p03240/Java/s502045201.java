import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.Comparator;
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
        CPyramid solver = new CPyramid();
        solver.solve(1, in, out);
        out.close();
    }

    static class CPyramid {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Vec3i> xyh = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                xyh.add(new Vec3i(in.nextInt(), in.nextInt(), in.nextInt()));
            }
            xyh.sort(Comparator.comparing(v -> -v.z));


            for (int i = 0; i <= 100; i++) {
                for (int j = 0; j <= 100; j++) {
                    int h = Math.abs(i - xyh.get(0).x) + Math.abs(j - xyh.get(0).y) + xyh.get(0).z;
                    boolean f = true;
                    for (int k = 1; k < n; k++) {
                        if (xyh.get(k).z > 0) {
                            // 一致
                            if (h != Math.abs(i - xyh.get(k).x) + Math.abs(j - xyh.get(k).y) + xyh.get(k).z) {
                                f = false;
                            }
                        } else {
                            if (h < Math.abs(i - xyh.get(k).x) + Math.abs(j - xyh.get(k).y) + xyh.get(k).z) {
                                f = false;
                            }
                        }
                    }
                    if (f) {
                        out.println(i + " " + j + " " + h);
                        return;
                    }
                }
            }
        }

    }

    static class Vec3i {
        public int x;
        public int y;
        public int z;

        public Vec3i(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public String toString() {
            return "Vec3i{" +
                    "x=" + x +
                    ", y=" + y +
                    ", z=" + z +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

    }
}

