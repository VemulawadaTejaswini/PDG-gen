import java.math.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static final int modnum = 1000000007;

    public static void main(String[] args) {
        ArrayList<Node> node = new ArrayList<Node>();
        ArrayList<Integer> costs = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sumCost = 0;

        for (int i = 1; i <= N; i++) {
            node.add(new Node(i));
        }

        int[] ed1 = new int[N];
        int[] ed2 = new int[N];

        for (int i = 1; i < N; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            ed1[i-1]=p1;
            ed2[i-1]=p2;
            node.get(p1 - 1).addEdge(node.get(p2 - 1));
            node.get(p2 - 1).addEdge(node.get(p1 - 1));
        }

        for (int i = 0; i < N; i++) {
            costs.add(sc.nextInt());
        }

        Collections.sort(costs,Comparator.reverseOrder());

        ArrayList<Integer> costs1 = new ArrayList<Integer>(costs);
        ArrayList<Integer> costs2 = new ArrayList<Integer>(costs);

        node.get(0).setParent(null, 0, costs1, costs2);

        // long sum1 = 0;
        // for (int i = 0; i < N-1; i++) {
        //     sum1 += Math.min(node.get(ed1[i] - 1).cost1, node.get(ed2[i] - 1).cost1);
        // }
        // long sum2 = 0;
        // for (int i = 0; i < N-1; i++) {
        //     sum2 += Math.min(node.get(ed1[i] - 1).cost2, node.get(ed2[i] - 1).cost2);
        // }

        // sumCost = Math.max(sum1, sum2);

        for (int i = 0; i < N-1; i++) {
                sumCost += Math.min(node.get(ed1[i] - 1).cost, node.get(ed2[i] - 1).cost);
            }

        System.out.println(sumCost);
        // if (sum1 < sum2)
            for (int i = 0; i < N; i++) {
                System.out.print(node.get(i).cost + " ");
            }
        // else
        //     for (int i = 0; i < N; i++) {
        //         System.out.print(node.get(i).cost2 + " ");
        //     }
        System.out.println();

    }
}

class Node {
    final int number;
    boolean isBlack = false;
    Node parent;
    int cost;
    int cost1;
    int cost2;

    ArrayList<Node> edge = new ArrayList<Node>();

    Node(int number) {
        this.number = number;
    }

    void addEdge(Node n) {
        edge.add(n);
    }

    void setParent(Node p, int cnt, ArrayList<Integer> costs1, ArrayList<Integer> costs2) {
        parent = p;
        cost=costs1.get(0);
        costs1.remove(0);
        // if (cnt % 2 == 0) {
        //     isBlack = true;

        //     cost1 = costs1.get(0);
        //     costs1.remove(0);

        //     cost2 = costs2.get(costs2.size() - 1);
        //     costs2.remove(costs2.size() - 1);
        // } else {
        //     isBlack = false;

        //     cost2 = costs2.get(0);
        //     costs2.remove(0);

        //     cost1 = costs1.get(costs1.size() - 1);
        //     costs1.remove(costs1.size() - 1);
        // }
        for (int i = 0; i < edge.size(); i++) {
            if (edge.get(i) == p)
                continue;
            edge.get(i).setParent(this, cnt + 1, costs1, costs2);
        }
    }

}