import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Node[] nodes;
    private static Point[] points;

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

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] mainParams = scanner.nextLine().split(" ");
        int paramN = Integer.parseInt(mainParams[0]);
        int paramQ = Integer.parseInt(mainParams[1]);
        Point[] pointsTmp = new Point[paramN];
        Node[] nodesTmp = new Node[paramN - 1];
        Operation[] operations = new Operation[paramQ];

        for (int i = 0; i < nodesTmp.length; i++) {
            String[] data = scanner.nextLine().split(" ");
            nodesTmp[i] = new Node(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
        }

        for (int i = 0; i < operations.length; i++) {
            String[] data = scanner.nextLine().split(" ");
            operations[i] = new Operation(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
        }

        scanner.close();

        for (int i = 0; i < pointsTmp.length; i++) {
            pointsTmp[i] = new Point(0);
        }

        nodes = nodesTmp;
        points = pointsTmp;

        for (Operation op: operations) {
            points[op.rootId - 1].count += op.addCount;
        }

        addCountToPoint(1);

        String out = "";
        for (int i = 0; i < points.length; i++) {
            if (i == points.length - 1) {
                out += String.valueOf(points[i].count);
            } else {
                out += String.valueOf(points[i].count) + " ";
            }
        }

        print(out);
    }

    private static void addCountToPoint(int rootId) {
        for (Node node: nodes) {
            if (node.startId == rootId) {
                points[node.endId - 1].count += points[node.startId - 1].count;
                addCountToPoint(node.endId);
            }
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}