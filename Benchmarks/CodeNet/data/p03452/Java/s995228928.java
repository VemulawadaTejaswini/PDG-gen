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


        for (int i = 0; i  < M; i++) {

            int a = s.nextInt();

            int b = s.nextInt();

            int w = s.nextInt();

            if (a == b) {

                if (w ==0) continue;

                else {

                    System.out.print("No");

                    return;
                }
            }

            if (nodes[a] != null && nodes[b] != null) {

                int result1 = dfs(nodes[a], b);

                if (result1 != -1) {

                    if (result1 == w) {

                        continue;

                    } else {
                        System.out.print("No");
                        return;
                    }

                } else {

                    int result2 = dfs(nodes[b], a);

                    if (result2 != -1) {

                        if (result2 != 0 || w != 0) {

                            System.out.print("No");
                            return;
                        } else {

                            continue;
                        }

                    }
                }

            } else {

                if (nodes[a] == null) nodes[a] = new Node(a);

                if (nodes[b] == null) nodes[b] = new Node(b);


            }
            nodes[a].addChild(nodes[b],w);



        }

        System.out.print("Yes");

    }


    public  static int dfs(Node n1, int index) {

        if (n1.index == index ) return 0;

        else if (n1.childs.isEmpty()) return -1;

        int result = -1;

        for (Edge e : n1.childs) {

            Node k = e.to;

            if (k == n1) continue;

            int localw = e.num;

            int re=dfs(k, index);

            if (re != -1)  result = re+ e.num;
        }

        return result;
    }

}