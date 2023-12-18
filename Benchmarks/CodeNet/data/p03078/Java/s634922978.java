import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();

        CakeSet.A = new long[X];
        CakeSet.B = new long[Y];
        CakeSet.C = new long[Z];

        for (int a = 0; a < X; a++) {
            CakeSet.A[a] = sc.nextLong();
        }
        for (int b = 0; b < Y; b++) {
            CakeSet.B[b] = sc.nextLong();
        }
        for (int c = 0; c < X; c++) {
            CakeSet.C[c] = sc.nextLong();
        }

        Arrays.sort(CakeSet.A);
        Arrays.sort(CakeSet.B);
        Arrays.sort(CakeSet.C);

        TreeSet<CakeSet> cakeSets = new TreeSet<>();
        cakeSets.add(new CakeSet(X - 1, Y - 1, Z - 1));

        for (int k = 0; k < K; k++) {
            CakeSet first = cakeSets.first();
            cakeSets.remove(first);
            System.out.println(first.getTaste());

            int a = first.getA();
            int b = first.getB();
            int c = first.getC();

            if (a > 0) {
                cakeSets.add(new CakeSet(a - 1, b, c));
            }
            if (b > 0) {
                cakeSets.add(new CakeSet(a, b - 1, c));
            }
            if (c > 0) {
                cakeSets.add(new CakeSet(a, b, c - 1));
            }
        }
    }

    public static class CakeSet implements Comparable {
        public static long A[];
        public static long B[];
        public static long C[];

        private int a;
        private int b;
        private int c;
        private long taste;

        public CakeSet(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.taste = A[a] + B[b] + C[c];
        }

        public long getTaste() {
            return taste;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        @Override
        public int compareTo(Object o) {
            CakeSet cakeSet2 = (CakeSet) o;

            long diffTaste = getTaste() - cakeSet2.getTaste();
            if (diffTaste != 0) return -(int)diffTaste;

            int diffA = getA() - cakeSet2.getA();
            int diffB = getB() - cakeSet2.getB();
            int diffC = getC() - cakeSet2.getC();

            return (diffA != 0) ? diffA : ((diffB != 0) ? diffB : diffC);
        }
    }
}
