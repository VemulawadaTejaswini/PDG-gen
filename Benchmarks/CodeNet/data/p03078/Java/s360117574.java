import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    static Long[] A;
    static Long[] B;
    static Long[] C;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();
        int K = scanner.nextInt();

        A = new Long[X];
        B = new Long[Y];
        C = new Long[Z];

        for (int i = 0; i < X; i++){
            A[i] = scanner.nextLong();
        }
        for (int i = 0; i < Y; i++){
            B[i] = scanner.nextLong();
        }
        for (int i = 0; i < Z; i++){
            C[i] = scanner.nextLong();
        }
        Arrays.sort(A, Collections.reverseOrder());
        Arrays.sort(B, Collections.reverseOrder());
        Arrays.sort(C, Collections.reverseOrder());

        TreeSet<Pare> tree = new TreeSet<Pare>();
        tree.add(new Pare(0,0,0));
        for (int i = 0; i < K; i++) {
            Pare p = tree.last();
            tree.remove(p);
            System.out.println(p.sum());
            if (p.x + 1 < X) {
                tree.add(new Pare(p.x+1,p.y,p.z));
            }
            if (p.y + 1 < Y) {
                tree.add(new Pare(p.x,p.y+1,p.z));
            }
            if (p.z + 1 < Z) {
                tree.add(new Pare(p.x,p.y,p.z+1));
            }
        }

    }

    static class Pare implements Comparable{
        int x;
        int y;
        int z;
        long sum;

        Pare(int x,int y,int z){
            this.x = x;
            this.y = y;
            this.z = z;
            sum = A[x] + B[y] + C[z];
        }

        @Override
        public boolean equals(Object obj){
            Pare o = (Pare) obj;
            return this.x == o.x && this.y == o.y && this.z == o.z;
        }

        long sum() {
            return sum;
        }

        @Override
        public int compareTo(Object obj) {
            Pare p = (Pare)obj;
            long lres = sum() - p.sum();
            if (((long)Integer.MAX_VALUE) < lres) {
                lres = lres / ((long)Integer.MAX_VALUE);
            } else if (lres < Integer.MIN_VALUE) {
                lres = lres / ((long)Integer.MAX_VALUE);
            }
            int res = (int)(lres);
            if (res == 0) {
                res = (x == p.x && y == p.y && z == p.z) ? 0 : 1;
            }
            return res;
        }
    }
}


