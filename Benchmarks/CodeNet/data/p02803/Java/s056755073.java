import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());

        String[] F = new String[H];
        for (int h = 0; h < H; h++) {
            F[h] = sc.next();
        }

        Graph g = new Graph(H, W, F);
        int res = 0;
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                if (F[h].charAt(w) != '.') {
                    continue;
                }
                
                int r = g.wfs(h, w);
                if (r > res) {
                    res = r;
                }
            }
        }
        
        System.out.println(res);
    }
}

class Graph {
    private int H;
    private int W;
    private String[] F;
    
    public Graph(int H, int W, String[] F) {
        this.H = H;
        this.W = W;
        this.F = F;
    }
    
    class Node {
        public int h;
        public int w;
        public int c;

        public Node(int h, int w, int c) {
            this.h = h;
            this.w = w;
            this.c = c;
        }
    }
    
    public int wfs(int h0, int w0) {
        int[][] cost = new int[H][W];
        for (int h = 0; h < H; h++) {
            Arrays.fill(cost[h], -1);
        }
        
        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(h0, w0, 0));
        while (!q.isEmpty()) {
            Node n = q.poll();
            int h = n.h;
            int w = n.w;

            if (cost[h][w] != -1) {
                continue;
            }
            
            cost[h][w] = n.c;
            
            if (h != 0 && F[h - 1].charAt(w) == '.' && cost[h - 1][w] == -1) {
                q.add(new Node(h - 1, w, n.c + 1));
            }

            if (h != H - 1 && F[h + 1].charAt(w) == '.' && cost[h + 1][w] == -1) {
                q.add(new Node(h + 1, w, n.c + 1));
            }            

            if (w != 0 && F[h].charAt(w - 1) == '.' && cost[h][w - 1] == -1) {
                q.add(new Node(h, w - 1, n.c + 1));
            }           
            
            if (w != W - 1 && F[h].charAt(w + 1) == '.' && cost[h][w + 1] == -1) {
                q.add(new Node(h, w + 1, n.c + 1));
            } 
        }
        
        int res = 0;
        for (int h = 0; h < H; h++) {
            int r = Arrays.stream(cost[h]).max().getAsInt();
            if (r > res) {
                res = r;
            }
        }
        
        return res;
    }
}


