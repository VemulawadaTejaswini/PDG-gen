gimport java.io.*;
import java.util.*;

class Cube {
    int x, y, z;
    Cube(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public boolean equals(Object obj) {
        Cube o = (Cube)obj;
        return x == o.x && y == o.y && z == o.z;
    }
    @Override
    public int hashCode() {
        return x * 503 * 503 + y * 503 + z;
    }
    @Override
    public String toString() {
        return String.valueOf(x) + "," + String.valueOf(y) + "," + String.valueOf(z);
    }
}

public class Main {
    int n, h;
    int cube;
    Scanner sc;
    Set<Cube> hole;
    enum C {XY, XZ, YZ;}

    Main() {
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Main().run();
    }

    boolean init() {
        n = sc.nextInt();
        h = sc.nextInt();
        if (n == 0 && h == 0) return false;
        hole = new HashSet<Cube>();

        for (int _h = 0; _h < h; _h++) {
            String c; int a, b;
            c = sc.next();
            a = sc.nextInt()-1;
            b = sc.nextInt()-1;
            switch (C.valueOf(c.toUpperCase())) {
                case XY:
                    for (int i = 0; i < n; i++) hole.add(new Cube(a, b, i));
                    break;
                case XZ:
                    for (int i = 0; i < n; i++) hole.add(new Cube(a, i, b));
                    break;
                case YZ:
                    for (int i = 0; i < n; i++) hole.add(new Cube(i, a, b));
                    break;
            }
        }
        return true;
    }

    void run() {
        while (init()) {
            System.out.println(n*n*n - hole.size());
        }
    }
}