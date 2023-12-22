import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();
        PriorityQueue<Node> q = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            String line;
            line = br.readLine();
            st = new StringTokenizer(line);
            int v = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            for (int i = 0; i < v; i++) {
                Node node = new Node();
                if (i == r) {
                    node.confirmed = true;
                    node.minCost = 0;
                    nodes.add(node);
                } else {
                    nodes.add(node);
                }
            }
            for (int i = 0; i < e; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                int s = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                int d = Integer.parseInt(st.nextToken());
                nodes.get(s).addEdge(t, d);
            }
            
            q.add(nodes.get(r));

            while (!q.isEmpty()) {
                Node confirmedNode = q.poll();
                confirmedNode.confirmed = true;
                for (int i = 0; i < confirmedNode.edgeTo.size(); i++) {
                    int to = confirmedNode.edgeTo.get(i);
                    int cost = confirmedNode.minCost + confirmedNode.edgeCost.get(i);
                    if (cost < nodes.get(to).minCost) {
                        nodes.get(to).minCost = cost;
                        if (!q.contains(nodes.get(to))) {
                            q.add(nodes.get(to));
                        }
                    }
                }
            }
            for (Node node : nodes) {
                if (node.minCost == Integer.MAX_VALUE) {
                    System.out.println("INF");
                } else {
                    System.out.println(node.minCost);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Node implements Comparable<Node> {
    ArrayList<Integer> edgeTo = new ArrayList<>();
    ArrayList<Integer> edgeCost = new ArrayList<>();
    int minCost;
    boolean confirmed;

    Node() {
        minCost = Integer.MAX_VALUE;
        confirmed = false;
    }
    
    void addEdge(int t, int d) {
        edgeTo.add(t);
        edgeCost.add(d);
    }

    @Override
    public int compareTo(Node that) {
        if (this.minCost < that.minCost) {
            return -1;
        } else if (this.minCost > that.minCost) {
            return 1;
        }
        return 0;
    }
}