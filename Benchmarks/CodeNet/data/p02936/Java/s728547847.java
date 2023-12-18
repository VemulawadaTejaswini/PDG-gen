import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static ArrayList<Node> nodeList = new ArrayList<Node>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int Q = sc.nextInt();
        for (int i = 0; i < N; i++) {
            nodeList.add(new Node(i));
        }

        for (int i = 1; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodeList.get(a - 1).addEdge(nodeList.get(b - 1));
        }

        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            nodeList.get(p - 1).count(x);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(nodeList.get(i).cout + " ");
        }
        System.out.println();
    }
}

class UnionFindTree {
    int[] parent; // インデックスにとノードを対応させ、そのルートノードのインデックスを格納
    int[] rank; // parentと同様に、木の高さを格納

    public UnionFindTree(int size) {
        this.parent = new int[size];
        this.rank = new int[size];
        for (int i = 0; i < size; i++) {
            makeSet(i);
        }
    }

    public void makeSet(int i) {
        parent[i] = i;
        rank[i] = 0; // 集合の高さ
    }

    public void union(int x, int y) {
        int xRoot = find(x);
        int yRoot = find(y);

        // xが属する木の方が大きい場合
        if (rank[xRoot] > rank[yRoot]) {
            parent[yRoot] = xRoot; // yの親をxに更新
        } else if (rank[xRoot] < rank[yRoot]) {
            parent[xRoot] = yRoot;
        } else if (xRoot != yRoot) {
            parent[yRoot] = xRoot;
            rank[xRoot]++; // 同じ高さの木がルートの子として着くから大きさ++;
        }
    }

    // 引数の属する木のルートのidを返す
    public int find(int i) {
        if (i != parent[i]) {
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    // 同じ木に属しているか
    public boolean same(int x, int y) {
        return find(x) == find(y);
    }
}

class Node {
    final int number;
    int cout = 0;
    Node parent;
    boolean isLeaf = true;
    ArrayList<Node> edge = new ArrayList<Node>();

    Node(int number) {
        this.number = number;
    }

    void addEdge(Node n) {
        edge.add(n);
    }

    void setParent(Node p) {
        parent = p;
        for (int i = 0; i < edge.size(); i++) {
            if (edge.get(i).equals(p))
                continue;
            edge.get(i).setParent(this);
        }
    }

    void count(int x) {
        cout += x;
        for (int i = 0; i < edge.size(); i++) {
            edge.get(i).count(x);
        }
    }
}