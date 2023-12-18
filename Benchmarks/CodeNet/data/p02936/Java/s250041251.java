import java.util.*;

public class Ki{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        Node nodes[] = new Node[n];
        for (int i=0; i<n; i++) nodes[i] = new Node();
        for (int i=0; i<n-1; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            nodes[a].neighbors.add(nodes[b]);
            nodes[b].neighbors.add(nodes[a]);
        }

        for (int i=0; i<q; i++){
            int p = sc.nextInt()-1;
            nodes[p].counter += sc.nextInt();
        }

        dfs(null, nodes[0], 0);
        for (int i=0; i<n; i++){
            System.out.print(nodes[i].counter+" ");
        }


    }

    private static void dfs(Node parent, Node node, long sum){
        sum += node.offset;
        node.counter += sum;
        for (Node n: node.neighbors){
            if (n != parent){
                dfs(node, n, node.counter);
            }
        }
    }


    private static class Node{
        List<Node> neighbors = new ArrayList<>();
        long offset;
        long counter;
    }
}