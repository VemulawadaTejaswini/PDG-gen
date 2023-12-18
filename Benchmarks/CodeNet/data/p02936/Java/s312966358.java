import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        List<Node> ary = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ary.add(new Node(i));
        }
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            ary.get(b - 1).setParent(ary.get(a - 1));;
        }
        for (int i = 0; i < q; i++) {
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            ary.get(p - 1).setCount(x);
        }
        for (Node node : ary) {
            System.out.print(node.getTotalCount() + " ");
        }
    }
}

class Node {
    Node parent;
    int number;
    int count;
    long ans;

    Node(int number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getTotalCount() {
        long cnt = 0;
        Node node = this;
        while (node != null) {
            cnt += node.count;
            node = node.parent;
        }
        ans = cnt;
        return cnt;
    }
}