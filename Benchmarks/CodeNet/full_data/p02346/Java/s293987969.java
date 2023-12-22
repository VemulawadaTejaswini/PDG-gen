import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Solver().solve(new Scanner(System.in));
//        new Solver().solve(new Scanner(ex));
    }

    private static final String ex = "5 7\n" +
            "0 2 3\n" +
            "0 3 1\n" +
            "0 4 4\n" +
            "1 1 2\n" +
            "1 1 3\n" +
            "1 3 3\n" +
            "1 1 5";
}

class Solver {
    Solver() {}

    void solve(Scanner scanner) {
        int[] splitInt = splitInt(scanner.nextLine());
        int n = splitInt[0];
        int q = splitInt[1];

        SegmentTree tree = new SegmentTree(new int[n]);

        for (int i = 0 ; i < q; i ++) {
            String[] split = scanner.nextLine().split(" ");
            int com = Integer.parseInt(split[0]);
            int x = Integer.parseInt(split[1]);
            int y = Integer.parseInt(split[2]);

            if (com == 0) {
                tree.add(y - 1, x);
            } else {
                System.out.println(tree.query(x - 1, y - 1));
            }
        }
    }

    private int[] splitInt(String s) {
        String[] split = s.split(" ");
        int[] splitInt = new int[split.length];
        for (int i = 0; i < split.length; i ++) {
            splitInt[i] = Integer.parseInt(split[i]);
        }
        return splitInt;
    }
}


class SegmentTree {
    Node root;

    SegmentTree(int[] nums) {
        List<Node> nodes = new ArrayList<>();

        for (int i = 0; i < nums.length; i ++) {
            nodes.add(new Node(nums[i], i, i + 1, null, null));
        }

        while (nodes.size() > 1) {
            List<Node> upperNodes = new ArrayList<>();

            for (int i = 0; 2 * i < nodes.size(); i ++) {
                Node left = nodes.get(2 * i);
                if (nodes.size() == 2 * i + 1) {
                    upperNodes.add(new Node(left.num, left.from, left.to, left, null));
                    break;
                }
                Node right = nodes.get(2 * i + 1);

                upperNodes.add(new Node(left.num + right.num, left.from, right.to, left, right));
            }

            nodes = upperNodes;
        }

        root = nodes.get(0);
    }

    int query(int from, int to) {
        return root.query(from, to);
    }

    void add(int num, int i) {
        root.add(num, i);
    }
}

class Node {
    int num;
    int from;
    int to;
    Node left;
    Node right;

    Node(int num, int from, int to, Node left, Node right) {
        this.num = num;
        this.from = from;
        this.to = to;
        this.left = left;
        this.right = right;
    }

    void add(int num, int i) {
        this.num += num;
        if (this.left == null && this.right == null) return;
        else if (this.left.from <= i && i < this.left.to) {
            this.left.add(num, i);
        } else if (right != null) {
            this.right.add(num, i);
        }
    }

    int query(int from, int to) {
        if (this.from == from && this.to == to) return num;

        int leftSum = (left.from <= from && from < left.to) ? left.query(from, left.to) : 0;
        int rightSum = (right.from < to && to <= right.to) ? right.query(right.from, to) : 0;

        return leftSum + rightSum;
    }
}