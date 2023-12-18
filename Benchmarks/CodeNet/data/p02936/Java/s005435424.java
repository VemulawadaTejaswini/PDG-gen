import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        Node[] ary = new Node[n];
        for (int i = 0; i < n; i++) {
            ary[i] = new Node(0);
        }
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            ary[a - 1].getChild().add(ary[b - 1]);
        }
        for (int i = 0; i < q; i++) {
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            ary[p - 1].setCount(x);
            sumCount(ary[p - 1], x);
        }
        for (Node node : ary) {
            System.out.print(node.getCount() + " ");
        }
    }

    static void sumCount(Node p, int cnt) {
        ArrayList<Node> child = p.getChild();
        for (Node n : child) {
            n.setCount(cnt);
            if (n.getChild().size() != 0) {
                sumCount(n, cnt);
            }
        }
    }
}

class Node {
    ArrayList<Node> child;

    long count;

    Node(int count) {
        this.count = count;
        child = new ArrayList<>();
    }

    public long getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public ArrayList<Node> getChild() {
        return child;
    }

    public void setChild(Node child) {
        this.child.add(child);
    }

}