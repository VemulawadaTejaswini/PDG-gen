import java.util.*;

public class Main {

    private static int N;
    private static int[] A;
    private static int[] B;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = new int[N];
        B = new int[N];
        for (int i = 0; i < N-1; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        System.out.println(solve());
    }

    private static String solve() {
        Rin r = mkRin();
        Path path = findPath(r);

        List<Integer> nodes = path.asList();

        boolean fene = true;
        while(nodes.size() > 2) {
            if( fene ) {
                nodes.remove(0);
                fene = false;
            } else {
                nodes.remove(nodes.size() - 1);
                fene = true;
            }
        }

        int cut1 = nodes.get(0);
        int cut2 = nodes.get(1);

        UnionFind uf = new UnionFind(N);
        for (int i = 0; i < N-1; i++) {
            int a = A[i];
            int b = B[i];

            if( cut1 == a && cut2 == b || cut1 == b && cut2 == a ) {
                continue;
            }

            uf.unite(a-1, b-1);
        }

        int fRoot = uf.root(0);
        int f = 0;
        for (int i = 0; i < N; i++) {
            if( uf.root(i) == fRoot ) {
                f++;
            }
        }

        if( f > N-f ) return "Fennec";
        else return "Sunuke";

    }

    private static Path findPath(Rin r) {
        List<Path> current = Collections.singletonList(Path.single(1));
        while(true) {
            List<Path> next = new ArrayList<>();
            for (Path path : current) {
                for (Integer n : r.get(path.last())) {
                    if( n == N ) {
                        return path.add(n);
                    } else {
                        next.add(path.add(n));
                    }
                }
            }
            current = next;
        }
    }

    private static Rin mkRin() {
        Rin r = new Rin(N);
        for (int i = 0; i < N-1; i++) {
            r.set(A[i], B[i]);
        }
        return r;
    }

    // 隣接リスト
    private static class Rin {

        private final List[] array;

        public Rin(int n) {
            array = new List[n];
        }

        public void set(int a, int b) {
            get(a).add(b);
            get(b).add(a);
        }

        public List<Integer> get(int n) {
            if( array[n - 1] == null ) {
                array[n - 1] = new ArrayList();
            }
            //noinspection unchecked
            return (List<Integer>)array[n - 1];
        }
    }

    abstract public static class Path {

        public static Path single(int n) {
            return new Single(n);
        }

        abstract public List<Integer> asList();

        public Path add(int n) {
            return new Multi(this, n);
        }

        abstract public int last();
    }

    public static class Single extends Path {
        private int n;

        public Single(int n) {
            this.n = n;
        }

        @Override
        public List<Integer> asList() {
            List<Integer> list = new ArrayList<>();
            list.add(n);
            return list;
        }

        @Override
        public int last() {
            return n;
        }
    }

    public static class Multi extends Path {

        private Path path;
        private int n;

        public Multi(Path path, int n) {
            this.path = path;
            this.n = n;
        }

        @Override
        public List<Integer> asList() {
            List<Integer> list = path.asList();
            list.add(n);
            return list;
        }

        @Override
        public int last() {
            return n;
        }
    }

    static class UnionFind {

        private int[] parent;
        private int[] rank;

        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int root(int x) {
            if( parent[x] == x ) {
                return x;
            } else {
                parent[x] = root(parent[x]);
                return parent[x];
            }
        }

        void unite(int x, int y) {
            x = root(x);
            y = root(y);
            if( x == y ) return;

            if( rank[x] < rank[y] ) {
                parent[x] = y;
            } else {
                parent[y] = x;
                if( rank[x] == rank[y]) rank[x]++;
            }
        }
    }
}
