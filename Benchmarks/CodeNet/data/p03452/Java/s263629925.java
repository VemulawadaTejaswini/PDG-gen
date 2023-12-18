import java.util.*;

public final class Main {


    static int N;

    static int M;



    static class Node {

        List<Edge> childs = new LinkedList<>();

        int index;

        public void addChild(Node n , int num) {

            Edge e=  new Edge(n,num);

            childs.add(e);
        }

        public Node(int index) {

            this.index = index;
        }

    }

    static class Edge {

        Node from;

        Node to;

        int num;

        public Edge( Node to ,int num) {

            this.to = to;

            this.num = num;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        N = s.nextInt();

        M = s.nextInt();

        Node[] nodes = new Node[N+1];

        for (int i = 1; i <= N; i++) {

            nodes[i] = new Node(i);
        }

        for (int i = 0; i  < M; i++) {


            int a = s.nextInt();

            int b = s.nextInt();

            int w = s.nextInt();

            boolean check[] = new boolean[N+1];
            int result = dfs(nodes[a],b,check);

            if (result!= -1 && result != w) {

                System.out.print("No");
                return;
            }

            int result2 = dfs(nodes[b], a,check);

            if (result2 != -1 && -1 * result2 != w)  {

                System.out.print("No");

                return;
            }

            nodes[a].addChild(nodes[b], w);
        }

        System.out.print("Yes");

    }


    public  static int dfs(Node n1, int index, boolean[] check) {

        if (n1.index == index ) return 0;

        else if (n1.childs.isEmpty()) return -1;

        int result = -1;

        check[n1.index] = true;

        for (Edge e : n1.childs) {

            Node k = e.to;

            if (check[k.index] == true) continue;

            if (k == n1) continue;

            int localw = e.num;

            int re=dfs(k, index, check);

            if (re != -1)  result = re+ e.num;
        }

        check[n1.index] = false;

        return result;
    }

}