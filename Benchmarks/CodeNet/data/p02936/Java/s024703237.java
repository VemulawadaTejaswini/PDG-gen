import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        Node[] tree = new Node[N];
        for (int i = 0; i < N; i++) {
            tree[i] = new Node();
        }
        for (int i = 0; i < N - 1; i++) {
            int from = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            tree[from].children.add(tree[to]);
        }
        for (int i = 0; i < Q; i++) {
            int target = sc.nextInt() - 1;
            int add = sc.nextInt();
            tree[target].childCounter += add;
        }
        for (int i = 0; i < N; i++) {
            if (tree[i].childCounter > 0) {
                recursiveCount(tree[i], tree[i].childCounter);
            }
        }
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(tree[i].counter);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }

    private static void recursiveCount(Node target, int value) {
        target.counter += value;
        for (int i = 0; i < target.children.size(); i++) {
            recursiveCount(target.children.get(i), value);
        }
    }

    static class Node {
        int counter = 0;
        int childCounter = 0;
        ArrayList<Node> children = new ArrayList<Node>();
    }
}