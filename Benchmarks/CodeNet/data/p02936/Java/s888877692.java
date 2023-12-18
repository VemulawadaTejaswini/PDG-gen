
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
            tree[from].children.add(to);
        }
        for (int i = 0; i < Q; i++) {
            int target = sc.nextInt() - 1;
            int add = sc.nextInt();
            recursiveCount(tree, target, add);
        }
        sc.close();
        for (int i = 0; i < N; i++) {
            System.out.print(tree[i].counter);
            System.out.println(" ");
        }
    }

    private static void recursiveCount(Node[] tree, int target, int value) {
        Node targetNode = tree[target];
        targetNode.counter += value;
        for (int i = 0; i < targetNode.children.size(); i++) {
            recursiveCount(tree, targetNode.children.get(i), value);
        }
    }

    static class Node {
        int counter = 0;
        ArrayList<Integer> children = new ArrayList<Integer>();
    }
}