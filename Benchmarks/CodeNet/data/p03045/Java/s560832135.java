import java.util.*;

public class Main {
    private static int[] p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int X = sc.nextInt()-1;
            int Y = sc.nextInt()-1;
            int Z = sc.nextInt();
            unite(X, Y);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(p[i]);
        }

        //System.out.println(Arrays.toString(p));
        System.out.println(set.size());
    }

    private static int root(int x) {
        if (p[x] == x) {
            return x;
        }

        p[x] = root(p[x]);

        return p[x];
    }

    private static void unite(int x, int y) {
        int rootX = root(x);
        int rootY = root(y);
        p[rootY] = rootX;
    }
}

