
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; ++i) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            long d = scanner.nextLong();
            solve(a, b, c, d);
        }
    }
    public static int withinCube(long a, long c) {
        int indexA = 0;
        long tmpA = a - 1;
        while (tmpA > 1) {
            tmpA /= 3;
            indexA++;
        }
        int indexC = 0;
        long tmpC = c - 1;
        while (tmpC > 1) {
            tmpC /= 3;
            indexC++;
        }
//        System.out.println(
//                "a: " + a + " c: " + c +
//                " indexA: " + indexA + " indexC: " + indexC);
        if (indexA == indexC) {
            if (indexA <= 3) {
                return indexA;
            }
            long remainA = a - (long)Math.pow(3, indexA - 1);
            long remainC = c - (long)Math.pow(3, indexC - 1);
            return withinCube(remainA, remainC);
        } else {
            return -1;
        }
    }
    public static long pow(long a, long exp) {
        long res = 1;
        for (int i = 0; i < exp; ++i) {
            res *= a;
        }
        return res;
    }
    public static void solve(long a, long b, long c, long d) {
        final int withinCubeAC = withinCube(a, c);
        final int withinCubeBD = withinCube(b, d);
        if (withinCubeAC == -1 && withinCubeBD == -1) {
            long ans = Math.abs(a - c) + Math.abs(b - d);
            System.out.println(ans);
            return;
        } else if (withinCubeAC > 2) {
            long cubeLength = pow(3, withinCubeAC);
//            System.out.println("withinCubeAC: " + withinCubeAC);
//            System.out.println("cubeLength: " + cubeLength);
            if (a > c) {
                long tmp = c;
                c = a;
                a = tmp;
            }
            long x1 = a % cubeLength - 1;
            long x2 =
                    c % cubeLength == 0
                            ? cubeLength - 1
                            : c % cubeLength - 1;
//            System.out.println("x1: " + x1);
//            System.out.println("x2: " + x2);
            long path1 = x1 + x2;
            long path2 = (cubeLength - x1 - 1) + (cubeLength - x2 - 1);
            long ans = Math.min(path1, path2) + Math.abs(b - d) + 2;
//            System.out.println("path1: " + path1);
//            System.out.println("path2: " + path2);
            System.out.println(ans);
            return;
        }
        else if (withinCubeBD > 2) {
            long cubeLength = pow(3, withinCubeBD);
            if (b > d) {
                long tmp = b;
                b = d;
                d = tmp;
            }
            long x1 = b % cubeLength - 1;
            long x2 =
                    d % cubeLength == 0
                    ? cubeLength - 1
                    : d % cubeLength - 1;
            long path1 = x1 + x2 + Math.abs(b - d);
            long path2 = (cubeLength - x1 - 1) + (cubeLength - x2 - 1) + Math.abs(b - d);
            long ans = Math.min(path1, path2) + Math.abs(a - c) + 2;
            System.out.println(ans);
        } else {
            long ans = Math.abs(a - c) + Math.abs(b - d);
            System.out.println(ans);
        }
    }
}
