import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static Scanner sc;

    private static void nextArr(int[] h) {
        for(int i = 0; i < h.length; i++) h[i] = sc.nextInt();
    }

    private static int nextInt() {
        return sc.nextInt();
    }

    private static void print(Object... vals) {
        for(int i = 0; i < vals.length; i++) {
            if (i != vals.length - 1) {
                System.out.print(vals[i] + ",");
            } else {
                System.out.print(vals[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vertex[] tree = new Vertex[n];
        for(int i = 0; i < n; i++) tree[i] = new Vertex(i);
        for(int i = 0; i < m; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            tree[v1 - 1].addEdge(tree[v2 - 1]);
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, tree[i].getMax());
        }
        print(ans);
    }

    static class Vertex {
        int id;
        ArrayList<Vertex> edges;
        int max;

        public Vertex(int id) {
            this.id = id;
            this.edges = new ArrayList<Vertex>();
            this.max = Integer.MIN_VALUE;
        }

        public void addEdge(Vertex other) {
            this.edges.add(other);
        }

        public int getMax() {
            if(this.max != Integer.MIN_VALUE) return this.max;
            if(this.edges.size() == 0) {
                this.max = 0;
                return this.max;
            }
            for(Vertex other: this.edges) {
                this.max = Math.max(this.max, other.getMax() + 1);
            }
            return this.max;
        }

    }
}
