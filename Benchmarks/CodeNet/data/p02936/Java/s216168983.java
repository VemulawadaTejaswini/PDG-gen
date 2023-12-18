import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static int[][] nodes;
    private static int[] points;
    private static Tree tree;
    private static long startTime = 0;
    private static int paramN = 0;

    private static class Tree {
        ArrayList<Tree> children;
        int endId;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] mainParams = scanner.nextLine().split(" ");
        paramN = Integer.parseInt(mainParams[0]);
        int paramQ = Integer.parseInt(mainParams[1]);
        points = new int[paramN];
        nodes = new int[paramN][paramN + 1];

        for (int i = 0; i < paramN - 1; i++) {
            String[] data = scanner.nextLine().split(" ");
            int s = Integer.parseInt(data[0]);
            int index = nodes[s][0];
            nodes[s][index + 1] = Integer.parseInt(data[1]);
            nodes[s][0] += 1;
        }

        for (int i = 0; i < paramQ; i++) {
            String[] data = scanner.nextLine().split(" ");
            points[Integer.parseInt(data[0]) - 1] += Integer.parseInt(data[1]);
        }
        startTime = System.currentTimeMillis();

        scanner.close();

        tree = new Tree();
        try {
            makeTree(1, tree);
        } catch (Exception e) {
            //TODO: handle exception
        }

        addCountToPoint(tree, points[0]);

        String[] outs = new String[points.length];
        for (int i = 0; i < points.length; i++) {
            outs[i] = String.valueOf(points[i]);
        }

        print(String.join(" ", outs));
    }

    private static void makeTree(int rootId, Tree t) {
        if (rootId < nodes.length) {
            ArrayList<Tree> array = new ArrayList<Tree>();

            int[] list = nodes[rootId];
            for (int i = 1; i < list.length; i++) {
                int e = list[i];
                if (e != 0) {
                    Tree currentTree = new Tree();
                    currentTree.endId = e;
                    array.add(currentTree);
                    makeTree(e, currentTree);
                } else {
                    break;
                }
            }

            if (array.size() > 0) {
                t.children = array;
            }
        }
    }

    private static void addCountToPoint(Tree t, int addCount) {
        if (t.endId != 0) {
            points[t.endId - 1] += addCount;
        }
        if (t.children != null) {
            ArrayList<Tree> c001 = t.children;
            for (int i = 0; i < c001.size(); i++) {
                if (t.endId != 0) {
                    addCountToPoint(c001.get(i), points[t.endId - 1]);
                } else {
                    addCountToPoint(c001.get(i), points[0]);
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