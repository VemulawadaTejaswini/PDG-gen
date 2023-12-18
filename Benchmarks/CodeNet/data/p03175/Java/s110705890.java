import java.util.*;

public class Main {

    static int MOD = 1_000_000_007;
    private static long[] compute(Node node) {
        long w = 1;
        long b = 1;
        for(Node n:node.children){
            long[] count = compute(n);
            w = (w*(count[0]+count[1]))%MOD;
            b = (b*count[0])%MOD;
        }
        long[] count = new long[2];
        count[0] = w; // white
        count[1] = b; // black
        //System.out.println(node.id+":"+Arrays.toString(count));
        return count;
    }

    private static Node createTree(Node[] nodeList) {
        Queue<Node> que = new ArrayDeque<Node>();
        que.add(nodeList[0]);
        nodeList[0].visited = true;
        while(!que.isEmpty()){
            Node node = que.remove();
            for(Node n: node.neighbors){
                if(!n.visited){
                    node.children.add(n);
                    n.parent = node;
                    n.visited = true;
                    que.add(n);
                }
            }
        }
        return nodeList[0];
    }

    static class Node{
        int id;
        Node parent;
        Set<Node> children = new HashSet<Node>();
        Set<Node> neighbors = new HashSet<Node>();
        boolean visited = false;
        Node(int id){
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Node[] nodeList = new Node[N];
        for(int i=0; i<N; i++){
            nodeList[i] = new Node(i);
        }
        for(int i=0; i<N-1; i++){
            Node x = nodeList[sc.nextInt()-1];
            Node y = nodeList[sc.nextInt()-1];
            x.neighbors.add(y);
            y.neighbors.add(x);
        }

        Node root = createTree(nodeList);
        System.out.println((compute(nodeList[0])[0]+compute(nodeList[0])[1])%MOD);
    }
}