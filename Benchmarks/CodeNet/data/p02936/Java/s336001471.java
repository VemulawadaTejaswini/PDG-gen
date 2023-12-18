import java.util.*;

public class Main {

    public static int[] countList;
    public static Node[] nodeArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();

        countList = new int[N];
        nodeArray = new Node[N];

        for (int i = 0; i < N; i++) {
            nodeArray[i] = new Main.Node();
        }

        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            nodeArray[b - 1].neighborArray.add(nodeArray[a - 1]);
            nodeArray[a - 1].neighborArray.add(nodeArray[b - 1]);
        }

        for (int i = 0; i < Q; i++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            nodeArray[p - 1].offset += x;
        }

        dfs(null, nodeArray[0], 0);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(nodeArray[i].count).append(" ");
        }
        System.out.println(sb.toString());

    }

    public static void dfs(Node parent, Node node, int sum){
        sum += node.offset;
        node.count = sum;
        for(Node neighbor: node.neighborArray){
            if(neighbor != parent){
                dfs(node, neighbor, sum);
            }
        }
    }

    static class Node {

        private List<Node> neighborArray = new LinkedList<>();
        private int offset = 0;
        private int count = 0;

    }
}