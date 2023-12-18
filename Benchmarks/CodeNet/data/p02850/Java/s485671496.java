
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;
    static int MAX;

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final ArrayList<Node> list = new ArrayList<Node>(N);
        final ArrayList<Bridge> bridge = new ArrayList<Bridge>(N);
        for (int i = 0; i < N; i++) {
            list.add(new Node(i));
        }

        for (int i = 0; i < N - 1; i++) {
            final int a = sc.nextInt()-1;
            final int b = sc.nextInt()-1;
            final Bridge edge = new Bridge(list.get(a), list.get(b));
            list.get(a).addEdge(edge);
            list.get(b).addEdge(edge);
            bridge.add(edge);
        }

        MAX = 0;
        Node st = null;
        for (int i = 0; i < N; i++) {
            if (MAX < list.get(i).edge.size()) {
                MAX = list.get(i).edge.size();
                st = list.get(i);
            }
        }

        st.setFirst();

        System.out.println(MAX);
        for (int i = 0; i < N - 1; i++) {
            System.out.println(bridge.get(i).col);
        }
    }
}

class Bridge {
    Node from;
    Node to;
    int col;

    Bridge(final Node from, final Node to) {
        this.from = from;
        this.to = to;
    }

    boolean contains(Node node) {
        if (from.equals(node) || to.equals(node))
            return true;
        else
            return false;
    }

    /**
     * @param col the col to set
     */
    public void setCol(final int col) {
        this.col = col;
    }
}

class Node {
    final int number;
    Node parent;
    boolean isLeaf = true;
    ArrayList<Bridge> edge = new ArrayList<Bridge>();

    Node(final int number) {
        this.number = number;
    }

    void addEdge(final Bridge bridge) {
        edge.add(bridge);
        if (edge.size() <= 1)
            isLeaf = true;
        else
            isLeaf = false;
    }

    void setFirst() {
        int cnt = 1;
        for (int i = 0; i < edge.size(); i++) {
            final Bridge next = edge.get(i);
            if (next.from.equals(this))
                next.to.setParent(this, next, (++cnt) % Main.MAX);
            else
                next.from.setParent(this, next, (++cnt) % Main.MAX);
        }
    }

    void setParent(Node from, final Bridge bridge,int cnt) {
        parent = from;
        bridge.setCol(cnt+1);
        for (int i = 0; i < edge.size(); i++) {
            final Bridge next = edge.get(i);
            if (next.contains(parent))
                continue;
            if (next.from.equals(this))
                next.to.setParent(this, next, (++cnt) % Main.MAX);
            else
                next.from.setParent(this, next, (++cnt) % Main.MAX);
        }
    }
}