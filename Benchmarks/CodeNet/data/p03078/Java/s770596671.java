import java.util.*;

public class Main {

    static int X;
    static int Y;
    static int Z;

    static Long[] A;
    static Long[] B;
    static Long[] C;
    static TreeSet<Pare> tree = new TreeSet<>();
    static HashSet<Pare> done = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        X = scanner.nextInt();
        Y = scanner.nextInt();
        Z = scanner.nextInt();
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


        tree.add(new Pare(0,0,0));
        for (int i = 0; i < K; i++) {
            Pare p = tree.last();
            tree.remove(p);
            System.out.println(p.sum());
            add(p.x+1,p.y,p.z);
            add(p.x,p.y+1,p.z);
            add(p.x,p.y,p.z+1);
        }

    }

    static void add(int x, int y, int z) {
        if (x < X && y < Y && z < Z) {
            Pare p = new Pare(x, y, z);
            if (!done.contains(p)) {
                tree.add(p);
                done.add(p);
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
            if ((Integer.MAX_VALUE) < lres) {
                lres = Integer.MAX_VALUE;
            } else if (lres < Integer.MIN_VALUE) {
                lres = Integer.MIN_VALUE;
            }
            int res = (int)(lres);
            if (res == 0) {
                res = (x == p.x && y == p.y && z == p.z) ? 0 : (x+y+z == p.x+p.y+p.z) ? x*3+y*2+z - (p.x*3+p.y*2+p.z): x+y+z - (p.x+p.y+p.z);
            }
            return res;
        }
    }
}


