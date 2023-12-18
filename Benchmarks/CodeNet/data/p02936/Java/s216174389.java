import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Node[] nodes;
    private static Point[] points;
    private static Tree tree;
    private static long startTime = 0;

    private static class Node {
        int startId;
        int endId;
        public Node(int startId, int endId) {
            this.startId = startId;
            this.endId = endId;
        }
    }

    private static class Point {
        int count;
        public Point(int count) {
            this.count = count;
        }
    }

    private static class Operation {
        int rootId;
        int addCount;
        public Operation(int rootId, int addCount) {
            this.rootId = rootId;
            this.addCount = addCount;
        }
    }

    private static class Tree {
        Tree[] children;
        int endId;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] mainParams = scanner.nextLine().split(" ");
        int paramN = Integer.parseInt(mainParams[0]);
        int paramQ = Integer.parseInt(mainParams[1]);
        points = new Point[paramN];
        nodes = new Node[paramN - 1];
        Operation[] operations = new Operation[paramQ];

        for (int i = 0; i < nodes.length; i++) {
            String[] data = scanner.nextLine().split(" ");
            nodes[i] = new Node(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
        }

        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(0);
        }

        for (int i = 0; i < operations.length; i++) {
            String[] data = scanner.nextLine().split(" ");
            operations[i] = new Operation(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
            points[operations[i].rootId - 1].count += operations[i].addCount;
        }
        startTime = System.currentTimeMillis();

        scanner.close();

        tree = new Tree();
        makeTree(1, tree);

        addCountToPoint(tree, points[0].count);

        String[] outs = new String[points.length];
        for (int i = 0; i < points.length; i++) {
            outs[i] = String.valueOf(points[i].count);
        }

        print(String.join(" ", outs));
    }

    private static void makeTree(int rootId, Tree t) {
        ArrayList<Tree> array = new ArrayList<Tree>();
        for (Node node: nodes) {
            int si = node.startId;
            if (si < rootId) {
                continue;
            } else if (si == rootId) {
                Tree currentTree = new Tree();
                currentTree.endId = node.endId;
                array.add(currentTree);
                makeTree(node.endId, currentTree);
            } else {
                break;
            }
        }
        Tree[] trees = array.toArray(new Tree[array.size()]);
        t.children = trees;
    }

    private static void addCountToPoint(Tree t, int addCount) {
        if (t.endId != 0) {
            points[t.endId - 1].count += addCount;
        }
        if (t.children != null) {
            for (Tree child: t.children) {
                if (t.endId != 0) {
                    addCountToPoint(child, points[t.endId - 1].count);
                } else {
                    addCountToPoint(child, points[0].count);
                }
            }
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void currentTime(String message) {
        print(message);
        System.out.println(System.currentTimeMillis() - startTime);
    }
}