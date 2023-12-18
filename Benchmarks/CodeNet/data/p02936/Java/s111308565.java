import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        D_Ki();
    }

    private static class Node {
        long id;
        List<Node> children = new ArrayList<>();
        BigInteger counter = BigInteger.ZERO;

        Node(long id) {
            this.id = id;
        }

        void count(int number) {
            counter = counter.add(BigInteger.valueOf(number));

            for (Node child : children) {
                child.count(number);
            }
        }
    }

    private static void D_Ki() {

        final Scanner sc = new Scanner(System.in);
        final int numberOfNodes = sc.nextInt();
        final int numberOfOperations = sc.nextInt();

        final Node[] nodes = new Node[numberOfNodes];

        for (int i = 0; i < nodes.length - 1; i++) {
            int idOfNodeA = sc.nextInt();
            int idOfNodeB = sc.nextInt();

            if (nodes[idOfNodeA - 1] == null) {
                nodes[idOfNodeA - 1] = new Node(idOfNodeA);
            }
            if (nodes[idOfNodeB - 1] == null) {
                nodes[idOfNodeB - 1] = new Node(idOfNodeB);
            }

            nodes[idOfNodeA - 1].children.add(nodes[idOfNodeB - 1]);
        }

        for (int i = 0; i < numberOfOperations; i++) {
            int rootNodeIdOfTargetSubtree = sc.nextInt();
            int numberToBeAdded = sc.nextInt();

            nodes[rootNodeIdOfTargetSubtree - 1].count(numberToBeAdded);
        }

        final String answer = Arrays.stream(nodes)
                .map(node -> node.counter.toString())
                .collect(Collectors.joining(" "));

        System.out.print(answer);
    }
}
